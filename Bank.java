package DAY1;

public class Bank  implements CIBIL,PNB{
	@Override
	public void cibilscore() {
		// TODO Auto-generated method stub
		
	}
	
	 public void maximumLoanamount() {
		 System.out.println("maximumLoanamount");
	 }
	  public void creditScore()
	  {
		  System.out.println("creditScore");
	  }
	  public void minimumBalanace() {
		  System.out.println("minimumBalanace");
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj=new Bank();
		obj.maximumLoanamount();
		obj.creditScore();
		obj.minimumBalanace();

		CIBIL obj1=new Bank();
		obj1.cibilscore();
		
		PNB obj2=new Bank();
		obj2.maximumLoanamount();
		obj2.creditScore();
		obj2.minimumBalanace();
		
	}
	
		
	

}
