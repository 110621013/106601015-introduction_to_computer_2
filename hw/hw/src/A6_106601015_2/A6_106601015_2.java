package A6_106601015_2;
import java.util.Scanner;

public class A6_106601015_2 {
	// input i, j, landmine_map and limit n, output neighboring landmine number char
	public static char count_landmine(int i_location, int j_location, char[][] landmine_map, int n){
		int counter = 48;
		for(int i=i_location-1; i<=i_location+1; i++){
			// if i out of range
			if(i<0 || i>=n) {
				continue;
			}
			for(int j=j_location-1; j<=j_location+1; j++){
				// if j out of range
				if(j<0 || j>=n) {
					continue;
				}
				// check landmine
				if(landmine_map[i][j] == '*') {
					counter += 1;
				}
			}
        }
		return (char)counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String line = "";
		char[][] landmine_map = new char[n][n];
		
		// init landmine_map
		for(int i=0; i<n; i++){
			line = input.next(); //sure ok
			//System.out.printf("line: %s, line.length():%d\n", line, line.length());
			for(int j=0; j<n; j++){
				landmine_map[i][j] = line.charAt(j);
				//System.out.printf("landmine_map[%d][%d]: %s\n", i, j, landmine_map[i][j]);
			}
        }
		
		// count and print
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				// if location is landmine --> *
				if(landmine_map[i][j] == '*') {
					System.out.printf("*");
				}
				else{
					System.out.printf("%c", count_landmine(i, j, landmine_map, n));
				}
			}
			System.out.printf("\n");
        }
	}
}
