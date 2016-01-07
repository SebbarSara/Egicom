package entites;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy="commande")
	private Collection<LigneCommande> items;
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	public Commande(int id_commande, Date date_commande,
			Collection<LigneCommande> items, Client client) {
		super();
		this.id_commande = id_commande;
		this.date_commande = date_commande;
		this.items = items;
		this.client = client;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_commande() {
		return id_commande;
	}

	public void setId_commande(int id_commande) {
		this.id_commande = id_commande;
	}

	public Date getDate_commande() {
		return date_commande;
	}

	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}

	public Collection<LigneCommande> getItems() {
		return items;
	}

	public void setItems(Collection<LigneCommande> items) {
		this.items = items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
