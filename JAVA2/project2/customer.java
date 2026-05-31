package project2;
public class customer {
    String Name;
    String Phone_number;
    String Email;
    public customer(String name, String phone_number, String email){
        this.Name = name;
        this.Phone_number = phone_number;
        this.Email = email;
    }
    public void Showinfo(){
        System.out.println("Ten: " + this.Name + " Số Điện Thoại: " + this.Phone_number + " Email: " + this.Email);
    }
}
    

