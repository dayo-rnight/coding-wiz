package qwerty;
import java.util.*;
public class q3 {

	public static void main(String[] args) {
		long a=0,b=0;
        int number=0;
        for(long i=2;i<1000000;i++)
        {
       	 number=1;
       	 long n=i;
       	 
       	 while(n!=1)
       	 {
       		 if(n%2==0)
       			 n/=2;
       		 else
       			 n=3*n+1;
       		 number++;
       		 
       	 }
       	 
       	 if((number>a)&&(n==1))
       	 {
       		 a=number;
       		 
       		 b=i;
       	 }
        }
        System.out.println(b);
	}


		

	}


