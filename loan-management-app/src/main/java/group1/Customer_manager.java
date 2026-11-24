package Customer
‎
‎import java.util.ArrayList;
‎import java.uti.Scanner;
‎
‎public class Customer_manager {
‎  
‎     private ArrayList<Customer> customers = new ArrayList<>();

public void registerCustomer() {

    Scanner input = new Scanner(System.in);

    System.out.println("\n===== CUSTOMER REGISTRATION =====");

    System.out.print("Customer ID: ");
    int id = input.nextInt();
    input.nextLine();

    System.out.print("First Name: ");
    String firstName = input.nextLine();

    System.out.print("Last Name: ");
    String lastName = input.nextLine();

    System.out.print("National ID: ");
    String nationalId = input.nextLine();

    System.out.print("Phone: ");
    String phone = input.nextLine();

    System.out.print("Email: ");
    String email = input.nextLine();

    System.out.print("Address: ");
    String address = input.nextLine();

    System.out.print("Employment Status: ");
    String employmentStatus = input.nextLine();

    System.out.print("Monthly Income: ");
    double income = input.nextDouble();



    Customer customer = new Customer(
            id, firstName, lastName, nationalId,
            phone, email, address, employmentStatus, income
    );

    customers.add(customer);

}



}





 