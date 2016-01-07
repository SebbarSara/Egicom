package entites;

import java.util.Collection;

import javax.persistence.*;
@Entity
@Table(name="users")
public class User {
	 @Id
	 @GeneratedValue
	 @Column(name="user_id")
	private long idUser;
	 @Column(name="user_name")
	private String userName;
	private String password;
	private boolean activated;
	@OneToMany
	@JoinColumn(name="user_id")
	private Collection<Role> roles;
	public long getIdUser() {
		return idUser;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long idUser, String userName, String password, boolean activated) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.activated = activated;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	

}
