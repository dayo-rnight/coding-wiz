package qwerty;
import java.util.*;


public class q2 {

	public static void main(String[] args) {
		Scanner dd=new Scanner(System.in);
		int win=0;
		
		String user,comp ="";
		for(int i=0;i<3;i++)
		{
		int ran=(int)(Math.random()*3)+1;
		if (ran== 1) 
	       comp = "r"; 
	    else if (ran== 2) 
	       comp = "p"; 
	    else if (ran== 3) 
	       comp = "s";
		System.out.println("r=rock,p=paper,s=scissors");
		user=dd.nextLine();
		
		if (user.equals(comp))
			System.out.println("draw");
		else if ((user.equals("r")) && (comp.equals("p")))
		System.out.println("lose");
		else if ((user.equals("r")) && (comp.equals("s")))
		{
			System.out.println("win");	
			win=win+1;
		}
		else if ((user.equals("p")) && (comp.equals("s")))
			System.out.println("lose");
		else if ((user.equals("p")) && (comp.equals("r"))) {			
		win=win+1;
			System.out.println("win");
		}
		else if ((user.equals("s")) && (comp.equals("r")))
			System.out.println("lose");
		else if ((user.equals("s")) && (comp.equals("p"))) {
			System.out.println("win");
			win=win+1;
		}
		else
			System.out.println("worng");
		}
		System.out.println();
		
		if(win>=2)
			System.out.println("winner winner chicken dinner");
		else if(win==0)
			System.out.println("tie");
		else
			System.out.println("you lost");
	}
	

}
