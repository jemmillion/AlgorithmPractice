package one;

import java.util.Scanner;

public class DayFive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	/*
		// 1 더하기 사이클 (1110)
		int N=sc.nextInt();
		int T=N;
		int cnt=0;

		while(true) {
			
			N=( (N%10)*10 ) + ( ((N/10)+(N%10))%10 );
			cnt++;
			
			if(T==N)
				break;
		}
		
		System.out.println(cnt);
		
		// 2 최댓값(2562)
			
		int subjectArr[] = new int[9];
		
	    int max = 0;
	    int cnt1 = 0;
	    int i=0;
	    
	    while(i<subjectArr.length){
	      subjectArr[i] = sc.nextInt();   
	      
	      if(subjectArr[i]>max) {
	    	  max=subjectArr[i];
	      	  cnt1=i+1;
	      }
	      i++;
	      
	    }

	    System.out.println(max);
	    System.out.println(cnt1);
	*/
	    
	    // 3 숫자의 개수(2577)
	    
	    int A=sc.nextInt();
	    int B=sc.nextInt();
	    int C=sc.nextInt();
	    
	    int result=A*B*C;
	    
	    int numArr[] = new int[10];
	    
	    for(int k=0; k<numArr.length; k++) {
	    	
	    	int cnt2=0;
	    	int temp=result;
	    	numArr[k]=k;
	    	
	    	while(temp!=0) {
	    		
	    		if(temp%10==numArr[k]) {
	    			cnt2++;
	    		}
	    		temp /= 10;
	    	}
	    	
	    	System.out.println(cnt2);
	    	
	    }	       
	    
		sc.close();	
	}

}
