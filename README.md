# 🛒 Shopping Cart Application – Java

A beginner-friendly, console-based **Shopping Cart Application developed using Java**. This project simulates basic shopping cart operations, allowing users to add products, view cart items, remove products, calculate the total amount, and complete checkout through an interactive menu-driven interface.

The application was created to strengthen Java programming fundamentals and gain practical experience with Object-Oriented Programming (OOP), Java Collections, and basic application logic.

## ✨ Features

- ➕ **Add Products** – Add products to the cart by entering their names and prices.
- 👀 **View Cart** – Display all available products along with their prices.
- ❌ **Remove Products** – Remove selected items using their respective item numbers.
- 💰 **Calculate Total** – Calculate the combined cost of all products in the cart.
- 🧾 **Checkout and Billing** – Generate a bill containing the purchased items and final amount.
- 🗑️ **Clear Cart** – Automatically empty the cart after successful checkout.
- 🚪 **Exit Application** – Close the program safely.
- ✅ **Input Validation** – Handle basic invalid user inputs.

## 🛠️ Technologies and Concepts

- **Programming Language:** Java
- **Collections Framework:** ArrayList
- **Input Handling:** Scanner
- Object-Oriented Programming (OOP)
- Classes, Objects, and Constructors
- Encapsulation
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

The program uses a menu-driven interface through which users can perform various shopping cart operations.

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

Users can enter a product name and its price to add a new item to the shopping cart.

**Example:**

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2️⃣ View Cart

Displays a list of all products currently added to the cart, including their individual prices.

**Example:**

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3️⃣ Remove Products

Allows users to remove a particular product by entering its corresponding item number.

**Example:**

```text
Enter product number to remove: 2

Mouse removed.
```

### 4️⃣ Calculate Total

Calculates and displays the total price of all products currently available in the shopping cart.

**Example:**

```text
Total: ₹1298.00
```

### 5️⃣ Checkout and Generate Bill

Displays a purchase summary containing all cart items and their total cost. After completing checkout, the cart is automatically cleared, allowing users to start a fresh shopping session.

**Example:**

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6️⃣ Exit Application

Allows users to terminate the application and displays a closing message before exiting.

```text
Thank you for using Shopping Cart!
```

## 🧠 Java Concepts Practiced

Through this project, the following Java programming concepts were implemented:

- Defining classes and creating objects.
- Initializing objects using constructors.
- Understanding and applying encapsulation.
- Storing and managing product data using `ArrayList`.
- Taking user input with the `Scanner` class.
- Creating reusable methods to organize program functionality.
- Iterating through collections using standard and enhanced `for` loops.
- Using `while` loops to maintain continuous menu operations.
- Implementing decision-making with `if-else` statements.
- Managing user choices through `switch` statements.
- Performing basic input validation.

## 📦 Product Class

The application uses a separate `Product` class to represent individual products. Each object stores the product's name and price.

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

This demonstrates how classes and objects can be used to represent real-world entities while keeping related data organized.

## 🔄 Application Workflow

```text
Start Application
       ↓
Display Menu
       ↓
Select an Operation
       ↓
Add / View / Remove Products
       ↓
Calculate Total or Checkout
       ↓
Generate Bill and Clear Cart
       ↓
Return to Main Menu
       ↓
Exit Application
```

## ▶️ Installation and Execution

### Prerequisites

Make sure the Java Development Kit (JDK) is installed on your system.

Verify the installation using the following commands:

```bash
java --version
javac --version
```

### Compile the Program

Navigate to the project directory in your terminal and execute:

```bash
javac ShoppingCart.java
```

### Run the Application

```bash
java ShoppingCart
```

The shopping cart menu will appear in your terminal, allowing you to interact with the application.

## 🚀 Future Improvements

Some additional features that could make this application more advanced include:

- 📦 Adding quantity management for products.
- 🆔 Assigning unique identification numbers to products.
- 🔍 Implementing product search functionality.
- 🎟️ Supporting discount codes and coupons.
- 🧾 Including GST and applicable tax calculations.
- 💾 Storing shopping cart data using file handling.
- 🗄️ Integrating a MySQL database for persistent storage.
- 👤 Adding user registration and login functionality.
- 🖥️ Building a graphical user interface (GUI).

## 🎯 Learning Objectives

The main goal of this project was to apply Java fundamentals to a practical, real-world scenario while developing a better understanding of Object-Oriented Programming.

Working on this application provided hands-on experience with classes, objects, constructors, collections, methods, loops, user input, and menu-driven application development.

## 👨‍💻 Author

**Raj Sharma**

A beginner-level Java project developed as part of my programming journey to practice Java fundamentals, OOP principles, and basic application development.

## 📄 License

This project is created for educational and learning purposes. Feel free to explore the source code, make modifications, and use it for your own programming practice.
