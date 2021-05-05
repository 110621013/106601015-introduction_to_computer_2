package A5_106601015_2;
import java.util.Scanner;

public class A5_106601015_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int biggest_num = -1;
		while(true) {
			Scanner input = new Scanner(System.in);
			int input_num = input.nextInt();
			
			// when input == -1
			if(input_num == -1) {
				break;
			}
			
			// compare input_num and biggest_num
			if(input_num > biggest_num) {
				biggest_num = input_num;
			}
		}
		
		if(biggest_num == -1){
			System.out.printf("None\n");
		}
		else{
			System.out.printf("%d\n", biggest_num);
		}

	}

}
