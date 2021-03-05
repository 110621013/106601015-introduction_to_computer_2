package a1_106601015_2;
import java.util.Scanner;

public class a1_106601015_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int total = 0;
		int triple = 0;
		
		int tail = input;
		for(int i = 1; i <= 3; i++){
			triple = (int)Math.pow((tail % 10), 3);
			total += triple;
			tail = (int)(tail/10);
        }
		
		if(total == input){
			System.out.printf("%d is a narcissistic number.\n", input);
        }
        else {
        	System.out.printf("%d is not a narcissistic number.\n", input);
        }
	}

}
