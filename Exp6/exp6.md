<div style="display: flex; justify-content: space-between;">
    <div style="text-align: left;"><h3>Experiment 6</h3></div>
    <div style="text-align: right;"><h3>Date: 12/09/2023</h3></div>
</div>
<div style="text-align: right;"><h3>Roll number: 22z215</h3></div>

<h1 style="text-align: center;">Classes and objects</h1>

### 1. Create a class Employee with the following details. The data members are name,address, age, gender and the method display() to show employee details.
**Aim:**   
to create a Java class called Employee with properties name, address, age, and gender, and a method called display that prints the employee details to the console.

**Code:**
```java
// Create a class Employee with the following details.
// The data members are name,address, age, gender and the method display() to show employee details.

package Exp6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee me = new Employee();

        System.out.print("Enter name: ");
        me.name = input.nextLine();
        System.out.print("Enter address: ");
        me.address = input.nextLine();
        System.out.print("Enter age: ");
        me.age = input.nextInt();
        input.nextLine(); // to consume new line char
        System.out.print("Enter gender: ");
        me.gender = input.nextLine();

        System.out.println();
        me.display();

        input.close();
    }
}


class Employee {
    String name;
    String address;
    int age;
    String gender;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
```

**Output:**
```
Enter name: dhakkshin
Enter address: coimbatore
Enter age: 19
Enter gender: male

Name: dhakkshin
Address: coimbatore
Age: 19
Gender: male
```
---

### 2. Create classes that capture bank customers and bank accounts.A customer has a first and last name.An account has a customer and balance.Make objects for two accounts held by the same customer.
**Aim:**    
To create classes that capture bank customers and bank accounts and make objects for two accounts held by the same customer.

**Code:**
```java
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
```

**Output:**  
```
Account 1:
        Customer: 
                Dhakkshin S R
        Balance: 
                1.0E9
Account 2:
        Customer: 
                Dhakkshin S R
        Balance: 
                2.0E9
```
---

## Result:
All the programs are executed and the output are verified.

---
---
