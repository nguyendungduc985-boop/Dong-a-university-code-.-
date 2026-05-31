public class BSBanTG extends BacSi {
    private double luongNgay;
    private int soNgayLamViec;

    public BSBanTG(String ma, String hoTen, double mucLuong, double luongNgay, int soNgayLamViec) {
        super(ma, hoTen, mucLuong);
        this.luongNgay = luongNgay;
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double luongHangThang() {
        return (mucLuong * 0.3) + (luongNgay * soNgayLamViec);
    }
}