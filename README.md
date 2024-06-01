# Child Adoption System

This project is a Child Adoption System developed using HTML, CSS, Thymeleaf, Java Spring Boot, and MySQL. It provides an interface for users to view information about the adoption process, contact details, organization details, upcoming events, and to register for adoption. 

## Features

- **Home Page**: Introduction to the Child Adoption System.
- **About Us**: Information about the organization and its mission.
- **Contact**: Contact information and a form to reach out to the organization.
- **Organization**: Details about the organization.
- **Event**: Information about upcoming events.
- **Adoption Registration**: Form for users to register for adoption.
- **Details of Adoption**: Detailed information about the adoption process.

## Screenshots

### Home Page
![Home Page](screenshots/home_page.png)

### About Us Page
![About Us Page](screenshots/about_us_page.png)

### Contact Page
![Contact Page](screenshots/contact_page.png)

### Organization Page
![Organization Page](screenshots/organization_page.png)

### Event Page
![Event Page](screenshots/event_page.png)

### Adoption Registration Page
![Adoption Registration Page](screenshots/adoption_registration_page.png)

### Details of Adoption Page
![Details of Adoption Page](screenshots/details_of_adoption_page.png)

## Installation

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/child-adoption-system.git
    ```
2. **Navigate to the project directory**:
    ```sh
    cd child-adoption-system
    ```
3. **Setup the MySQL Database**:
    - Create a database named `child_adoption_system`.
    - Update the `application.properties` file with your MySQL username and password.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/child_adoption_system
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```
4. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

## Usage

- Open your web browser and navigate to `http://localhost:8080`.
- Explore the various pages and functionalities of the Child Adoption System.

## Contributing

If you would like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## License

This project is licensed under the MIT License.

