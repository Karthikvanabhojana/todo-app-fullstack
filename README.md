# ToDo App with React and Java

This ToDo application is built with React on the frontend and Java on the backend, featuring login authentication to manage user tasks.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- User authentication (login and registration).
- Create, read, update, and delete tasks.
- User-specific task management.
- Responsive design for various devices.

## Technologies Used

- **Frontend:**
  - React
  - React Router for navigation
  - Axios for API requests

- **Backend:**
  - Java
  - Spring Boot
  - Spring Security for authentication
  - Spring JPA for database interaction

- **Database:**
  - MySQL

## Getting Started

### Prerequisites

Before you begin, ensure you have the following software installed:

- Node.js
- npm
- Java
- MySQL

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Karthikvanabhojana/todo-app-fullstack.git

2. Navigate to the frontend folder:
   cd todo-app-fullstack/todo-app

3. Install frontend dependencies
   npm install

4. Navigate to the backend folder:
  cd ../Tododemo

5. Import the database schema Tododemo/src/main/resources/todo.sql into your MySQL database.

6. Configure the database connection in Tododemo/src/main/resources/application.properties.

7. Run Spring Boot Project

### Configuration
Update the following configuration files as needed:

1. frontend/src/config.js: Set the API base URL.
2. Tododemo/src/main/resources/application.properties: Configure database connection and other properties.
   
### Usage
1. Open your browser and navigate to http://localhost:3000 to access the ToDo app.
2. Register a new account or log in with an existing one.

Start managing your tasks!


