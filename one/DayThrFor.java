package one;

import java.util.Scanner;

public class DayThrFor {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);		
		
		// 1-±‚¬ÔN(2742)
	    int N=sc.nextInt();
	    int min=0;
	    
	    for(int i=0; i<N; i++){
	      min=N-i;
	      System.out.println(min);
	    }
	    
		// 2-A+B-7(11021)
	    int T=sc.nextInt();

	    for(int i=0; i<T; i++){
	      int A=sc.nextInt();
	      int B=sc.nextInt();

	      if(A>0 && B<10){
	        System.out.println("Case #"+(i+1)+": "+(A+B));
	      }
	    }
	    
		// 3-A+B-8(11022)
	    int T1=sc.nextInt();
	    int C=0;

	    for(int i=0; i<T1; i++){
	      int A=sc.nextInt();
	      int B=sc.nextInt();

	      if(A>0 && B<10){
	        C=A+B;
	        System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+C);
	      }

	    }
		
		// 4-∫∞¬Ô±‚1(2438)
	    int N1=sc.nextInt();
	    
	    for(int i=0; i<N1; i++){
	      for(int j=0; j<=i; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
		
		// 5-∫∞¬Ô±‚2(2439)
	    int N2=sc.nextInt();
	    
	    for(int i=0; i<N2; i++){
	      for(int j=N2-1; j>i; j--) {
	        System.out.print(" ");
	      }
	      for(int k=0;k<=i; k++){
	        System.out.print("*");      
	      }
	      System.out.println();
	    }

	    
	    sc.close();
	}

}
