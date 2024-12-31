Messaging Queues with RabbitMQ and Spring Boot

This repository demonstrates the implementation of Messaging Queues using RabbitMQ and Spring Boot. Messaging queues play a crucial role in enabling asynchronous operations, minimizing load time, and efficiently utilizing resources in software applications.  

📖 Introduction  
Messaging Queues provide a mechanism for asynchronous communication between components in software systems.  
This implementation uses RabbitMQ, a lightweight, open-source message broker that works using the Advanced Messaging Queue Protocol (AMQP)

🛠 Core Concepts  
1. Producer: Sends the message.  
2. Exchange: Routes messages to appropriate queues based on routing keys.  
3. Queue: Holds the messages until they are consumed.  
4. Consumer: Receives the messages from the queue.  

🏗 Project Features  
- Set up RabbitMQ using Docker and explored its Management UI.  
- Developed a complete message queue workflow using Spring Boot.  
- Implemented producers, exchanges, and consumers to demonstrate real-world scenarios.  

⚙️ Prerequisites  
1. Docker Desktop: Installed and configured to run RabbitMQ.  
2. RabbitMQ Image: Installed along with the Management UI.  
3. Java Development Kit (JDK 17): Ensure Java is installed on your system.  

🏁 Setup and Configuration  

# 1. Clone the Repository   
git clone https://github.com/your-username/messaging-queues-rabbitmq.git  
cd messaging-queues-rabbitmq  

# 2. Run RabbitMQ Using Docker  
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management.
Access the RabbitMQ Management UI at [http://localhost:15672](http://localhost:15672).  

# 3. Configure the Application  
Update the `application.properties` file with RabbitMQ connection details:  
properties  
spring.rabbitmq.host=localhost  
spring.rabbitmq.port=5672  
spring.rabbitmq.username=guest  
spring.rabbitmq.password=guest  
  
# 4. Run the Application  
Run the Spring Boot application:  
bash  
./mvnw spring-boot:run  
  
 🛠 Project Structure  
  src/main/java/com/practice/rabbitMQ
    ├── Config       # RabbitMQ configuration
    ├── DTO          # Data Transfer Objects
    ├── Producer     # Producer implementation
    ├── Consumer     # Consumer implementation
    └── Application  # Main Spring Boot application
  
 💻 Dependencies Used  

1. Spring Boot AMQP Starter: Provides RabbitMQ integration for Spring applications.  
2. Spring Rabbit Test: For testing RabbitMQ-related components.  

xml  
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.amqp</groupId>
    <artifactId>spring-rabbit-test</artifactId>
</dependency>
 
🧪 Features Demonstrated  
1. Message Production: Sending messages to the queue.  
2. Message Consumption: Reading messages from the queue.  
3. JSON Message Conversion: Using `Jackson2JsonMessageConverter` for message serialization and deserialization.  
4. Error Handling: Configuring fail-safes for message processing.  

✨ Learning Highlights
- Set up and configured RabbitMQ with Docker.  
- Explored RabbitMQ Management UI for monitoring queues and messages.  
- Implemented messaging queues using Spring Boot with a clean and structured approach.  
- Tested different messaging scenarios and workflows.  

🔗 Contact  
For any queries or suggestions, connect with me at https://www.linkedin.com/in/zohaib-ahmed1/  or drop an email at zohaib89769@gmail.com.  
Happy Coding! 💻🎉  

