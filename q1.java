package qwerty;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner dd=new Scanner(System.in);
		System.out.println("Enter ther word");
		String k=dd.nextLine();
		k=k.toUpperCase();
		
		String q="";
		int n=k.length();
		for(int i=0;i<n;i++)
		{
			if(k.charAt(i)=='G') 
            	q+="C";
            
			else if(k.charAt(i)=='C') 
            	q+="G";
            
			else if(k.charAt(i)=='T') 
            	q+="A";
            
			else if(k.charAt(i)=='A') 
            	q+="U";
            
			else 
            {
            	System.out.println("Invalid Input");
            	break;
            	
            }
            
		}
		System.out.println(q);
		
		
		
		

	}

}
