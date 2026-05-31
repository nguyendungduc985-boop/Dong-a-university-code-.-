package buoi2;

public class Products {
    String name;
    int price;
    float discount;
  
    public Products(String _name, int _price, float _discount) {
        this.name = _name;
        this.price = _price;
        this.discount = _discount;
    }

    public void Showinfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
    }
    
}    