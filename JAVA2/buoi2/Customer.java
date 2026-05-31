package buoi2;

public class Customer {

        String Name;
        String Phone;
        String Address;
       
        public Customer( String _customerName, String _customerphone, String _customeraddress) {
            this.Name = _customerName;
            this.Phone = _customerphone;
            this.Address = _customeraddress;
        }


        public void Showinfo() {
            System.out.println("Customer Name: " + Name);
            System.out.println("Customer Phone: " + Phone);
            System.out.println("Customer Address: " + Address);
        }
    }        

