package arrays;

public class SpringBootImpQuestion {
//    Interview Question
//
//    Interviewer:
//
//    Suppose 1000 users hit your Spring Boot application at the same time. Will your application create 1000 database connections?
//
//    Best Interview Answer (45–60 seconds)
//
//"No, Spring Boot will not create 1000 database connections. Spring Boot uses HikariCP as the default connection pool. Instead of creating a new connection for every request, HikariCP maintains a pool of reusable database connections, typically 10 by default. When a request needs database access, it borrows a connection from the pool, executes the SQL query, and returns the connection back to the pool. If all connections are busy, additional requests wait until a connection becomes available or they may time out if they wait too long. This approach improves performance and avoids the overhead of creating and closing database connections for every request."
//
//    If the interviewer asks "Explain with an example."
//
//    You can say:
//
//            "Let's assume 1000 users send requests to my Spring Boot application at the same time. Tomcat receives all the requests and assigns threads to process them. Suppose Tomcat has 200 worker threads. Out of those requests, only the ones that need database access will request a database connection from HikariCP. If the connection pool size is 10, only 10 database operations can run simultaneously. After a query completes, the connection is returned to the pool and reused by another waiting request. Therefore, even though there are 1000 users, the application does not create 1000 database connections."
//
//    Real-Time Example
//
//    Suppose you have an e-commerce application.
//
//    Users perform different actions:
//
//    User 1 → Login
//    User 2 → Search products
//    User 3 → Place order
//    User 4 → View profile
//...
//    User 1000 → Make payment
//
//    Flow:
//
//            1000 Users
//      │
//              ▼
//    Spring Boot Application
//      │
//              ▼
//    Tomcat Thread Pool (200 Threads)
//      │
//              ▼
//    Service Layer
//      │
//              ▼
//    HikariCP Connection Pool (10 Connections)
//      │
//              ▼
//    MySQL Database
//
//    Only a limited number of database connections are active at a time, and they are continuously reused.
//
//    Follow-up Questions
//    Q1. Why do we use HikariCP?
//
//    Answer:
//
//            "Creating a database connection is an expensive operation. HikariCP improves performance by reusing existing connections instead of creating a new connection for every request."
//
//    Q2. What is the default connection pool in Spring Boot?
//
//    Answer:
//
//            "HikariCP."
//
//    Q3. What is the default maximum pool size?
//
//    Answer:
//
//            "The default maximum pool size is typically 10."
//
//    Q4. What happens if all connections are busy?
//
//    Answer:
//
//            "The incoming request waits for a free connection. If no connection becomes available within the configured timeout, HikariCP throws a connection timeout exception."
//
//    Q5. Can we increase the pool size?
//
//    Answer:
//
//            "Yes. We can configure it using:
//
//    spring.datasource.hikari.maximum-pool-size=20
//
//    However, the pool size should be chosen based on the application's workload and the database server's capacity."
//
//    Q6. Why don't we create 1000 database connections?
//
//    Answer:
//
//            "Creating and closing database connections repeatedly is expensive. It increases memory usage and puts unnecessary load on the database. Reusing a small pool of connections is much more efficient."
}
