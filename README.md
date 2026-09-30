# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application built using Java**. This project was developed to practice fundamental Java programming concepts, including **Object-Oriented Programming (OOP), ArrayList, methods, loops, switch statements, and user input handling**.

## ✨ Features

- ➕ Add products to the shopping cart
- 👀 View all products in the cart
- ❌ Remove products from the cart
- 💰 Calculate the total cart value
- 🧾 Checkout and generate a bill
- 🗑️ Automatically clear the cart after checkout
- 🚪 Exit the application
- ✅ Basic input validation

## 🛠️ Technologies & Concepts Used

- **Java**
- **ArrayList**
- **Scanner**
- **Object-Oriented Programming (OOP)**
- **Classes & Objects**
- **Methods**
- **Loops**
- **Conditional Statements**
- **Switch Statements**
- **User Input Handling**

## 📂 Project Structure

```text
ShoppingCart/
├── ShoppingCart.java
└── README.md
```

## ⚙️ How It Works

When the application starts, a menu is displayed with several shopping cart operations:

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

Users can enter a product name and price to add an item to the cart.

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

### 2️⃣ View Cart

Displays all products currently added to the cart along with their prices.

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
```

### 3️⃣ Remove Product

Users can select a product by its number to remove it from the cart.

```text
Enter product number to remove: 2

Mouse removed.
```

### 4️⃣ View Total

Calculates and displays the total price of all products currently in the cart.

```text
Total: ₹1298.00
```

### 5️⃣ Checkout

The checkout option generates a final bill containing the products and total amount. After a successful checkout, the cart is automatically cleared.

```text
===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

### 6️⃣ Exit

Closes the application and displays a farewell message.

```text
Thank you for using Shopping Cart!
```

## 🧠 Java Concepts Practiced

This project provides practical experience with several core Java concepts:

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

## 🔄 Application Flow

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

The project can be further enhanced by adding features such as:

- 📦 Product quantity management
- 🆔 Unique product IDs
- 🔍 Product search functionality
- 🎟️ Discount and coupon system
- 🧾 GST/tax calculation
- 💾 File-based data storage
- 🗄️ MySQL database integration
- 👤 User authentication and accounts
- 🖥️ Graphical User Interface (GUI)

## 🎯 Learning Objective

The primary goal of this project is to strengthen **core Java and Object-Oriented Programming skills** by implementing a simple real-world application.

Through this project, I gained practical experience working with **classes, objects, collections, methods, user input, loops, and application logic**.

## 👨‍💻 Author

**Raj Sharma**

A Java learning project created to practice **Object-Oriented Programming, Java Collections, and basic application development**.

## 📄 License

This project was created for **educational purposes**.

Feel free to use, modify, and improve the project for learning and practice.
