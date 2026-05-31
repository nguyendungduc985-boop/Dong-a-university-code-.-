public class BacSi {
    protected String ma;
    protected String hoTen;
    protected double mucLuong;

    public BacSi(String ma, String hoTen, double mucLuong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.mucLuong = mucLuong;
    }

    public double luongHangThang() {
        return mucLuong;
    }
}