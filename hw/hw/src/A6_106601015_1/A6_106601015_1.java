package A6_106601015_1;
import java.util.Scanner;

public class A6_106601015_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner input = new Scanner(System.in);
			String input_str = input.nextLine();
			
			// if input_str == "STOP" --> break
			if(input_str.equals("STOP")) {
				break;
			}
			
			// split input_str and parse to Int
			String[] input_str_array = input_str.split(" ");
			int[] input_int_array = new int[input_str_array.length];
	        for(int i=0; i<input_str_array.length; i++){
	            input_int_array[i] = Integer.parseInt(input_str_array[i]);
	        }
	        
	        // walk through input_int_array, sure second_biggest
	        int biggest = -1, second_biggest = -1;
	        for(int i=0; i<input_int_array.length; i++){
	        	if(input_int_array[i] > biggest){
	        		second_biggest = biggest;
	        		biggest = input_int_array[i];
	        	}
	        	else if(input_int_array[i] > second_biggest && input_int_array[i] != biggest) {
	        		second_biggest = input_int_array[i];
	        	}
	        	//System.out.printf("---> %d %d\n", biggest, second_biggest);
	        }
	        
	        System.out.printf("%d\n", second_biggest);
		}
	}
}
