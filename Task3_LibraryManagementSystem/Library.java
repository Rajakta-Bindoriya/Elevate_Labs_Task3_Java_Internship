package Task3_LibraryManagementSystem;

import java.util.ArrayList;

public class Library 
{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) 
    {
        books.add(book);
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public void showBooks() 
    {
        for (Book book : books) 
        {
            System.out.println(book);
        }
    }

    public void showUsers()
    {for (User user : users) 
        {
            System.out.println("[" + user.getId() + "] " + user.getName());
        }
    }

    public void issueBook(int bookId, int userId) 
    {
        Book book = findBookById(bookId);
        User user = findUserById(userId);

        if (book == null) 
        {
            System.out.println("Book not found.");
        } 
        else if (user == null) 
        {
            System.out.println("User not found.");
        } 
        else if (book.isIssued()) 
        {
            System.out.println("Book is already issued to " + book.getIssuedTo().getName());
        } 
        else 
        {
            book.issue(user);
            System.out.println("Book issued to " + user.getName());
        }
    }

    public void returnBook(int bookId) 
    {
        Book book = findBookById(bookId);
        if (book == null) 
        {
            System.out.println("Book not found.");
        } 
        else if (!book.isIssued()) 
        {
            System.out.println("Book was not issued.");
        } 
        else 
        {
            System.out.println("Book returned from " + book.getIssuedTo().getName());
            book.returnBook();
        }
    }

    private Book findBookById(int id) 
    {
        for (Book book : books) 
        {
            if (book.getId() == id) return book;
        }
        return null;
    }

    private User findUserById(int id) 
    {
        for (User user : users) 
        {
            if (user.getId() == id) return user;
        }
        return null;
    }
}

    
