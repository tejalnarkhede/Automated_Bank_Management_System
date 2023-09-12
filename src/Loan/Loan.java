package Loan;

public class Loan extends Exception {

		//public long Acco_no;
		public String landmark; 
		public String Co_applicant_name;
		public long Co_applicant_accno;
		public String Comp_name;
		//public String tenure;
		
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getCo_applicant_name() {
			return Co_applicant_name;
		}
		public void setCo_applicant_name(String co_applicant_name) {
			Co_applicant_name = co_applicant_name;
		}
		public long getCo_applicant_accno() {
			return Co_applicant_accno;
		}
		public void setCo_applicant_accno(long co_applicant_accno) {
			Co_applicant_accno = co_applicant_accno;
		}
		public String getComp_name() {
			return Comp_name;
		}
		public void setComp_name(String comp_name) {
			Comp_name = comp_name;
		}
		/*public String getTenure() {
			return tenure;
		}
		public void setTenure(String tenure) {
			this.tenure = tenure;
		}*/
		public String toString() {
			return "Invalid Account Number!!";
		}
		
	}




