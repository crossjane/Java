package _05_class;


//DTO : Data Transfer Object, VO : Value Object, Entity

public class User {
	
	private long id ; 
	private String username; 
	private String password;
	
	public User() {
		
	}
	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {					//이유?
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
