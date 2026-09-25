# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application built with Java**. This project was created to practice core Java concepts such as **Object-Oriented Programming (OOP), ArrayList, methods, loops, switch statements, and user input handling**.

## ✨ Features

- ➕ Add products to the shopping cart
- 👀 View products in the cart
- ❌ Remove products from the cart
- 💰 Calculate the total price
- 🧾 Checkout and generate a bill
- 🗑️ Automatically clear the cart after checkout
- 🚪 Exit the application
- ✅ Basic input validation

## 🛠️ Technologies & Concepts

- **Java**
- **ArrayList**
- **Scanner**
- **Object-Oriented Programming (OOP)**
- **Loops & Conditional Statements**
- **Methods**
- **Classes & Objects**

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ How the Application Works

When the program starts, it displays a menu with different shopping cart operations:

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit
```

### 1️⃣ Add Product

Enter the product name and its price to add a new item to the cart.

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2️⃣ View Cart

Displays all products currently in the cart along with their prices.

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3️⃣ Remove Product

Select a product by its number to remove it from the cart.

```text
Enter product number to remove: 2

Mouse removed.
```

### 4️⃣ View Total

Calculates and displays the total cost of all products in the cart.

```text
Total: ₹1298.00
```

### 5️⃣ Checkout

Generates a final bill containing the products and total amount. Once checkout is completed, the cart is automatically cleared.

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6️⃣ Exit

Closes the application.

```text
Thank you for using Shopping Cart!
```

## 🧠 Concepts Practiced

This project provides hands-on practice with several fundamental Java concepts:

- Classes and Objects
- Constructors
- Basic Encapsulation
- ArrayList
- Scanner for user input
- Methods
- `for` and `while` loops
- `if-else` statements
- `switch` statements
- Enhanced `for` loops
- Basic input validation

## 📦 Product Class

Each product is represented using a `Product` object containing its name and price.

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

## 🔄 Program Flow

```text
Start
  ↓
Display Menu
  ↓
Select an Option
  ↓
Add / View / Remove / Calculate Total
  ↓
Checkout
  ↓
Clear Cart
  ↓
Return to Menu
  ↓
Exit
```

## ▶️ How to Run

Make sure Java is installed on your system.

Check the installed Java version:

```bash
java --version
javac --version
```

Compile the program:

```bash
javac ShoppingCart.java
```

Run the application:

```bash
java ShoppingCart
```

## 🚀 Future Improvements

The application can be extended with additional features such as:

- 📦 Product quantities
- 🆔 Unique product IDs
- 🔍 Product search
- 🎟️ Discount and coupon support
- 🧾 GST/tax calculation
- 💾 File-based data storage
- 🗄️ MySQL database integration
- 👤 User authentication and accounts
- 🖥️ Graphical User Interface (GUI)

## 🎯 Learning Objective

The main objective of this project is to strengthen **core Java and Object-Oriented Programming skills** by building a simple real-world application.

It provides practical experience with **classes, objects, collections, methods, user input, and application logic**.

## 👨‍💻 Author

**Raj Sharma**

A Java learning project created to practice **Object-Oriented Programming and Java Collections**.

## 📄 License

This project is created for **educational purposes**.

Feel free to use, modify, and improve the project for learning and practice.
