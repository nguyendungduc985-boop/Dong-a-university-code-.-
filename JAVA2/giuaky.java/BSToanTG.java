public class BSToanTG extends BacSi {
    private double luongKham;
    private double luongXetNghiem;

    public BSToanTG(String ma, String hoTen, double mucLuong, double luongKham, double luongXetNghiem) {
        super(ma, hoTen, mucLuong);
        this.luongKham = luongKham;
        this.luongXetNghiem = luongXetNghiem;
    }

    @Override
    public double luongHangThang() {
        return luongKham + luongXetNghiem + mucLuong;
    }
}