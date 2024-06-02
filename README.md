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
![Home Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/bc9bd6fd-c875-4b59-bbce-8213bbc3fbe3)
### About Us Page
![About Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/32424a4e-4be5-47c1-9534-d0ce012af0c3)

### Contact Page
![Contact Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/30b243d5-ba66-4ba5-a9cc-fdfc9736aa55)


### Organization Page
![Organization Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/d2ffa132-4d12-4496-8042-80e0068e17a5)

### Event Page
![Event Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/1cf35d6e-65bb-44b3-aa6a-e4261ab7b021)

### Adoption Registration Page
![Adopt Page](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/b452754a-d1e5-4168-90dd-e22a9cc9aa29)
### Details of Adoption Page
![Adopt Details](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/3e456502-6833-488f-8ebf-abc021431d64)

### Contact Us Table
![Contact Table](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/338c7234-3a0b-4a4f-a60e-d5171260b2d2)
### Adoption Details Table
![Adoption Table](https://github.com/RenukaKale29/Child_Adoption_Website/assets/107395863/9d2cc23b-e86a-47ec-8d3e-39c2343c8197)
## Installation

1. **Clone the repository**:
    ```sh
    git clone[ https://github.com/yourusername/child-adoption-system](https://github.com/RenukaKale29/Child_Adoption_Website).git
    ```
2. **Navigate to the project directory**:
    ```sh
    cd child-adoption-system
    ```
3. **Setup the Application.Properties**:
server.port=1003
spring.datasource.name=Child_Adoption
spring.datasource.url=jdbc:mysql://localhost:3306/Child_Adoption?ServerTimzone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

    ```
4. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

## Usage

- Open your web browser and navigate to `http://localhost:1003`.
- Explore the various pages and functionalities of the Child Adoption System.

## Contributing

If you would like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## License

This project is licensed under the MIT License.

