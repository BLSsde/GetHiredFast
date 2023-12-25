<h2>GetHiredFast - Spring Boot Job Listing Project</h2>
<p></p>Welcome to GetHiredFast, your go-to platform for job listings. This Spring Boot project allows users to explore various job opportunities, while recruiters can effortlessly add new job openings. The project utilizes MongoDB as the database, with data stored on the cloud provided by MongoDB Atlas. Job seekers (users) can also search for jobs based on specific criteria such as keywords, profile, description, and skills.</p>

<h2>Features</h2>
<p>
Job Listing: Browse through a comprehensive list of job openings on the platform.
Recruiter Dashboard: Recruiters can easily add new job opportunities to the platform.
Cloud Database: MongoDB Atlas is used to store data securely and efficiently on the cloud.
Job Search: Job seekers can search for relevant positions based on keywords, profile, description, and skills.
Sorting: Search results are displayed in a sorting order based on the experience required for each job profile.</p>
<h2>Technologies Used</h2>
<p>
Spring Boot: Framework for building Java-based enterprise applications.
MongoDB: NoSQL database for efficient data storage.
MongoDB Atlas: Cloud-based database service for MongoDB, ensuring scalability and reliability.</p>
Setup Instructions
Clone the Repository:

bash
Copy code
git clone https://github.com/BLSsde/GetHiredFast.git
Configure MongoDB Atlas:

Create an account on MongoDB Atlas.
Set up a new cluster and obtain the connection string.
Configure Application Properties:

Open src/main/resources/application.properties.
Replace <your-mongodb-uri> with your MongoDB Atlas connection string.
Build and Run:

bash
Copy code
./mvnw spring-boot:run
Access the Application:

Visit http://localhost:8080 in your web browser.
Usage
Job Seekers:

Explore job listings.
Use the search feature to find relevant job opportunities.
View detailed job descriptions.
Recruiters:

Log in to the recruiter dashboard.
Add new job openings with relevant details.
Contributing
If you'd like to contribute to GetHiredFast, please follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix.
Make your changes and submit a pull request.
