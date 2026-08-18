# 🛒 Shopping Cart – Java

A simple **console-based Shopping Cart application** built using Java.

This project allows users to add products to a shopping cart, view products, remove products, calculate the total price, and checkout.

## 📌 Features

* ➕ Add products to the cart
* 👀 View all products in the cart
* ❌ Remove a product from the cart
* 💰 Calculate the total price
* 🧾 Generate a bill during checkout
* 🗑️ Automatically clear the cart after checkout
* 🚪 Exit the application

## 🛠️ Technologies Used

* **Java**
* `ArrayList`
* `Scanner`
* Object-Oriented Programming (OOP)

## 📂 Project Structure

```text
ShoppingCart/
│
├── ShoppingCart.java
└── README.md
```

## ⚙️ How It Works

When the program starts, it displays a menu:

```text
===== SHOPPING CART =====
1. Add Product
2. View Cart
3. Remove Product
4. View Total
5. Checkout
6. Exit
```

The user can select an option by entering the corresponding number.

### 1. Add Product

The user enters:

* Product name
* Product price

The product is then stored in an `ArrayList<Product>`.

### 2. View Cart

Displays all products currently present in the cart along with their prices.

Example:

```text
===== YOUR CART =====
1. Keyboard - ₹799.00
2. Mouse - ₹499.00
3. Headphones - ₹1299.00
```

### 3. Remove Product

The user enters the product number they want to remove.

```text
Enter product number to remove: 2
Mouse removed.
```

### 4. View Total

Calculates the total price of all products in the cart.

```text
Total: ₹2097.00
```

### 5. Checkout

Displays the complete bill and calculates the final amount.

After checkout, the cart is automatically cleared.

```text
===== BILL =====
Keyboard - ₹799.00
Headphones - ₹1299.00
Total: ₹2098.00
Thank you for shopping!
```

### 6. Exit

Terminates the program.

## 🧠 Concepts Used

This project demonstrates several basic Java concepts:

* Classes and Objects
* Constructors
* Encapsulation basics
* `ArrayList`
* `Scanner`
* `while` loop
* `switch` statement
* `if-else`
* Enhanced `for` loop
* Methods from Java Collections
* Basic input validation
* Object-oriented programming

## 📦 Product Class

The `Product` class stores information about each product:

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

Each product contains:

* `name` → Product name
* `price` → Product price

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Open the project directory

```bash
cd ShoppingCart
```

### 3. Compile the program

```bash
javac ShoppingCart.java
```

### 4. Run the program

```bash
java ShoppingCart
```

## 💻 Example

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
Enter price: ₹799

Product added to cart!

Enter choice: 2

===== YOUR CART =====
1. Keyboard - ₹799.00

Enter choice: 4

Total: ₹799.00
```

## 🚀 Future Improvements

Some features that can be added in future versions:

* Product quantity
* Discount and coupon system
* Tax/GST calculation
* Product IDs
* Search products
* Update product quantity
* Persistent storage using files
* Database integration
* Login and user accounts
* Graphical User Interface (GUI)

## 👨‍💻 Author

**Raj Sharma**

## 📄 License

This project is created for **learning and educational purposes**.
