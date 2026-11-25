# 🛒 Shopping Cart Application – Java

A simple, beginner-friendly **Shopping Cart Application built using Java**. This console-based project replicates basic shopping cart functionality, enabling users to add products, browse cart contents, remove items, view the total cost, and generate a bill through an interactive menu-driven system.

The project was developed to improve practical Java programming skills while exploring essential concepts such as Object-Oriented Programming (OOP), Java Collections, user input handling, and application logic.

## ✨ Features

- ➕ **Add Products** – Add new products to the cart by providing their names and prices.
- 👀 **View Cart** – Display all items currently in the cart along with their respective prices.
- ❌ **Remove Products** – Delete selected products by specifying their item numbers.
- 💰 **View Total Amount** – Calculate the combined price of all products in the cart.
- 🧾 **Checkout and Billing** – Generate a bill displaying purchased items and the final payable amount.
- 🗑️ **Clear Cart** – Automatically remove all items from the cart after checkout.
- 🚪 **Exit Application** – Safely terminate the program.
- ✅ **Input Validation** – Handle basic invalid inputs to ensure smoother interaction.

## 🛠️ Technologies and Concepts

- **Programming Language:** Java
- **Collections Framework:** ArrayList
- **Input Handling:** Scanner
- Object-Oriented Programming (OOP)
- Classes, Objects, and Constructors
- Encapsulation
- Methods and Code Reusability
- Loops and Conditional Statements
- Switch-Case Statements
- Basic Input Validation

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ Application Overview

The application operates through a simple interactive menu that allows users to choose and perform different shopping cart operations.

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit
```

### 1️⃣ Add Products

Users can enter the name and price of a product to add it to their shopping cart.

**Example:**

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2️⃣ View Cart

Displays all the products currently stored in the cart, including their names and individual prices.

**Example:**

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3️⃣ Remove Products

Users can select and remove a specific product by entering its corresponding item number.

**Example:**

```text
Enter product number to remove: 2

Mouse removed.
```

### 4️⃣ Calculate Total

Computes the total cost of all products currently present in the shopping cart.

**Example:**

```text
Total: ₹1298.00
```

### 5️⃣ Checkout and Generate Bill

Generates a purchase summary containing the names and prices of all items, followed by the final bill amount.

Once checkout is completed, the shopping cart is automatically emptied so users can begin a new shopping session.

**Example:**

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6️⃣ Exit Application

Provides an option to close the application safely, displaying a farewell message before terminating the program.

```text
Thank you for using Shopping Cart!
```

## 🧠 Java Concepts Practiced

This project helped reinforce several fundamental Java concepts through practical implementation:

- Creating classes and objects to represent real-world entities.
- Using constructors to initialize objects.
- Applying encapsulation to organize and manage data.
- Managing product information using the `ArrayList` collection.
- Handling keyboard input through the `Scanner` class.
- Developing reusable methods for different application operations.
- Traversing collections using standard and enhanced `for` loops.
- Using `while` loops to maintain continuous menu execution.
- Implementing conditional logic with `if-else` statements.
- Handling menu selections using `switch` statements.
- Performing basic validation of user-provided inputs.

## 📦 Product Class

A dedicated `Product` class is used to represent individual items in the shopping cart. Each product object contains two attributes: its name and price.

```java
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
```

This implementation demonstrates how Java classes and objects can model real-world entities while keeping related information organized within a single structure.

## 🔄 Application Workflow

```text
Start Application
       ↓
Display Main Menu
       ↓
Choose an Operation
       ↓
Add / View / Remove Products
       ↓
Calculate Total or Proceed to Checkout
       ↓
Generate Bill and Clear Cart
       ↓
Return to Main Menu
       ↓
Exit Application
```

## ▶️ Installation and Execution

### Prerequisites

Ensure that the Java Development Kit (JDK) is installed and properly configured on your system.

Check your Java installation using:

```bash
java --version
javac --version
```

### Compile the Program

Open a terminal, navigate to the project directory, and compile the Java source file:

```bash
javac ShoppingCart.java
```

### Run the Application

Execute the following command:

```bash
java ShoppingCart
```

The interactive shopping cart menu will appear in your terminal, allowing you to perform the available operations.

## 🚀 Future Enhancements

The application can be further developed by introducing additional functionality, such as:

- 📦 Implementing product quantity management.
- 🆔 Generating unique IDs for individual products.
- 🔍 Adding a product search feature.
- 🎟️ Introducing discount coupons and promotional offers.
- 🧾 Implementing GST and tax calculations.
- 💾 Saving cart information using Java file handling.
- 🗄️ Integrating a MySQL database for persistent data storage.
- 👤 Developing user registration and authentication.
- 🖥️ Creating a graphical user interface (GUI).

## 🎯 Learning Objectives

The primary objective of this project was to strengthen Java fundamentals by developing a practical application based on a familiar real-world concept.

Building this shopping cart provided hands-on experience in implementing Object-Oriented Programming principles, working with collections, creating reusable methods, handling user input, and developing interactive console-based applications.

## 👨‍💻 Author

**Raj Sharma**

A beginner-friendly Java project developed as part of my programming learning journey, with a focus on strengthening core Java concepts, understanding OOP principles, and gaining practical application development experience.

## 📄 License

This project is intended for educational and personal learning purposes. You are welcome to explore the source code, modify its implementation, and use it for your own programming practice.
