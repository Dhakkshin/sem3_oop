// Create classes that capture bank customers and bank accounts.
// A customer has a first and last name.An account has a customer and balance.
// Make objects for two accounts held by the same customer.

package Exp6;

public class Q2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Dhakkshin", "S R");

        Account account1 = new Account(customer, 1000000000.0);
        Account account2 = new Account(customer, 2000000000.0);

        System.out.println("Account 1:\n" + account1.details());
        System.out.println("Account 2:\n" + account2.details());
    }
    
}

class Customer {
    String firstName, lastName;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Account {
    Customer customer;
    double balance;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public String details() {
        return "\tCustomer: \n\t\t" + customer.firstName + " " + customer.lastName +
                "\n\tBalance: \n\t\t" + balance;
    }
}