# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application built with Java** to practice **Object-Oriented Programming (OOP), ArrayList, methods, loops, and user input handling**.

## 📌 Features

* ➕ Add products to the cart
* 👀 View all items in the cart
* ❌ Remove products from the cart
* 💰 Calculate the total price
* 🧾 Checkout and generate a bill
* 🗑️ Automatically clear the cart after checkout
* 🚪 Exit the application
* ✅ Basic input validation

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Scanner**
* **Object-Oriented Programming (OOP)**

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ How It Works

When the application starts, a menu is displayed:

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

The user can enter a product name and its price.

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2. View Cart

Displays all products currently added to the cart along with their prices.

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3. Remove Product

The user can select a product by its number to remove it from the cart.

```text
Enter product number to remove: 2

Mouse removed.
```

### 4. View Total

Calculates and displays the total price of all products in the cart.

```text
Total: ₹1298.00
```

### 5. Checkout

Displays a final bill containing all products and the total amount. After checkout, the cart is automatically cleared.

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6. Exit

Closes the application.

```text
Thank you for using Shopping Cart!
```

## 🧠 Concepts Practiced

This project covers several fundamental Java concepts:

* Classes and Objects
* Constructors
* Basic Encapsulation
* ArrayList
* Scanner for user input
* Methods
* Loops
* `if-else` statements
* `switch` statements
* Enhanced `for` loops
* Basic input validation

## 📦 Product Class

Each product is represented as a `Product` object containing its name and price.

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

Make sure Java is installed on your system:

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

The project can be expanded with features such as:

* Product quantities
* Unique product IDs
* Product search
* Discounts and coupon codes
* GST/tax calculation
* File-based data storage
* MySQL database integration
* User authentication and accounts
* Graphical User Interface (GUI)

## 🎯 Learning Objective

The primary goal of this project is to strengthen **core Java and Object-Oriented Programming concepts** by building a simple real-world application.

It also provides hands-on practice with **objects, collections, user input, and basic application logic**.

## 👨‍💻 Author

**Raj Sharma**

A Java learning project created to practice **Object-Oriented Programming and Java Collections**.

## 📄 License

This project is created for **educational purposes**.

Feel free to use, modify, and improve it for learning.
