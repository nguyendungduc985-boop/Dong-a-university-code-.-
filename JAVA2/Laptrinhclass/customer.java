package Laptrinhclass;

public class customer {
    String Name;
    String Phone_Number;
    String Email;
public customer(String name,String phone_number,String email){
    this.Name = name;
    this.Phone_Number = phone_number;
    this.Email = email;
}
public void Showinfo(){
    System.out.println("tên khách hàng" + this.Name + "số điện thoại" + this.Phone_Number + "email" + this.Email);
}
}
