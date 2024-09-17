# E-commerce-Dynamic-Page
Clothing Store E-commerce Website
This is a simple e-commerce website that allows users to browse and search for clothing items. The site includes dynamic search functionality where relevant results are displayed as the user types, and the website can be connected to a backend database for storing and retrieving clothing items.

Features:
Dynamic Search: Users can search for clothing items with results shown dynamically as they type.
Responsive Design: The website is fully responsive and mobile-friendly, using Tailwind CSS for design.
REST API: The backend provides a REST API for searching clothing items and returning relevant results.
Database Integration: The backend uses either MySQL or H2 database for storing clothing items.
Technologies Used
Frontend
HTML, CSS (Tailwind CSS): Used for the website structure and styling.
JavaScript: Handles the dynamic search functionality.
Backend
Spring Boot (Java): The backend framework used to build the REST API and connect to the database.
MySQL or H2 Database: The database used for storing and retrieving clothing items.
Tools
Postman: For testing the API endpoints.
Maven: Used for dependency management.
Installation & Setup
Prerequisites
Java 8 or higher
MySQL or H2 database
Maven
Node.js (for serving frontend files)
1. Clone the Repository
bash
Copy code
git clone https://github.com/your-username/clothing-store.git
cd clothing-store
2. Backend Setup
2.1. Configure MySQL Database
Create a MySQL database called clothing_store (or use the H2 in-memory database).
Add your MySQL connection credentials in the application.properties file.
properties
Copy code
# For MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/clothing_store
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

# For H2 (Optional)
# spring.datasource.url=jdbc:h2:mem:testdb
# spring.datasource.driver-class-name=org.h2.Driver
# spring.jpa.hibernate.ddl-auto=update
2.2. Install Maven Dependencies
Copy code
mvn clean install
2.3. Run the Spring Boot Application
arduino
Copy code
mvn spring-boot:run
This will start your backend server on http://localhost:8080.

3. Frontend Setup:
3.1. Install Node.js (Optional)
You can use any local server to serve your static HTML file.
3.2. Serve the index.html File
Open index.html directly in the browser, or serve it using a simple HTTP server like live-server:

Copy code
npx live-server
This will serve your frontend and you can access it on http://127.0.0.1:5500.

4. Testing the Application:
4.1. Search Functionality
Enter a search query (e.g., "jeans") in the search bar, and matching clothing items will appear dynamically.
The backend will handle the query using the /api/search?q={query} endpoint.
4.2. Testing the API with Postman
You can use Postman to test the API directly.
URL: http://localhost:8080/api/search?q=jeans
Method: GET
API Endpoints
Endpoint	Method	Description
/api/search?q={query}	GET	Returns clothing items based on query
Folder Structure
scss
Copy code
clothing-store/
│
├── src/
│   ├── main/
│   │   ├── java/com/Ecommerce/EcommerceWebsite/
│   │   │   ├── ClothingController.java
│   │   │   ├── ClothingService.java
│   │   │   ├── ClothingRepository.java
│   │   │   ├── ClothingItem.java
│   │   │   └── ... (other files)
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── index.html
├── pom.xml
└── README.md
Known Issues:
CORS Policy: If you encounter CORS issues, make sure to enable CORS in your Spring Boot application by adding the appropriate annotations.
Image Loading: Ensure the images are stored in the correct directory and accessible via the server.
Contact
For any inquiries or feedback, please contact devgupta97197@gmail.com
