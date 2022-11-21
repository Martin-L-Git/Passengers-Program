import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Passenger {

    private String name;
    private int age; 
    private static ArrayList<Passenger> passengers_list = new ArrayList <Passenger>();


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

    public static ArrayList<Passenger> getPassengerList() {
        return passengers_list;
    }



    // General methods

    private static int findEmptySeat(ArrayList<Passenger> passengers_list){
        int passenger_seat = 0;
        for (int i=0;  i < passengers_list.size(); i++){
            if (passengers_list.get(i) == null){
                passenger_seat = i;
                break; 
            }   
        }    
    return passenger_seat;
    }

    public static void countPassengers(){
        int count = 0;
        for (int i = 0; i < passengers_list.size(); i++){
            if (passengers_list.get(i) != null){
                count ++;
            }
        }   
        System.out.println("Passenger count: " + count);
    }

    public static void printPassengerManifest(){
        for (int i = 0; i < passengers_list.size(); i++){
            if (passengers_list.get(i) != null){
                System.out.println("Seat: " + (i+1) + " Passenger: " + passengers_list.get(i));
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
        passengers_list.add(seat_index, new Passenger(name, age));
        System.out.println("Passenger "+ passenger.getName() + " is now placed at seat " + (seat_index+1));
    }

    public static void removePassenger(){
        System.out.println("What from which seat do you wish to remove a passenger?");
        int seatNumber = myScanner.nextInt();
        Passenger to_be_removed = passengers_list.get(seatNumber-1);
        System.out.println("You have removed " + to_be_removed.getName() + " from his/her seat");
        passengers_list.remove(seatNumber);
    }

    public static void swapPassengers(){
        System.out.println("Select first seat number to swap");
        int seat1 = myScanner.nextInt()-1;
        System.out.println("Select second seat number to swap");
        int seat2 = myScanner.nextInt()-1;
        System.out.println("You have now swapped passengers " + passengers_list.get(seat1).getName() + " and " + passengers_list.get(seat2).getName());
        Collections.swap(passengers_list, seat1, seat2);
    }

    public static void renamePassenger(){
        System.out.println("What passenger would you like to change the name of? Please enter a seat number > ");
        int seatNumber = myScanner.nextInt()-1;
        Passenger passenger = passengers_list.get(seatNumber);
        System.out.println("Please input a new name for " + passenger.getName() + " at seat " + (seatNumber+1));
        String newName = myScanner.next();
        passenger.setName(newName);
        System.out.println("Name successfully changed!");
    }

    public String toString(){
        return "Name " + this.name + ", Age " + this.age;
    }







}



