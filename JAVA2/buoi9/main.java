package buoi9;
import java.util.Scanner;
public class main{
    public String ma;
    public String ten;
    public Double mucLuong;
//hàm khỏi tạo
    public bacsi(String ma ,String ten , Double mucLuong){
        this.ma=ma;
        this.ten=ten;
        this.mucLuong=mucLuong;
    }
    public String getMa(){return ma;}
    public void setMa(String ma){this.ma=ma;}
    public String getHoTen(){return ten;}
    public void setHoTen(String ten){this.ten=ten;}
    public Double getMucLuong(){return mucLuong;}
    public void setMucLuong(Double mucLuong){this.mucLuong=mucLuong;}
    //tính lương hàng tháng
    public Double luongHangThang(){
        return mucLuong;
    }
}
