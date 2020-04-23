package depotsystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Depot {
	private String UserName;
	private String PassWord;
	private boolean Authenticate;
	private Manager Credentials;
	

public void Depot(String username, String password) {
		// TODO Auto-generated constructor stub
	this.UserName = username;
	this.PassWord = password;
	
	}


/*public void logon() throws FileNotFoundException {	
	 Authenticate = false;
	Credentials = new Manager(toString(), PassWord);
	
    	Scanner scan = new Scanner (new File ("the\\dir\\Depot.java"));
    	Scanner input = new Scanner (System.in);
    	  System.out.printf("");
    	  System.out.printf("Please enter your UserName: ");
    	  String username = scan.nextLine();
    	    System.out.printf("Please enter your Password: ");
    	    String password = scan.nextLine();
    	    
    	    Authenticate = Credentials.accounts(username, password);
    	    
    	    if (Authenticate) {
    	    	this.UserName = username;
    	    } 
    	    
    	    
    	    String InputUsername = input.nextLine();
    	    String InputPass = input.nextLine();
    	    
    	    	if (InputUsername.equals(username) && InputPass.equals(password)) {
    	    		System.out.print("Login successful");
    	    			} 
    	    	else {
    	    		System.out.print("Login unsuccessful");			
    	    	}
    } */
    
       public Vehicle GetVehicle() {
       return null;
       }
       
       public Driver GetDriver() {
           return null;
       }
       
       public void SetupWorkSchedule () {
           
       }
}