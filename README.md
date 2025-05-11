# Kafka Demo: Order & Payment Microservices

A simple Spring Boot project demonstrating inter-service communication using **Apache Kafka**.

## 🧱 Tech Stack

- Java + Spring Boot  
- Apache Kafka  
- Lombok

## 📦 Modules

- **Order Service** – sends order events to Kafka.
- **Payment Service** – listens for order events and processes payments.

## ▶️ How to Run

1. **Start Zookeeper & Kafka** (locally)
2. **Run Order Service**
   ```bash
   cd order-service
   ./mvnw spring-boot:run
   ```
3. **Run Payment Service**
   ```bash
   cd payment-service
   ./mvnw spring-boot:run
   ```

## 📝 Kafka Topic

- `order-events`

## ✅ Sample Output

```
Received Order for Payment: 101

```

