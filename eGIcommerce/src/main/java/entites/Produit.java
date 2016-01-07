package entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Produit {
	
	@Id
	@GeneratedValue
	@Column
	private int id_produit;
	
	@Column
	private double prix;
	
	@Column
	private int quantite;
	
	@Column
	private String description;
	
	@Column
	private String image_produit;
	@ManyToMany(mappedBy = "produits")
	private List<Commande> commades;
	
	@ManyToOne
	private Marque marque;
	
	@ManyToOne
	private Categorie categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(double prix, int quantite, String description,
			String image_produit) {
		super();
		this.prix = prix;
		this.quantite = quantite;
		this.description = description;
		this.image_produit = image_produit;
	}
	public int getId_produit() {
		return id_produit;
	}

	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage_produit() {
		return image_produit;
	}
	public void setImage_produit(String image_produit) {
		this.image_produit = image_produit;
	}
	
	

}
