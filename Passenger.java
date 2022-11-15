import java.util.Collections;
import java.util.Scanner;

public class Passenger {

    private String name;
    private int age; 
    private static Passenger[] passengers_list = new Passenger [12];
    final static Scanner myScanner = new Scanner(System.in);

    public Passenger (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setters

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    // Getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static Passenger[] getPassengerList() {
        return passengers_list;
    }



    // General methods

    private static int findEmptySeat(Passenger [] passengers_list){
        int passenger_seat = 0;
        for (int i=0;  i < passengers_list.length; i++){
            if (passengers_list[i] == null){
                passenger_seat = i;
                break; 
            }   
        }    
    return passenger_seat;
    }

    public static int countPassengers(){
        int count = 0;
        for (int i = 0; i < passengers_list.length; i++){
            if (passengers_list[i] != null){
                count ++;
            }
        }   return count;
    }

    public static void printPassengerManifest(){
        for (int i = 0; i < passengers_list.length; i++){
            if (passengers_list[i] != null){
                System.out.println("Seat: " + (i+1) + " Passenger: " + passengers_list[i].toString());
            }
        }
    }

    // Passenger methods

    public static void addPassenger(){
        int seat_index = findEmptySeat(passengers_list);
        System.out.println("What is the name of the passenger?");
        String name = myScanner.next();
        System.out.println("What is the age of the passenger?");
        int age = myScanner.nextInt();
        Passenger passenger = new Passenger(name, age);
        passengers_list[seat_index] = passenger;
        System.out.println("Passenger "+ passenger.getName() + " is now placed at seat " + (seat_index+1));
    }

    public static void removePassenger(){
        System.out.println("What from which seat do you wish to remove a passenger?");
        int seatNumber = myScanner.nextInt();
        Passenger to_be_removed = passengers_list[seatNumber];
        System.out.println("You have removed " + to_be_removed.getName() + " from his/her seat");
        passengers_list[seatNumber] = null;
    }

    public static void swapPassengers(){
        
        System.out.println("Select first seat number to swap");
        int seat1 = myScanner.nextInt();
        System.out.println("Select second seat number to swap");
        int seat2 = myScanner.nextInt();

        Passenger passenger1 = passengers_list[seat1];
        Passenger passenger2 = passengers_list[seat2];

        System.out.println("You have now swapped passengers " + passenger1.getName() + " and " + passenger2.getName());

        passengers_list[seat1] = passenger2;
        passengers_list[seat2] = passenger1;
    }

    public static void renamePassenger(){
        System.out.println("What passenger would you like to change the name of? Please enter a seat number > ");
        int seatNumber = myScanner.nextInt();
        Passenger passenger = passengers_list[seatNumber];
        System.out.println("Please input a new name for " + passenger.getName() + " at " + seatNumber);
        String newName = myScanner.next();
        passenger.setName(newName);
        System.out.println("Name successfully changed!");
    }

    public String toString(){
        return "Name " + this.name + ", Age " + this.age;
    }
}


