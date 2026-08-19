# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application built with Java**.
This project demonstrates core Java and Object-Oriented Programming concepts by allowing users to add, view, remove, and purchase products through an interactive menu.

---

## 📌 Features

* ➕ Add products to the shopping cart
* 👀 View all products in the cart
* ❌ Remove products from the cart
* 💰 Calculate the total price
* 🧾 Generate a bill during checkout
* 🗑️ Automatically clear the cart after checkout
* 🚪 Exit the application
* ✅ Basic input validation

---

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Scanner**
* **Object-Oriented Programming (OOP)**
* **Java Collections Framework**

---

## 📂 Project Structure

```text
ShoppingCart/
│
├── ShoppingCart.java
└── README.md
```

---

## ⚙️ How the Application Works

When the program starts, it displays an interactive menu:

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit
```

The user selects an option by entering the corresponding number.

### 1️⃣ Add Product

The user enters the product name and price.

```text
Enter product name: Keyboard
Enter price: 799

Product added to cart!
```

The product is stored as a `Product` object inside an `ArrayList<Product>`.

---

### 2️⃣ View Cart

Displays all products currently added to the cart.

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
3. Headphones - ₹1299.00
```

Each product is displayed with its position, name, and price.

---

### 3️⃣ Remove Product

The user can remove a product by entering its number.

```text
Enter product number to remove: 2

Mouse removed.
```

The selected product is removed from the `ArrayList`.

---

### 4️⃣ View Total

The application calculates the total price of all products currently in the cart.

```text
Total: ₹2097.00
```

The total is calculated by adding the price of every product in the cart.

---

### 5️⃣ Checkout

The checkout option generates a simple bill containing all products and the final total.

```text
===== BILL =====
Keyboard - ₹799.00
Headphones - ₹1299.00

Total: ₹2098.00

Thank you for shopping!
```

After checkout, the cart is automatically cleared so that a new shopping session can begin.

---

### 6️⃣ Exit

Selecting option `6` terminates the application.

```text
Thank you for using Shopping Cart!
```

---

## 🧠 Concepts Demonstrated

This project demonstrates several fundamental Java programming concepts:

* Classes and Objects
* Constructors
* Object-Oriented Programming
* Encapsulation basics
* `ArrayList`
* `Scanner`
* `while` loops
* `switch` statements
* `if-else` statements
* Enhanced `for` loops
* Methods
* Collection operations
* User input handling
* Basic input validation

---

## 📦 Product Class

The `Product` class represents an individual product in the shopping cart.

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

### Product Attributes

| Attribute | Description              |
| --------- | ------------------------ |
| `name`    | Stores the product name  |
| `price`   | Stores the product price |

Each product is created as an object and stored in the shopping cart.

---

## 🔄 Application Flow

```text
              ┌─────────────────┐
              │     Start       │
              └────────┬────────┘
                       │
                       ▼
              ┌─────────────────┐
              │   Display Menu  │
              └────────┬────────┘
                       │
        ┌──────────────┼──────────────┐
        │              │              │
        ▼              ▼              ▼
   Add Product     View Cart     Remove Product
        │              │              │
        └──────────────┼──────────────┘
                       │
                       ▼
                 View Total
                       │
                       ▼
                   Checkout
                       │
                       ▼
               Clear Cart
                       │
                       ▼
                 Exit / Menu
```

---

## ▶️ How to Run

### Prerequisites

Make sure **Java JDK** is installed on your system.

Check your Java installation:

```bash
java --version
```

Check the Java compiler:

```bash
javac --version
```

---

### 1. Clone the Repository

```bash
git clone <your-repository-url>
```

### 2. Navigate to the Project

```bash
cd ShoppingCart
```

### 3. Compile the Program

```bash
javac ShoppingCart.java
```

### 4. Run the Program

```bash
java ShoppingCart
```

---

## 💻 Example Usage

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit

Enter choice: 1

Enter product name: Keyboard
Enter price: 799

Product added to cart!

Enter choice: 1

Enter product name: Mouse
Enter price: 499

Product added to cart!

Enter choice: 2

===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00

Enter choice: 4

Total: ₹1298.00

Enter choice: 5

===== BILL =====
Keyboard - ₹799.00
Mouse - ₹499.00

Total: ₹1298.00

Thank you for shopping!
```

---

## 🚀 Future Improvements

The project can be extended with more advanced features:

* 📦 Product quantity management
* 🔢 Product IDs
* 🔍 Product search
* ✏️ Update product quantity
* 🎟️ Discount and coupon system
* 💸 Tax/GST calculation
* 💾 File-based data storage
* 🗄️ Database integration using MySQL
* 👤 User login and accounts
* 🖥️ Graphical User Interface (GUI)
* 📊 Product inventory management
* 🧾 Improved invoice generation

---

## 🎯 Learning Objectives

The main objective of this project is to practice fundamental Java programming concepts through a small real-world application.

By completing this project, you can understand how to:

1. Create and use Java classes and objects.
2. Store objects using `ArrayList`.
3. Take input using `Scanner`.
4. Implement menu-driven programs.
5. Use loops and conditional statements.
6. Create reusable methods.
7. Perform calculations using object data.
8. Build a simple console-based application.

---

## 👨‍💻 Author

**Raj Sharma**

This project was created as a **Java learning project** to practice Object-Oriented Programming and Java Collections.

---

## 📄 License

This project is created for **learning and educational purposes**.

Feel free to use, modify, and improve the code for your own learning.
