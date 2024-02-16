package dto;

public class Member {
	private String id;
	private String email;
	private String name;
	
	@Override
	public String toString() {
		return "LoginBoard [id=" + id + ", email=" + email + ", name=" + name + "]";
	}
	
	public Member(String id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
}
