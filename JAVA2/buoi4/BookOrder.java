package buoi4;
import java.util.ArrayList;

public class BookOrder {
    Customer customer;
    ArrayList<Book> books = new ArrayList<>(); 

    public BookOrder(Customer customer) {
        this.customer = customer;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public double totalMoney() {
        double total = 0;
        for (Book b : books) {

            total += b.Price; 
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("----- HOA DON BAN SACH -----");
        System.out.println("KHACH HANG:");
        customer.Showinfo(); 

        System.out.println("\nDANH SACH SACH DA MUA:");
        for (Book b : books) {
            b.Showinfo(); 
        }

        System.out.println("\nTONG TIEN THANH TOAN: " + totalMoney());
        System.out.println("----------------------------");
    }
}