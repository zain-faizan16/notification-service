# 📢 Notification Service

The **Notification Service** is responsible for sending email notifications to users based on order and payment-related events in the eCommerce microservices system. It listens to events via RabbitMQ and sends transactional emails using simple email templates and SMTP.

---

## ✨ Features

- 📥 **Event Listener**:
  - Listens to `order.created`, `payment.success`, and `payment.failed` events via RabbitMQ.
- 📧 **Send Email Notifications**:
  - Sends emails to users based on event payloads.
- 🖋️ **Email Template Support**:
  - Supports basic templating for structured emails.
- 🔌 **SMTP Integration**:
  - Easily configurable for any SMTP server (Gmail, Mailtrap, etc.).

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **RabbitMQ** (for event consumption)
- **Spring Mail / SMTP** (for email delivery)

---

## 🗂️ Project Structure (Simplified)

```plaintext
notification-service/
├── controller/         # (optional, for testing)
├── dto/                # Event DTOs
├── listener/           # RabbitMQ listeners
├── service/
│   ├── EmailService.java
│   └── impl/EmailServiceImpl.java
├── template/           # Email templates
├── config/             # Mail and RabbitMQ config
├── application.yml
└── NotificationServiceApplication.java
