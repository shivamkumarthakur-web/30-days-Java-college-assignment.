import java.util.*;
public class program111{//ticket booking system.
public static void ticketbooking(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Passenger Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Destination : ");
    String destination=sc.nextLine();

    System.out.print("Enter Number of Tickets : ");
    int tickets=sc.nextInt();

    System.out.println("------Ticket Details------");
    System.out.println("Passenger Name : "+name);
    System.out.println("Destination : "+destination);
    System.out.println("Tickets Booked : "+tickets);
}

public static void main(String args[]){
    ticketbooking();
}
}
