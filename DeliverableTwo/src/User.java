
public class User {
	private String name;
	private String hobby;
	
	public User() {
		setName("John Doe");
		setHobby("N/A");
	}
	
	public User(String n, String h) {
		setName(n);
		setHobby(h);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
