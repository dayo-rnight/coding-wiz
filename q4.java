package qwerty;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		Scanner dd=new Scanner(System.in);
		System.out.println("Enter the Date eg:23 th jan 2069");
		String s=dd.nextLine();
		int a=Integer.parseInt(s.substring(0,2));
	        String m= s.substring(6,9);
	        m=m.toUpperCase();
	        int y=Integer.parseInt(s.substring(s.length()-4));
	        int feb,days=a;
	      
	        if ((y% 4 == 0 && y % 100 != 0 ) || (y % 400 == 0)){
	            feb=29;
	        }
	        else{
	            feb=28;
	        }
	        switch(m){
	        case "JAN":
	        	break;
	        case "FEB":
	        	days += 31;
	            break;
	        case "MAR":
	        	days += 31+feb;
	            break;
	        case "APR":
	        	days += 31+feb+31;
	            break;
	        case "MAY":
	        	days += 31+feb+31+30;
	            break;
	        case "JUN":
	        	days += 31+feb+31+30+31;
	            break;
	        case "JUL":
	        	days += 31+feb+31+30+31+30;
	            break;            
	        case "AUG":
	        	days += 31+feb+31+30+31+30+31;
	            break;
	        case "SEP":
	        	days += 31+feb+31+30+31+30+31+31;
	            break;
	        case "OCT":
	        	days += 31+feb+31+30+31+30+31+31+30;            
	            break;            
	        case "NOV":
	        	days += 31+feb+31+30+31+30+31+31+30+31;            
	            break;                        
	        case "DEC":
	        	days += 31+feb+31+30+31+30+31+31+30+31+30;            
	            break; 
	        default:
	        	System.out.println("Enter a Valid Date");
	        }
	        System.out.println("No Of Days: "+days);
	    }
	}

		
