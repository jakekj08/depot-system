package depotsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuSystem {

	private static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "WorkSchedule.csv";
	     File file = new File(fileName);
	     String filepath = "WorkSchedule.csv";
	 Depot log = new Depot();
	log.LogOn();
	//Connecting this class to depot to get the login method from depot.
	
	
	String client = null;
	String start = null;
	String end = null;
	String vehicle = null;
	String driver = null;
	//Strings for the work schedule insert
		System.out.printf("Successfully logged in!%n");
        String choice = "";
        
        
        

            System.out.printf("1 -|| View Work Schedule  ||- -%n");
            System.out.printf("2 -|| Setup Work Schedule ||- -%n");
            System.out.printf("3 -|| Log out        ||- -%n");
            System.out.printf("4 -|| Exit system        ||- -%n");          
     //Menu system
        choice = S.next().toUpperCase();
        
        switch (choice) {
        case "1" : {
            try {
                Scanner inputStream = new Scanner(file);
                while (inputStream.hasNext()) {
                    String data = inputStream.next();
                    System.out.println(data);
                }
                inputStream.close();

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            break;
        }
            //Only views the work schedule.
            case "2" : {
            	BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
            	while ((fileName = csvReader.readLine()) != null) {
            	    String[] data = fileName.split(",");
            	    // do something with the data
            	    File csvFile = new File(fileName);
            	   
            	    
            	    SaveEntry(client, start, end, vehicle, driver, filepath);
            	    }
            	csvReader.close();
                break;
                //This calls the method which updates the file.
            }
            
                case "3" : {
            	System.out.println("Thank you for using the system!");
            	main(args);
            	//Used to log out
            }
                case "4" : {
                	System.out.println("Thank you for using the system.");
                	System.exit(0);
                } //Used to exit the system
            
        }
        
        }
    
    
    
    public void GetDepot() {
        
    } 
    
    public static void SaveEntry(String client, String start, String end, String vehicle, String driver, String filepath) {
	
     try
    	{
    		FileWriter f = new FileWriter(filepath,true);
    		BufferedWriter b = new BufferedWriter (f);
    		PrintWriter p = new PrintWriter(b);
    		Scanner scan = new Scanner(System.in);
    		//This is a set up to read the file, and be able to write inside of it.
    		
    		
    		System.out.println("What is the clients name?");
    		client = scan.next();
    		System.out.println("What is the start date?");
    		start = scan.next();
    		System.out.println("What is the end date?");
    		end = scan.next();
    		System.out.println("What is the vehicle being used?");
    		vehicle = scan.next();
    		System.out.println("What is the name of the driver?");
    		driver = scan.next();
    		p.println(client+","+start+","+end+","+vehicle+","+driver);
    		//Each input is scanned and then inserted into the file.
    		p.flush();
    		p.close();
    		
    		
    		System.out.println("Record saved!");
    		
    		
    	}
    catch(Exception E)
    	{
    	System.out.println("Error occured, record not saved.");
    	}
    	
    }
    
}