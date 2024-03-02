package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Supermarche> getSupermarcheParMotCle(String mc) {
		List<Supermarche> supers = new ArrayList<Supermarche>();
		Connection conn = SingletonConnection.getConnection();
		try {

			PreparedStatement ps = conn.prepareStatement("select * from supermarche where NOM_Supermarche LIKE ?");

			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Supermarche s = new Supermarche();
				s.setIdSupermarche(rs.getLong("ID_Supermarche"));
				s.setNomSupermarche(rs.getString("NOM_Supermarche"));
				s.setType(rs.getString("TYPE"));
				s.setLoc(rs.getString("Localisation_Supermarche"));
				s.setDateSup(rs.getDate("Date_de_creation"));
				supers.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supers;
	}

	@Override
	public void addSupermarche(Supermarche s) {
// TODO Auto-generated method stub
	}
}
