package one;

import java.util.Scanner;

public class DayFourWhile {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    
	    // 1 A+B-5(10952)
	    while(true) {
	  	  
		      int A=sc.nextInt();
		      int B=sc.nextInt();
		      if(A==0 && B==0) break;
		      System.out.println(A+B);  

		    }
	    
	    // 2 A+B-4(10951)
		while(sc.hasNextInt()) {

		      int A=sc.nextInt();
		      int B=sc.nextInt();
		      
		      System.out.println(A+B);  		       	  
			
			}
		
	    // 3 X보다 작은 수(10871)
		int N=sc.nextInt();
	    int X=sc.nextInt();
	    int A1;
			
			for(int i=0; i<N; i++){
	      A1 = sc.nextInt();
	      if(A1<X){
	        System.out.print(A1+" ");
	      }
	    }

			
	    // 4 최소,최대(10818)
		int N1=sc.nextInt();
		
		int[] subjectArr = new int[N1];

	    for(int i=0;i<N1;i++){
	      subjectArr[i] = sc.nextInt();
	    }
	    
	    int max = subjectArr[0];
	    int min = subjectArr[0];
	    
		for(int j=0;j<subjectArr.length ; j++){
	      if(subjectArr[j]>max)
	      max=subjectArr[j];
	      if(subjectArr[j]<min)
	      min=subjectArr[j];
	    }

	    System.out.println(min+" "+max);	
	    
	    // 5 A+B-2(2558)
	    int A, B;
	    A=sc.nextInt();
	    B=sc.nextInt();

	    if (A>0 && B<10)
	     System.out.print(A+B);
	    sc.close();
	}

}
