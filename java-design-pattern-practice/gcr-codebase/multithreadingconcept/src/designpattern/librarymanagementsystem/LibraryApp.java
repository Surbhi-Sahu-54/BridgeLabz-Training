package designpattern.librarymanagementsystem;

import designpattern.librarymanagementsystem.Book;
import designpattern.librarymanagementsystem.User;
import designpattern.librarymanagementsystem.UserFactory;
import designpattern.librarymanagementsystem.LibraryCatalog;

//import com.design_patterns.libraryManagementSystem.singleton.Librarycatalog;

public class LibraryApp {

	public static void main(String[] args) {

		// SINGLETON
		LibraryCatalog catalog = LibraryCatalog.getInstance();

		// FACTORY
		User student = UserFactory.createUser("student", "Surbhi");
		User faculty = UserFactory.createUser("faculty", "Dr. Subh ");

		// SHOW ROLES
		student.showRole();
		faculty.showRole();

		// OBSERVER REGISTRATION
		catalog.addObserver(student);
		catalog.addObserver(faculty);

		// BUILDER
		Book book = new Book.BookBuilder("Design Patterns").author("GoF").edition("2nd Edition")
				.genre("Software Engineering").build();

		// ADD BOOK → NOTIFY USERS
		catalog.addBook(book);
	} 
}