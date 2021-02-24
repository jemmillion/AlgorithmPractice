package one;

import java.util.Scanner;

public class DayOneIf {

	public static void main(String[] args) {
		//1-두 수 비교하기(1330)
		Scanner sc=new Scanner(System.in);

	    int A, B;
	    A=sc.nextInt();
	    B=sc.nextInt();
	  
	    if (A>=-10000 && B>=-10000 && 
	        A<=10000 && B<=10000) {
	          if(A>B)
	           System.out.println(">");
	          else if(A<B)
	            System.out.println("<");
	          else
	            System.out.println("==");
	    } 
		
		
		//2-성적출력(9498)
	    int i;
	    i=sc.nextInt();
	  
	    if (i>=90){
	      System.out.println("A");
	    }
	    else if(i>=80){
	      System.out.println("B");
	    }
	    else if(i>=70){
	      System.out.println("C");
	    }
	    else if(i>=60){
	      System.out.println("D");
	    }
	    else {
	      System.out.println("F");
	    }
				
		
		//3-윤년(2753)
	    int t;
	    t=sc.nextInt();
	  
	    if(t>=1 && t<=4000) {
	      if (t%4==0 && t%100!=0) 
	        System.out.println("1");  
	      else if(t%4==0 && t%400==0)
	        System.out.println("1");
	      else 
	        System.out.println("0");
	    }		
			
		
		//4-사분면고르기(14681)
	    int x, y;
	    x=sc.nextInt();
	    y=sc.nextInt();

	    if(x!=0 && x>=-1000 && x<=1000 &&
	      y!=0 && y>=-1000 && y<=1000){
	        if(x>0 && y>0)
	        System.out.println("1");
	        else if(x<0 && y>0)
	        System.out.println("2");
	        else if(x<0 && y<0)
	        System.out.println("3");
	        else
	        System.out.println("4");
	      }

		
		//5-알람시계(2884)
	    int h, m;
	    h=sc.nextInt();
	    m=sc.nextInt();

	    if(m<45){
	      h--;
	      m=60-(45-m);
	      if(h<0){
	        h=23;
	      }
	      System.out.println(h+" "+m);
	    }
	    else{
	      System.out.println(h+" "+(m-45));
	    }
		

	    sc.close();
	}

}
