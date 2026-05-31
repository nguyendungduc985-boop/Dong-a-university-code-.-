package demo;

public class customer {
    public static void main(String[] args) {
        
    }
    public String Name;
    public String Phone;
    public String Address;

    public customer(String _name, String _phone, String _address) {
        this.Name = _name;
        this.Phone = _phone;
        this.Address = _address;
    }
    public void Showinfo(){
        System.out.println("name"+ this.Name+"phone"+ this.Phone+"address"+ this.Address);
    }    
}

 
