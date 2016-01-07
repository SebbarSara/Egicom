package entites;

import java.io.Serializable;

public class Role implements Serializable {
	
	private long idRole;
	private String roleName;
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}

}
