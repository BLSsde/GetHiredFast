<h2>GetHiredFast - Spring Boot Job Listing Project</h2>
<p></p>Welcome to GetHiredFast, your go-to platform for job listings. This Spring Boot project allows users to explore various job opportunities, while recruiters can effortlessly add new job openings. The project utilizes MongoDB as the database, with data stored on the cloud provided by MongoDB Atlas. Job seekers (users) can also search for jobs based on specific criteria such as keywords, profile, description, and skills.</p>

<h2>Features</h2>
<p>
<h3>Job Listing</h3>: Browse through a comprehensive list of job openings on the platform.
<h3>Recruiter Dashboard </h3>: Recruiters can easily add new job opportunities to the platform.
<h3>Cloud Database</h3>: MongoDB Atlas is used to store data securely and efficiently on the cloud.
<h3>Job Search</h3>: Job seekers can search for relevant positions based on keywords, profile, description, and skills.
<h3>Sorting</h3>: Search results are displayed in a sorting order based on the experience required for each job profile.</p>
<h2>Technologies Used</h2>
<p>
Spring Boot: Framework for building Java-based enterprise applications.
MongoDB: NoSQL database for efficient data storage.
MongoDB Atlas: Cloud-based database service for MongoDB, ensuring scalability and reliability.</p>

<h2>Setup Instructions</h2>
<h3>Clone the Repository </h3>: 
git clone https://github.com/BLSsde/GetHiredFast.git
<h3>Configure MongoDB Atlas</h3>:

Create an account on MongoDB Atlas.
Set up a new cluster and obtain the connection string.
Configure Application Properties:

Open src/main/resources/application.properties.
Replace <your-mongodb-uri> with your MongoDB Atlas connection string.
Build and Run:
./mvnw spring-boot:run
Access the Application:

Visit http://localhost:8080 in your web browser.
<h2>Usage</h2>
Job Seekers:<br>

Explore job listings.<br>
Use the search feature to find relevant job opportunities.<br>
View detailed job descriptions.<br>
Recruiters:<br>

Log in to the recruiter dashboard.<br>
Add new job openings with relevant details.<br>
<h2>Contributing</h2>
If you'd like to contribute to GetHiredFast, please follow these steps:

Fork the repository.<br>
Create a new branch for your feature or bug fix.<br>
Make your changes and submit a pull request.<br>
