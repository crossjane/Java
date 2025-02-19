package chap10_polymorphism.member;

// 명시되어 있진 않지만 모든 클래스는 Object클래스를 상속받아 만들어진다.
public class Member {
	private long id; 
	private String userId;
	private String password;
	private String userEamil;
	private String userNickname;
	
	
	
	public Member(long id, String userId, String password, String userEamil, String userNickname) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.userEamil = userEamil;
		this.userNickname = userNickname;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserEamil() {
		return userEamil;
	}
	public void setUserEamil(String userEamil) {
		this.userEamil = userEamil;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	
	//Object 클래스의 toString 메소드를 오버라이드한 메소드
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", userId=" + userId + ", password=" + password + ", userEamil=" + userEamil
//				+ ", userNickname=" + userNickname + "]";
//	}
	
	

}
