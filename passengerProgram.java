import java.util.Scanner;

public class passengerProgram {

    final static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Passenger[] passengers = Passenger.getPassengerList();
        System.out.println("Write the number in which order you'd like to proceed");
        System.out.println(" 1. Add Passenger \n 2. Remove Passenger \n 3. Switch Seats \n 4. Rename Passenger \n 5. Count Passengers \n 6. Print Passenger Manifest");
        menu_choice(passengers);
        }


    public static void menu_choice(Passenger[] passengers){
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

    }


}