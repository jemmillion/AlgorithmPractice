package one;

import java.util.Scanner;


public class Day9Arr {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    // 8958 OXÄûÁî
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			String input = sc.nextLine();
			int result=0;
			int score=0;
			
			for(int j=0; j<input.length(); j++) {
				
				if(input.charAt(j)=='O') {
					score++;
					result +=score;
				}else {
					score=0;
				}
			}
			System.out.println(result);
	    
	    // 4344 Æò±ÕÀº ³Ñ°ÚÁö
	    int[] arr;
	    int test = sc.nextInt();
	        
	    for(int i1 = 0 ; i1 < test ; i1++) {
	        int N = sc.nextInt();
	        arr = new int[N];
	        double sum = 0;

	        for(int j = 0 ; j < N ; j++) {
	            int val = sc.nextInt();
	            arr[j] = val;
	            sum += val; 
	         }
	        double mean = (sum / N) ;
	        double cnt = 0;

	        for(int j = 0 ; j < N ; j++) {
	            if(arr[j] > mean) {
	                cnt++;
	            }
	        }
	        System.out.printf("%.3f%%\n",(cnt/N)*100);
	    }
	    sc.close();
	}
	}
}
