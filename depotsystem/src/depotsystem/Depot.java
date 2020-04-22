package depotsystem;
import java.util.Scanner;


public class Depot {
public void logon() {	
    	Scanner scan = new Scanner (new File ("the\\dir\\Depot.java"));
    	Scanner input = new Scanner (System.in);
    	  System.out.printf("");
    	  System.out.printf("Please enter your UserName: ");
    	  String username = scan.nextLine();
    	    System.out.printf("Please enter your Password: ");
    	    String password = scan.nextLine();
    	    
    	    String Inputusername = input.nextLine();
    	    String InputPass = input.nextLine();
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