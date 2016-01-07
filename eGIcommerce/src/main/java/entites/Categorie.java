package entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Categorie {
	
	@Id
	@GeneratedValue
	@Column
	private int id_categorie;
	
	@Column
	private String lib_categorie;
	
	@OneToMany( mappedBy= "categorie")
	private List<Produit> produits;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String lib_categorie) {
		super();
		this.lib_categorie = lib_categorie;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	
	public String getLib_categorie() {
		return lib_categorie;
	}
	public void setLib_categorie(String lib_categorie) {
		this.lib_categorie = lib_categorie;
	}
	
	

}
