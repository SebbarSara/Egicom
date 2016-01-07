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
public class User {
	
	@Id
	@GeneratedValue
	@Column
	private int id_user;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String mail;
	
	@Column
	private String adresse;
	
	@Column
	private String login;
	
	@Column
	private String pasword;
	
	@Column
	private int compte;
	
	@Column
	private String cin;
	
	@Column
	private String ville;
	
	@Column
	private String telephone;
	
	@OneToMany(mappedBy = "user")
	private List<Commande> commandes;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String nom, String prenom, String mail, String adresse,
			String login, String pasword, int compte, String cin, String ville,
			String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.login = login;
		this.pasword = pasword;
		this.compte = compte;
		this.cin = cin;
		this.ville = ville;
		this.telephone = telephone;
	}
	public int getId_user() {
		return id_user;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public int getCompte() {
		return compte;
	}
	public void setCompte(int compte) {
		this.compte = compte;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	

}

