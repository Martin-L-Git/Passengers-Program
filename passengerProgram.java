import java.util.Scanner;
import java.util.ArrayList;

public class passengerProgram {

    final static Scanner myScanner = new Scanner(System.in);
    static ArrayList<Passenger> passengers_list = Passenger.getPassengerList();
   

    public static void main(String[] args) {
        menu(passengers_list);
        }


    public static void backToMenu(){
        System.out.println("For menu enter 1, to exit enter 2");
            int goBack = myScanner.nextInt();
            if (goBack == 1){
                menu(passengers_list);
            }
            else if (goBack == 2){
                System.exit(0);
            }
    }

    public static void menu(ArrayList<Passenger> passengers_list){

        System.out.println("Write the number in which order you'd like to proceed");
        System.out.println(" 1. Add Passenger \n 2. Remove Passenger \n 3. Switch Seats \n 4. Rename Passenger \n 5. Count Passengers \n 6. Print Passenger Manifest");

        int choice = myScanner.nextInt();
        
        // Creates a new passenger and puts them in the first available seat
        if (choice == 1){
            Passenger.addPassenger();
            backToMenu();
            }
            

        // Removes a passenger from given seat number
        else if (choice == 2) {
            Passenger.removePassenger();
            backToMenu();
            }
            

        // Swaps the seats of two passengers given two seat numbers
        else if (choice == 3) {
            Passenger.swapPassengers();
            backToMenu();
            
        }

        // Renames a passenger given seat number
        else if (choice == 4) {
            Passenger.renamePassenger();
            backToMenu();
            
        }
        
        // Counts the passengers on the plane and returns a number
        else if (choice == 5) {
            Passenger.countPassengers();
            backToMenu();
            
        }

        // Prints out all passengers
        else if (choice == 6) {
            Passenger.printPassengerManifest();
            backToMenu();
            
        
    }

    }


}