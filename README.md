# 🛒 Shopping Cart Application – Java

A simple **console-based Shopping Cart application developed using Java** to practice core programming concepts and Object-Oriented Programming (OOP). The project allows users to manage products, calculate cart totals, remove items, and complete purchases through an interactive menu-driven interface.

## ✨ Features

- ➕ Add products with a name and price
- 👀 Display all items in the shopping cart
- ❌ Remove products using their item numbers
- 💰 Calculate the total cost of the cart
- 🧾 Generate a bill during checkout
- 🗑️ Clear the cart automatically after checkout
- 🚪 Exit the application safely
- ✅ Handle basic invalid inputs

## 🛠️ Technologies and Concepts

- **Programming Language:** Java
- **Collections:** ArrayList
- **Input Handling:** Scanner
- **Object-Oriented Programming (OOP)**
- Classes and Objects
- Constructors and Encapsulation
- Methods and Code Reusability
- Loops and Conditional Statements
- Switch Statements
- Basic Input Validation

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ Application Overview

The application presents a menu that allows users to perform different shopping cart operations.

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

Users can enter a product name and its price to add it to the cart.

**Example:**

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2️⃣ View Cart

Displays the products currently in the cart along with their corresponding prices.

**Example:**

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3️⃣ Remove Products

Users can remove an item by entering its position in the displayed cart.

**Example:**

```text
Enter product number to remove: 2

Mouse removed.
```

### 4️⃣ Calculate Total

Computes the combined price of all products currently in the cart.

**Example:**

```text
Total: ₹1298.00
```

### 5️⃣ Checkout and Generate Bill

Generates a final bill listing the purchased products and the total amount. Once checkout is completed, the cart is emptied so that a new shopping session can begin.

**Example:**

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6️⃣ Exit Application

Terminates the program and displays a farewell message.

```text
Thank you for using Shopping Cart!
```

## 🧠 Java Concepts Implemented

This project demonstrates the practical use of the following Java fundamentals:

- Creating and working with classes and objects
- Using constructors to initialize objects
- Applying basic encapsulation principles
- Managing collections with `ArrayList`
- Accepting input through `Scanner`
- Organizing logic into reusable methods
- Iterating through collections using `for` and enhanced `for` loops
- Using `while` loops for repeated menu operations
- Implementing decisions with `if-else` statements
- Handling menu choices using `switch`
- Performing basic input validation

## 📦 Product Class

Each product is represented by a `Product` object that stores its name and price.

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

This class demonstrates how Java objects can represent real-world entities and group related data together.

## 🔄 Application Workflow

```text
Start Application
       ↓
Display Menu
       ↓
Choose an Operation
       ↓
Add / View / Remove Products
       ↓
Calculate Total or Checkout
       ↓
Clear Cart After Checkout
       ↓
Return to Main Menu
       ↓
Exit Application
```

## ▶️ Installation and Execution

### Prerequisites

Ensure that the Java Development Kit (JDK) is installed on your computer.

Verify your installation by running:

```bash
java --version
javac --version
```

### Compile the Program

Open a terminal in the project directory and execute:

```bash
javac ShoppingCart.java
```

### Run the Application

```bash
java ShoppingCart
```

The interactive shopping cart menu will appear in the terminal.

## 🚀 Planned Enhancements

The application can be extended with additional functionality, including:

- 📦 Managing product quantities
- 🆔 Assigning unique IDs to products
- 🔍 Searching for products
- 🎟️ Applying discounts and coupon codes
- 🧾 Calculating GST and other applicable taxes
- 💾 Saving data using file handling
- 🗄️ Integrating a MySQL database
- 👤 Implementing user registration and authentication
- 🖥️ Developing a graphical user interface (GUI)

## 🎯 Project Objective

The objective of this project is to build a practical understanding of **Java fundamentals and Object-Oriented Programming** through a simple, real-world application.

Developing this project provided hands-on practice with classes, objects, collections, methods, loops, user input, and menu-driven program design.

## 👨‍💻 Author

**Raj Sharma**

A beginner-friendly Java project created for learning and practicing Object-Oriented Programming, Java Collections, and basic application development.

## 📄 License

This project is intended for educational and learning purposes. You are welcome to explore, modify, and extend the code for personal practice and improvement.
