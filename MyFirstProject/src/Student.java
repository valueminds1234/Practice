
public class Student {
	String name,email;

	String eid;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", eid=" + eid + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
