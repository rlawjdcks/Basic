package sec01.exam01;

public class MenuMemberAccount {
	
	private String name;
	private String id;
	private String pass;
	private String num;
	private String birth;
	
	
	@Override
	public String toString() {
		return "MenuMemberAccount [name=" + name + ", id=" + id + ", pass=" + pass + ", num=" + num + ", birth=" + birth
				+ "]";
	}
	
	
	public MenuMemberAccount(String name, String id, String pass, String num, String birth) {
		super();
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.num = num;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
}