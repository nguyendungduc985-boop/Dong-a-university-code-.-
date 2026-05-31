package demo;

public class food {
    String Name;
    double Price;
    double Discount;

    public food(String _name , double _price , double _discount){
        this.Name = _name;
        this.Price = _price;
        this.Discount = _discount;
    }

    public void Showinfo(){
        System.out.println("Ten: " + this.Name + " | Gia: " + this.Price + " | Giam: " + this.Discount + "%"); 
    }

    public double Real_Price(){
        double actualPrice = this.Price - (this.Price * this.Discount / 100);
        return actualPrice; 
    }
}