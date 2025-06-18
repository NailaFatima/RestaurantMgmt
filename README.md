
# 🍽️ Restaurant Management System

A modular and extensible Restaurant Management System built with clean architecture and design principles. This Java-based backend handles operations like menu management, order processing, billing, payments, revenue tracking, and waitlist handling.

---

## 📁 Project Structure

- `controllers/` — Entry point for various client actions (e.g., placing order, making payment).
- `services/` — Business logic layer (one service per domain).
- `dtos/` — Data Transfer Objects for clean input/output handling.
- `models/` — Entity layer representing core domain objects.
- `repositories/` — Abstract data access layer (assumed to use JPA or similar).
- `util/DateUtil.java` — Utility class for date and time handling.
- `adapters/PaymentGatewayAdapter.java` — Adapter interface for integrating multiple payment gateways.
- `libraries/` — Plug-and-play APIs for different payment gateways.

---

## ✅ Features

### 🍔 Menu Management
- Add new menu items with dietary filters, item type, price, and description.
- Fetch menu items with or without dietary filtering.

### 🧾 Order & Billing
- Place orders containing multiple menu items.
- Generate final bill for completed orders.

### 💳 Payment Integration
- Unified interface (`PaymentGatewayAdapter`) to interact with different third-party payment gateways.
- Generate transaction IDs and status using chosen payment API from `libraries/`.

### 📈 Revenue Calculation
- Compute revenue based on query type (e.g., daily, weekly, monthly).
- Supports admin-level access to aggregated financial data.

### 🪑 Waitlist Management
- Add users to a restaurant waitlist.
- Update waitlist dynamically based on table availability.
- Fetch current position in waitlist for any user.

---

## 🏗️ Design Patterns Used

| Pattern               | Usage                                                                 |
|------------------------|------------------------------------------------------------------------|
| **Adapter**           | `PaymentGatewayAdapter` abstracts integration of multiple payment APIs. |
| **Service**           | Encapsulation of business logic in `OrderService`, `MenuService`, etc. |
| **Controller**        | Separation of concerns with dedicated controllers for each domain.     |
| **DTO**               | Request/response objects for all APIs to ensure loose coupling.         |
| **Factory**           | Likely used to instantiate specific payment gateway implementations.   |

---

## 🧪 Sample Flow

1. **Customer** browses the menu and places an order.
2. **System** generates a bill once order is finalized.
3. **Customer** makes payment through the integrated gateway (Stripe, Razorpay, etc.).
4. **Admin** calculates total revenue.
5. **New customers** are handled via a waitlist when all tables are full.

---

## ⚙️ Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/restaurant-management-system.git
   ```
2. Configure your backend database and application properties.
3. Build and run the project via your preferred Java IDE or build tool.

---

## 👨‍💻 Author

Developed by Naila — Clean, modular, and scalable backend for modern restaurant operations.

---
