package Laptrinhclass;

public class Movie {
    String Title;
    String Theloai;
    String Price;

    public Movie(String title, String theloai,String price){
        this.Title = title;
        this.Theloai = theloai;
        this.Price = price;

    }
    public void Showinfo(){
        System.out.println("tên phim: " + this.Title  +" thể loại: "+ this.Theloai + " giá vé: " + this.Price);
    }
}
