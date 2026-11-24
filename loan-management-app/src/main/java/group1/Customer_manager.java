package Customer
‎
‎import java.util.ArrayList;
‎import java.uti.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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




public boolean saveCustomer(Customer customer) {

    String sql = "INSERT INTO customers " +
            "(customer_id, first_name, last_name, national_id, phone, email, address, employment_status, monthly_income) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {

        statement.setInt(1, customer.getCustomerId());
        statement.setString(2, customer.getFirstName());
        statement.setString(3, customer.getLastName());
        statement.setString(4, customer.getNationalId());
        statement.setString(5, customer.getPhone());
        statement.setString(6, customer.getEmail());
        statement.setString(7, customer.getAddress());
        statement.setString(8, customer.getEmploymentStatus());
        statement.setDouble(9, customer.getMonthlyIncome());

        int rowsInserted = statement.executeUpdate();

        return rowsInserted > 0;

    } catch (SQLException e) {

        System.out.println("Customer registration failed!");
        System.out.println(e.getMessage());

        return false;
    }
}


}



}





 