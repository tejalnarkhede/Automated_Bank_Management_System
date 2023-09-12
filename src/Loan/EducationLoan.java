package Loan;

public class EducationLoan extends Loan{

	private int age;
	private int course_period;
	private String country;
	private long  loan_amount;
	//private int Duration;
	private String tenure;
	private String tream;
	private int Merit;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getCourse_period() {
		return course_period;
	}
	public void setCourse_period(int course_period) {
		this.course_period = course_period;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(long loan_amount) {
		this.loan_amount = loan_amount;
	}
	/*public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}*/
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure=tenure;
	}
	public String getTream() {
		return tream;
	}
	public void setTream(String tream) {
		this.tream = tream;
	}
	public int getMerit() {
		return Merit;
	}
	public void setMerit(int merit) {
		Merit = merit;
	}
}


