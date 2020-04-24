package depotsystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Depot {
	private String UserName;
	private String PassWord;
	private boolean Authenticate;
	private Manager Credentials;
	

public void LogOn() {
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
    //These strings are the different accounts that can be used, each have the same functionality and rights.
    
    
    while (authenticate = true) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();
    
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();
//Scans the output
    
    if (username.equals(UsernameG) && password.equals(PasswordG)) {

        System.out.println("Access Granted! Welcome!");
        authenticate = false;
        break;
    }

    else if (username.equals(UsernameG)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(PasswordG)) {
        System.out.println("Invalid Username!");
    } //shows if the user does not insert the correct login information
    
    if (username.equals(UsernameS) && password.equals(PasswordS)) {

        System.out.println("Access Granted! Welcome!");
        authenticate = false;
        break;
    }

    else if (username.equals(UsernameS)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(PasswordS)) {
        System.out.println("Invalid Username!");
    } //shows if the user does not insert the correct login information
    
    
    if (username.equals(UsernameK) && password.equals(PasswordK)) {

        System.out.println("Access Granted! Welcome!");
        authenticate = false;
        break;
    }

    else if (username.equals(UsernameK)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(PasswordK)) {
        System.out.println("Invalid Username!");
    } //shows if the user does not insert the correct login information
}
}
	
	
    
       public Vehicle GetVehicle() {
       return null;
       }
       
       public Driver GetDriver() {
           return null;
       }
       
       public void SetupWorkSchedule () {
           
       }
}