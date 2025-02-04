# A Modern App with Java
https://www.youtube.com/watch?v=vbNGk5dEGfM
^ This is the Youtube Video I followed for this. This is not my work, but I wanted to familiarize myself with Java and it's properties again.

This project demonstrates a basic UI application developed using Spring Boot, Vaadin, and Maven. The application allows users to input, store, and display `Person` entities (First Name, Last Name, and Email) in a web-based interface.

## Project Structure

### 1. `MainView` Class

The `MainView` class serves as the main UI for the application. It is built using Vaadin, a Java framework for creating web UIs. The class extends `VerticalLayout` and contains the following components:

- **TextField Components:**
  - `firstname`: Input for the first name of the person.
  - `lastname`: Input for the last name of the person.
  - `email`: Input for the email address of the person.

- **Binder:**
  - A `Binder<Person>` is used to bind the form fields to a `Person` object and perform validation.

- **Grid:**
  - A `Grid<Person>` component is used to display the list of saved `Person` entities from the database.

- **Add Button:**
  - The `Button` labeled "Add" allows the user to add a new person to the repository when clicked.

The UI layout uses a `HorizontalLayout` to arrange the input fields and the button horizontally, with a vertical layout that stacks the form and grid components. The application uses data-binding to facilitate the form input and validation, ensuring that any entered data is valid before saving it to the database.

### 2. `Person` Entity

The `Person` class represents the entity stored in the database. It is annotated with `@Entity`, marking it as a persistent object for JPA (Java Persistence API). It includes:

- **Fields:**
  - `firstname`, `lastname`, and `email` represent the attributes of a person.

- **Getters and Setters:**
  - The class provides standard getter and setter methods for each field, allowing for access and modification of the data.

This entity is mapped to a corresponding table in the database, where ea


