package depotsystem;
import java.util.Scanner;

public class Manager extends Driver {

	public Manager(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	public void Accounts() {
		String UsernameG;
	    String PasswordG;
	    String UsernameS;
	    String PasswordS;
	    String UsernameK;
	    String PasswordK;
	    boolean authenticate = true;
	    PasswordG = "_Glyn";
	    UsernameG = "Glyn";
	    UsernameS = "Sorren";
	    PasswordS = "_Sorren";
	    UsernameK = "Kirsty";
	    PasswordK = "_Kirsty";
	
	    
	    
	    while (authenticate = true) {
	    Scanner input1 = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter Password : ");
	    String password = input2.next();

	    if (username.equals(UsernameG) && password.equals(PasswordG)) {

	        System.out.println("Access Granted! Welcome!");
	        authenticate = false;
	        break;
	    }

	    else if (username.equals(UsernameG)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(PasswordG)) {
	        System.out.println("Invalid Username!");
	    } 
	    
	    if (username.equals(UsernameS) && password.equals(PasswordS)) {

	        System.out.println("Access Granted! Welcome!");
	        authenticate = false;
	        break;
	    }

	    else if (username.equals(UsernameS)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(PasswordS)) {
	        System.out.println("Invalid Username!");
	    } 
	    
	    
	    if (username.equals(UsernameK) && password.equals(PasswordK)) {

	        System.out.println("Access Granted! Welcome!");
	        authenticate = false;
	        break;
	    }

	    else if (username.equals(UsernameK)) {
	        System.out.println("Invalid Password!");
	    } else if (password.equals(PasswordK)) {
	        System.out.println("Invalid Username!");
	    } 
	}
	}

}


	
	
    

    

