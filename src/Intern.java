

//MODEL
public class Intern {

	private long id;
	private String name;
	private String college;
	private String joinDate;
	private String mail;
	private String domain;

	public Intern(long id, String name, String college, String joinDate,
			String mail, String domain) {

		this.id = id;
		this.name = name;
		this.college = college;
		this.joinDate = joinDate;
		this.mail = mail;
		this.domain = domain;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String toString() {
		return "Student [id - " + id + ", Name - " + name + ", College - "
				+ college + ", Joindate - " + joinDate + ",Mail-id -" + mail
				+ ",Domain -" + domain + "]";

	}
}
