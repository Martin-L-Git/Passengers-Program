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

    public int getSeatNumber(Passenger passenger){
        int seat_number = 100;
        for (int i = 0; i < passengers_list.length; i++){
            if (passengers_list[i].equals(passenger)){
                seat_number = i;
                break;
            }
            else {
                System.out.println("Passenger does not have a seat");
            }
        }
        return seat_number;
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
        
        System.out.println("Select first seat to swap");
        int seat1 = myScanner.nextInt();
        System.out.println("Select second seat to swap");
        int seat2 = myScanner.nextInt();

        Passenger passenger1 = passengers_list[seat1];
        Passenger passenger2 = passengers_list[seat2];

        System.out.println("You have now swapped passengers " + passenger1.getName() + " and " + passenger2.getName());

        passengers_list[seat1] = passenger2;
        passengers_list[seat2] = passenger1;
    }
}

