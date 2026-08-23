# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application built using Java**.
This project is created to practice **Java, OOP, ArrayList, and user input**.

## 📌 Features

* ➕ Add products
* 👀 View cart
* ❌ Remove products
* 💰 View total price
* 🧾 Checkout and generate bill
* 🗑️ Clear cart after checkout
* 🚪 Exit program
* ✅ Basic input validation

## 🛠️ Technologies Used

* Java
* ArrayList
* Scanner
* Object-Oriented Programming (OOP)

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ How It Works

When the program starts, it shows a menu:

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit
```

### 1. Add Product

Enter the product name and price.

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2. View Cart

Shows all products currently in the cart.

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3. Remove Product

Enter the product number to remove it.

```text
Enter product number to remove: 2

Mouse removed.
```

### 4. View Total

Calculates the total price of all products.

```text
Total: ₹1298.00
```

### 5. Checkout

Displays the bill and clears the cart.

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6. Exit

Closes the program.

```text
Thank you for using Shopping Cart!
```

## 🧠 Concepts Used

This project demonstrates:

* Classes and Objects
* Constructors
* Encapsulation basics
* ArrayList
* Scanner
* Methods
* Loops
* if-else statements
* switch statements
* Enhanced for loops
* Basic input validation

## 📦 Product Class

Each product is represented using a `Product` object.

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
Choose an Option
  ↓
Add / View / Remove / Total
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

Make sure Java is installed:

```bash
java --version
javac --version
```

Compile the program:

```bash
javac ShoppingCart.java
```

Run the program:

```bash
java ShoppingCart
```

## 🚀 Future Improvements

Some possible improvements:

* Product quantity
* Product IDs
* Search products
* Discounts and coupons
* GST/tax calculation
* File storage
* MySQL database
* User accounts
* GUI

## 🎯 Learning Objective

The main goal of this project is to practice basic Java programming and understand how **objects and collections can be used to build a simple real-world application**.

## 👨‍💻 Author

**Raj Sharma**

A Java learning project created to practice **Object-Oriented Programming and Java Collections**.

## 📄 License

This project is created for **educational purposes**.
Feel free to use and modify it for learning.
