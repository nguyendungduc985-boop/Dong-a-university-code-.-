package buoi4;

public class Book {
    public String Name;
    public String Book_Name;
    public double Price; 
   
    public Book(String name, String book_name, double price){
        this.Name = name;
        this.Book_Name = book_name;
        this.Price = price;
    }

    public void Showinfo() {
        System.out.println("Name: " + this.Name + " | Book Name: " + this.Book_Name + " | Price: " + this.Price);
    }
}