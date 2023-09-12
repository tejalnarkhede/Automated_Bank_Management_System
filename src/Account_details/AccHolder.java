package Account_details;

public class AccHolder extends Exception{
	private String full_name;
	private String city;
	private String Dist;
	private int age;
	private long  mob_no;
	private String gender;
	private String Customer_type;
	//private Acc_details acc;
	
	public AccHolder() {
		// TODO Auto-generated constructor stub
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCustomer_type() {
		return Customer_type;
	}
	public void setCustomer_type(String customer_type) {
		Customer_type = customer_type;
	}
	@Override
	public String toString() {
		return "You can't open account,your age is less than 18";
	}
	
	
}
