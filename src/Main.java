import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in airport system");
        System.out.println("Do you want book ticket");
        String s = input.next();
        if (s.equals("yes")  || s .equals("YES")) {

            Passenger passenger = new Passenger();
            System.out.println("Enter your information to book flight");
            System.out.print("Name is :  ");
            String n= Handle_exception_string();
            passenger.setName(n);
            System.out.print("Id is :  ");
            int id = Handle_exception_int();
            passenger.setId(id);
            System.out.print("Age is :  ");
            float age=Handle_exception_float();
            passenger.setAge(age);
            System.out.print("Gender is :  ");
            String gender = Handle_exception_string();
            passenger.setGender(gender);
            System.out.print("Passport num is :  ");
            int p = Handle_exception_int();
            passenger.setPassport_num(p);
            System.out.print("Nationality is :  ");
            String nat =Handle_exception_string();
            passenger.setNationality(nat);
            Flight flight = new Flight();
            System.out.print("Source country is :  ");
            String sr =Handle_exception_string();
            flight.setSource(sr);
            System.out.print("Destination country is :  ");
            String ds =Handle_exception_string();
            flight.setDestination(ds);
            Ticket ticket = new Ticket();
            ticket.book_ticket();
            System.out.println("Want to check your booking");
            String s2= input.next();
            if(s.equals("yes")||s.equals("Yes")) {
                System.out.println("------------------------------------------");

                flight.view_passenger(passenger);
                System.out.println("Information your ticket is: ");
                ticket.view_ticket();
            }
            else {
                System.out.println("Reservation successful");
            }
        }
        else {
            System.out.println("Any details visit our page");
        }
    }

    public static int Handle_exception_int() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter an Numeric value.");
            scanner.nextLine();
            result =Handle_exception_int() ;
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        };

        return result;
    }

    public static float Handle_exception_float() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;

        try {
            result = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter an Numeric value.");
            scanner.nextLine();
            result =Handle_exception_float() ;
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }

        return result;
    }
    public static String Handle_exception_string() {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        try {
            result = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter value.");
            scanner.nextLine();
            result =Handle_exception_string() ;
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }

        return result;
    }


}
