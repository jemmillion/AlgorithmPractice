package one;

import java.io.*;
import java.util.*;

public class DayTwoFor {

	public static void main(String[] args) throws IOException {
		// 1-구구단(2739)
		
		Scanner sc=new Scanner(System.in);
	    
	    int N = sc.nextInt();

	    if(N>=1 && N<=9){

	      for(int i=0; i<9; i++){
	        System.out.println(N+" * "+(i+1)+" = "+(N*(i+1)));
	      }
	    }
	    
	    // 2-A+B-3(10950)
	    
	    int T=sc.nextInt();
	    
	      for(int i=0; i<T; i++){
	        int A=sc.nextInt(), B=sc.nextInt();
	        if(A>0 && B<10){
	          System.out.println(A+B);      
	      }
	    }
	    
	    // 3-합(8393)
	    
	    int n=sc.nextInt();
	    int sum=0;

	      for(int i=0; i<n+1; i++){             

	        sum+=i;
	      }
	      System.out.println(sum);
	  
	    // 4-빠른A+B(15552)
	    
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      StringTokenizer str;
	      int T1=Integer.parseInt(br.readLine());

	      for(int i=0; i<T1; i++){
	        str = new StringTokenizer(br.readLine());
	        bw.write((Integer.parseInt(str.nextToken())+Integer.parseInt(str.nextToken()))+"\n");
	      }  

	      bw.close();
	      
	    // 5-N찍기(2741)

	      int N1=sc.nextInt();

	      for(int i=0; i<N1; i++){
	        System.out.println(i+1);
	      }
	      
		sc.close();
	}

}
