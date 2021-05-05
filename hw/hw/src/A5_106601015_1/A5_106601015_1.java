package A5_106601015_1;
import java.util.Scanner;

public class A5_106601015_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int input_num = input.nextInt();
		String input_str = input.next();
        
		for(int i = 0; i < input_num; i++){
			String output_str = "";
			//for left " "
			for(int j = 0; j < input_num-i-1; j++) {
				output_str += " ";
			}
			//for left "o"
			output_str += input_str.charAt(0);
			//for "x"
			if(i == input_num-1){
				for(int j = 0; j < i*2; j++) {
					output_str += input_str.charAt(0);
				}
			}
			else{
				for(int j = 0; j < i*2; j++) {
					output_str += input_str.charAt(1);
				}
			}
			//for right "o"
			output_str += input_str.charAt(0);
			//for right " "
			for(int j = 0; j < input_num-i-1; j++) {
				output_str += " ";
			}
			
			System.out.printf("%s\n", output_str);
        }
	}

}