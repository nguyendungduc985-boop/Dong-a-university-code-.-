package demo2;

public class Customer {
    public String customerID;
    public String name;
    public String memberType; // "vip" hoặc "normal"

    public Customer(String customerID, String name, String memberType) {
        this.customerID = customerID;
        this.name = name;
        this.memberType = memberType;
    }

    public void showInfo() {
        System.out.println("ID: " + customerID + " | Tên: " + name + " | Loại: " + memberType);
    }
}   