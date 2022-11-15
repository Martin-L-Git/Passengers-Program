import java.util.Scanner;

public class passengerProgram {

    final static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Passenger[] passengers = Passenger.getPassengerList();
        System.out.println("Write the number in which order you'd like to proceed");
        System.out.println(" 1. Add Passenger \n 2. Remove Passenger \n 3. Switch Seats \n 4. Rename Passenger \n 5. Count Passengers \n 6. Print Passenger Manifest");
        menu(passengers);
        }


    public static void menu(Passenger[] passengers){
        int choice = myScanner.nextInt();
        
        // Creates a new passenger and puts them in the first available seat
        if (choice == 1){
            Passenger.addPassenger();
        }

        // Removes a passenger from given seat number
        else if (choice == 2) {
            Passenger.removePassenger();
        }

        // Swaps the seats of two passengers given two seat numbers
        else if (choice == 3) {
            Passenger.swapPassengers();
        }

        // Renames a passenger given seat number
        else if (choice == 4) {
            Passenger.renamePassenger();
        }
        
        // Counts the passengers on the plane and returns a number
        else if (choice == 5) {
            Passenger.countPassengers();
        }

        else if (choice == 6) {
            Passenger.countPassengers();
        }


    }


}