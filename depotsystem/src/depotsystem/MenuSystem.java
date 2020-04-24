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
		// TODO Auto-generated method stub
		String fileName = "WorkSchedule.csv";
	     File file = new File(fileName);
		
	 Depot log = new Depot();
	log.LogOn();
	//Vehicle truck = new Vehicle();
   // truck.Vehicle(args, fileName, fileName, 0);
	 
     //Code to view work schedule which doesnt work as intended
     //loadSchedule();
     
     
		System.out.printf("-//- Welcome to the E-Depot System -//- -%n");
        String choice = "";
        
        
        do {

        	System.out.printf("-|| Menu ||-%n");
            System.out.printf("1 -|| View Work Schedule  ||- -%n");
            System.out.printf("2 -|| Setup Work Schedule ||- -%n");
            System.out.printf("3 -|| Move Vehicle        ||- -%n");
            System.out.printf("4 -|| Option 4            ||- -%n");
            System.out.printf("E -|| Exit System         ||- -%n");
            System.out.printf("Choose:  %n");
     
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
            
            case "2" : {
            	BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
            	while ((fileName = csvReader.readLine()) != null) {
            	    String[] data = fileName.split(",");
            	    // do something with the data
            	    File csvFile = new File(fileName);
            	   
            	    
            	    SaveEntry(fileName, fileName, fileName, fileName, fileName, fileName);
            	            
            	            
            	   
            	    	
            	    	
            	    
            	    
            	    
            	}
            	csvReader.close();
                break;
            }
            
            case "3" : {
            	System.out.println("Move vehicle");
                break;
            }
            
            case "4" : {
            	System.out.println("Four");
                break;
            }
            
        }
        
        }
    
    while (!choice.equals("E"));
        System.out.println("-||- System Exit -||-");
        System.out.println("     ~||~ Goodbye ~||~ ");
    }
    
    public void GetDepot() {
        
    } 
    
    public static void SaveEntry(String client, String start, String end, String vehicle, String driver, String WorkFile) {
	
    	try
    	{
    		FileWriter f = new FileWriter(WorkFile, true);
    		BufferedWriter b = new BufferedWriter (f);
    		PrintWriter p = new PrintWriter(b);
    		Scanner scan = new Scanner(System.in);
    		
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
    		
    		System.out.println("Record saved!");
    		
    		
    	}
    catch(Exception E)
    	{
    	System.out.println("Error occured, record not saved.");
    	}
    
    }
    
}