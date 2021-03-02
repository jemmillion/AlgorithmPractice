package one;

import java.util.Scanner;

public class DaySixArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		// 3052 나머지
	      int[] numArr = new int[10];
	      int cnt1 = 0, cnt2=0;
	
	      for(int i=0; i<numArr.length; i++) {
	          numArr[i]=sc.nextInt()%42;
	      }
	      for(int i=0; i<numArr.length; i++) {
	          cnt1=0;
	          for(int j=i+1; j<numArr.length; j++) {
	              if(numArr[i]==numArr[j])
	                  cnt1++;
	          }
	          if(cnt1==0)
	              cnt2++;
	
	      }
	      System.out.println(cnt2);
	      
	      // 1546 평균
	      int n=sc.nextInt();
			int[] scoArr = new int[n];
			double[] newScoArr = new double[n];
			
		    int M = 0;
		    int i = 0;
		    
		    while(i<scoArr.length){
		      scoArr[i] = sc.nextInt();   
		      
		      if(scoArr[i]>M) {
		    	 M=scoArr[i];
		      }
		      i++;		      
		    }
			
		    double sum=0;
		    for(i=0; i<scoArr.length; i++) {
	    	  newScoArr[i]=(double)scoArr[i]/M*100;
	    	  sum+=newScoArr[i];
		    }
		    
		    System.out.println(sum/newScoArr.length);
	
		sc.close();
	}

}
