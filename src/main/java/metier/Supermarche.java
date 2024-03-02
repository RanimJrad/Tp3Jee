package metier;

import java.io.Serializable;
import java.sql.Date;

public class Supermarche implements Serializable {

	private Long idSupermarche;
	private String nomSupermarche;
	private String type;
	private String loc;
	private Date dateSup;

	public Supermarche() {
		super();
	}

	public Supermarche(String nomSupermarche, String type) {
		super();
		this.nomSupermarche = nomSupermarche;
		this.type = type;
	}

	public Long getIdSupermarche() {
		return idSupermarche;
	}

	public void setIdSupermarche(Long idSupermarche) {
		this.idSupermarche = idSupermarche;
	}

	public String getNomSupermarche() {
		return nomSupermarche;
	}

	public void setNomSupermarche(String nomSupermarche) {
		this.nomSupermarche = nomSupermarche;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Date getDateSup() {
		return dateSup;
	}

	public void setDateSup(Date dateSup) {
		this.dateSup = dateSup;
	}

}
