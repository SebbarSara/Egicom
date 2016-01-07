package entites;


import java.util.Date;
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
public class Commande {
	
	@Id
	@GeneratedValue
	@Column
	private int id_commande;
	
	@Column
	private Date date_commande;
	
	@Column
	private double total;
	
	@Column
	private String description;
	
	@Column
	private String etat;
	
	@ManyToOne
	private User user;
	@ManyToMany(mappedBy = "commandes")
	private List<Produit> produis;
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Date date_commande, double total, String description,
			String etat) {
		super();
		this.date_commande = date_commande;
		this.total = total;
		this.description = description;
		this.etat = etat;
	}
	public int getId_commande() {
		return id_commande;
	}

	
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	
	

}
