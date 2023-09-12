package Account_details;

public class Acc_details {
	private  String Term_deposit;
	private String nominee_name;
	private int nominee_age;
	private String acc_type;
	
	public String getTerm_deposit() {
		return Term_deposit;
	}
	public void setTerm_deposit(String term_deposit) {
		Term_deposit = term_deposit;
	}
	public String getNominee_name() {
		return nominee_name;
	}
	public void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}
	public int getNominee_age() {
		return nominee_age;
	}
	public void setNominee_age(int nominee_age) {
		this.nominee_age = nominee_age;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
}
