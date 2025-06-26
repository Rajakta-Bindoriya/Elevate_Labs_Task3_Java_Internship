package Task3_LibraryManagementSystem;


import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addUser(new User(101, "Raj"));
        library.addUser(new User(102, "Simran"));

        // Sample Books
        library.addBook(new Book(1, "Java Basics"));
        library.addBook(new Book(2, "Python Essentials"));
        library.addBook(new Book(3, "C++ Masterclass"));

        while (true) 
        {
            System.out.println("\n......Library Menu......");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {

                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    library.issueBook(bookId, userId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }    
}
