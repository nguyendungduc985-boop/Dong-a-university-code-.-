package bt;

public abstract class abstract_ticket {
    protected String code;
    protected String route;
    protected double price; 
    protected String date; 

    public abstract_ticket(String code, String route, double price, String date) {
        this.code = code;
        this.route = route;
        this.price = price;
        this.date = date;
    }


    public void inThongTinVe() {
        System.out.print("Mã vé: " + code + " | Tuyến: " + route + 
                         " | Ngày bán: " + date + " | Giá gốc: " + price);
    }

    public abstract double tinhGiaVe();

    public String getDate() {
        return date;
    }
}
