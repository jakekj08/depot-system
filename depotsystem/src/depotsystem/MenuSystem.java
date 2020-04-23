package depotsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuSystem {

	private static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "WorkSchedule.csv";
	     File file = new File(fileName);
		
	 Depot log = new Depot();
	log.LogOn();
		
	 
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
            	System.out.println("Setup work schedule");
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
    
}