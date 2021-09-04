package ValidateEmail;
import java.util.*;
import java.util.ArrayList;

public class ValidateEmail {
		public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String> ();
		list.add("Ramesh.shettar@gmail.com");
		list.add("Ramesh.shettar2@gmail.com");
		list.add("Ramesh.shettar3@gmail.com");
		list.add("Ramesh.shettar4@gmail.com");
		list.add("Ramesh.shettar5@gmail.com");
		list.add("Ramesh.shettar6@gmail.com");
		list.add("Ramesh.shettar7@gmail.com");
		list.add("Ramesh.shettar8@gmail.com");
		list.add("Ramesh.shettar9@gmail.com");
		list.add("Ramesh.shettar10@gmail.com");
	System.out.println ("Enter the user EmailID:");
	Scanner Scan =new Scanner (System.in);
	String user=Scan.next();
	for(String element:list)
	{
		if(element.equals(user))
		{
		System.out.println("User Login Successfully");
		}
		else
		{
			System.out.println("User login failed");	
		}
	}

		
		
		
		}

	}




