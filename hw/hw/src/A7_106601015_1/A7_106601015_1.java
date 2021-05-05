package A7_106601015_1;
import java.util.Scanner;
import java.util.ArrayList;

class Transaction{
    private String name;
    private int income;
    private int pay;

    public Transaction(String name) {
    	this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getIncome() {
        return income;
    }
    public int getPay() {
        return pay;
    }
    public void setIncome(int income) {
    	this.income = income;
    }
    public void setPay(int pay) {
    	this.pay = pay;
    }
}


public class A7_106601015_1 {
	// digit of int
	public static int getDigitsNumber(int d) {
	    return (int)Math.log10(d) + 1;
	}
	// main
	public static void main(String[] args) {
		ArrayList<Transaction> transaction_arraylist = new ArrayList<>();
		String input_name = "";
		int input_num = 0, input_operator = 0;
		
		while(true) {
			Scanner input = new Scanner(System.in);
			input_operator = input.nextInt();
			
			// get input, and create new_transaction + setIncome, add new_transaction to arraylist
			if(input_operator == 1) {
				input_name = input.next();
				input_num = input.nextInt();
				Transaction new_transaction = new Transaction(input_name);
				new_transaction.setIncome(input_num);
				new_transaction.setPay(0);
				transaction_arraylist.add(new_transaction);
			}
			// get input, and create new_transaction + setPay, add new_transaction to arraylist
			else if(input_operator == 2) {
				input_name = input.next();
				input_num = input.nextInt();
				Transaction new_transaction = new Transaction(input_name);
				new_transaction.setIncome(0);
				new_transaction.setPay(input_num);
				transaction_arraylist.add(new_transaction);
			}
			else if(input_operator == 3) {
				int total = 0, max_name_length = 0, max_income_length = 0, max_pay_length = 0;
				//calculate max length of three member
				for(Transaction t : transaction_arraylist) { 		      
					if(t.getName().length() > max_name_length){
						max_name_length = t.getName().length();
					}
					if(getDigitsNumber(t.getIncome()) > max_income_length){
						max_income_length = getDigitsNumber(t.getIncome());
					}
					if(getDigitsNumber(t.getPay()) > max_pay_length){
						max_pay_length = getDigitsNumber(t.getPay());
					}
				}
				// customized print
				for(Transaction t : transaction_arraylist){
					String getIncome_str = String.valueOf(t.getIncome());
					String getPay_str = String.valueOf(t.getPay());
					
					System.out.printf("%s", t.getName());
					for(int i=0;i<max_name_length-t.getName().length()+2;i++) {
						System.out.printf(" ");
					}
					System.out.printf("%s", getIncome_str);
					for(int i=0;i<max_income_length-getIncome_str.length()+2;i++) {
						System.out.printf(" ");
					}
					System.out.printf("%s\n", getPay_str);
					
					total += t.getIncome();
					total -= t.getPay();
				}
				System.out.printf("Total: %d\n", total);
			}
			else if(input_operator == 4) {
				break;
			}else {
				System.out.printf("Invalid Operation\n");
			}
		}
		
	}
}
