import java.util.Scanner;

public class passengerProgram {

    final static Scanner myScanner = new Scanner(System.in);
    static Passenger[] passengers = Passenger.getPassengerList();
   

    public static void main(String[] args) {

        passengers[0] = new Passenger("Joe", 29);
        passengers[1] = new Passenger("Mark", 36);
        passengers[2] = null;           
        passengers[3] = new Passenger("Jenny", 33);
        passengers[4] = new Passenger("Adam", 43);
        passengers[5] = new Passenger("Greg", 28);
        passengers[6] = null;            
        passengers[7] = new Passenger("Stan", 53);
        passengers[8] = new Passenger("Hank", 48);
        passengers[9] = new Passenger("Sue", 45);
        passengers[10] = new Passenger("Dan", 48);
        passengers[11] = new Passenger("Bob", 44);

        menu();

        }

    public static void menu(){

        System.out.println("Write the number in which order you'd like to proceed");
        System.out.println(" 1. Add Passenger \n 2. Remove Passenger \n 3. Switch Seats \n 4. Rename Passenger \n 5. Count Passengers \n 6. Print Passenger Manifest");
        menu_alternatives(passengers);
    }

    public static void backToMenu(){
        System.out.println("For menu enter 1, to exit enter 2");
            int goBack = myScanner.nextInt();
            if (goBack == 1){
                menu();
            }
            else if (goBack == 2){
                System.exit(0);
            }
    }
    
    public static void menu_alternatives(Passenger[] passengers){
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

        else if (choice == 6) {
            Passenger.printPassengerManifest();
            backToMenu();
            
        
    }

    }


}