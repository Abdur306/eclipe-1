package Assignment;

public class ClassDemo3 {

	public static void main(String[] args) {
Bank bank=new Bank();
System.out.println(bank.depositCash(1200));

	}

}
class Bank{
	boolean depositCash(int amt) {
		if(amt>1000) 
			return true;
			else
				return false;
		
	}
	long getMoney() {
		return 10L;
	}
	String getName() {
		return "ram";
	}
}
