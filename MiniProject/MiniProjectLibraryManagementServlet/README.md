# Library Management System  

## Description  
The **Library Management System** is a web-based platform for managing books and user activities, including book addition, issuing, returning, and deposit management. Users can efficiently perform operations through a seamless interface.  

---  

## Features  

### Home Page  
- After login, users can access the following links:  
  - **Add Book**  
  - **Issue Book**  
  - **Register User**  
  - **Display Book Details**  
  - **Show User Details**  

---

### Add Book  
1. **Form Fields**:  
   - Book Name  
   - ISBN  
   - Author  
   - Publisher  
   - Book Count  
   - Available Count  
   - Book Price  
   - New Field: Custom input field to add additional data for books.  

2. **Functionality**:  
   - Adds book details to the database using the provided input fields.  
   - Displays the updated list of books in a table format after addition.  

---

### Register User  
1. **Form Fields**:  
   - User Name  
   - Email  
   - Contact Number  
   - Deposit Amount  

2. **Functionality**:  
   - Captures user details and stores them in the database.  
   - Displays all registered users in a table format.  

---

### Display Book Details  
1. **Form Fields**:  
   - File Upload: `Choose File` option to upload book data.  
   - Submit Button: To save uploaded data.  

2. **Dynamic Display**:  
   - Checkbox options for table columns:  
     - **ID**  
     - **Name**  
     - **Image**  
   - User can select combinations (e.g., ID + Name) to filter the displayed table columns dynamically.  

---

### Issue Book  
1. **Functionality**:  
   - Displays the details of both books and users.  
   - Allows users to:  
     - **Select User** by clicking on the User ID.  
     - **Select Book** by clicking on the Book ID.  

2. **Options**:  
   - **Issue Book**: Assigns the selected book to the user.  
   - **Return Book**: Returns the issued book to the library.  
   - **Add Deposit**: Adds a deposit for users with a current deposit balance of 0.  

---

### Show User Details  
1. **Functionality**:  
   - Displays a table of all registered users with the following columns:  
     - User ID  
     - Name  
     - Email  
     - Contact Number  
     - Deposit Amount  

---

## Technologies Used  
- **Frontend**: HTML, CSS, JavaScript  
- **Backend**: Java Servlets  
- **Database**: MySQL  
- **Server**: Apache Tomcat  

---

## Installation  

### Step 1: Clone the Repository  
```bash  
git clone [repository-link]  
```  

### Step 2: Set Up the Database  
- Import `library_management.sql` into MySQL to create the necessary tables and add sample data.  

### Step 3: Configure Database  
- Update the database connection settings in the backend file (e.g., `DBConnection.java`).  

### Step 4: Deploy on Tomcat Server  
- Deploy the application on Apache Tomcat or another servlet container.  

### Step 5: Launch the Application  
- Open a web browser and go to:  
  ```
  http://localhost:8080/LibraryManagementSystem  
  ```  

---

## Usage  

### Add Books  
1. Navigate to the **Add Book** page.  
2. Fill in the required fields and click "Add" to save the book to the library database.  
3. View updated books in the table.  

### Register Users  
1. Navigate to the **Register User** page.  
2. Enter user details and submit.  
3. View registered users in the table.  

### Display Book Details  
1. Navigate to **Display Book Details**.  
2. Upload book data using the `Choose File` option.  
3. Use checkboxes to dynamically filter displayed columns (ID, Name, Image, etc.).  

### Issue/Return Books  
1. Go to **Issue Book**.  
2. Select a user and book by their IDs.  
3. Use the following actions:  
   - **Issue**: Assign the selected book to the user.  
   - **Return**: Return a book issued to a user.  
   - **Add Deposit**: Update the user’s deposit balance.  

### Show User Details  
1. Open the **Show User Details** page.  
2. View all user details in a tabular format.  

---

## Future Enhancements  
1. Implement search and sorting for all tables.  
2. Add detailed analytics for book and user activities.  
3. Introduce role-based access (e.g., Admin, Librarian, Member).  
4. Enable bulk book upload via CSV/Excel.  

---

## Contributors  
- [Your Name]  
- [Team Member Names]  

---

## License  
This project is licensed under the MIT License.  
