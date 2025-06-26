package Task3_LibraryManagementSystem;


public class Book 
{
    private int id;
    private String title;
    private boolean isIssued;
    private User issuedTo;

    public Book(int id, String title) 
    {
        this.id = id;
        this.title = title;
        this.isIssued = false;
        this.issuedTo = null;
    }

    public int getId() 
    {
        return id;
    }

    public String getTitle() 
    {
        return title;
    }

    public boolean isIssued() 
    {
        return isIssued;
    }

    public User getIssuedTo()
    {
        return issuedTo;
    }
    public void issue(User user) 
    {
        isIssued = true;
        issuedTo = user;
    }

    public void returnBook() 
    {
        isIssued = false;
        issuedTo  = null;
    }

    
    public String toString() 
    {
        String status = isIssued ? "Issued To"+ issuedTo.getName() : "Available";
        return "[" + id + "] " + title + "("+ status + ")" ;
    }

    
}
