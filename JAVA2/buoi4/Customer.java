package buoi4;

public class Customer {
    public String Name;
    public String Phone_Number;
    public String Email;

    public Customer(String name, String phone_number, String email){
        this.Name = name;
        this.Phone_Number = phone_number;
        this.Email = email;
    }

    public void Showinfo(){
        System.out.println("Ten: " + this.Name + " | SDT: " + this.Phone_Number + " | Email: " + this.Email);
    }
}