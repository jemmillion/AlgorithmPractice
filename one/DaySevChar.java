package one;

import java.util.Scanner;

public class DaySevChar {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);

	    // 11654 아스키코드
	    String s=sc.nextLine();

	    int ascii=s.charAt(0);
	    System.out.println(ascii);

	    // 11720 숫자의합
        int n = sc.nextInt();
        String nums = sc.next();

        int sum = 0;
        for( int i=0; i<n; i++ ) {
            sum += (int)nums.charAt(i) - '0';
        }
        System.out.println(sum);
        
        // 10809 알파벳 찾기
  	    String S=sc.next();

	    for(char alp='a';alp<='z';alp++) {
	    	System.out.print(S.indexOf(alp)+" ");
	    }
		
	    
	    sc.close();
	}

}
