package buoi9;
public class bacsitoantg extends bacsi {
    public Double LuongKham;
    public Double LuongXetNghiem;

    public bacsitoantg(String ma ,String ten , Double mucLuong, Double LuongKham, Double LuongXetNghiem){
        super(ma, ten, mucLuong);
        this.LuongKham = LuongKham;
        this.LuongXetNghiem = LuongXetNghiem;
    }
    public Double getLuongKham() {
        return LuongKham;
    }
    public void setLuongKham(Double luongKham) {
        LuongKham = luongKham;
    }
    public Double getLuongXetNghiem() {
        return LuongXetNghiem;
    }
    public void setLuongXetNghiem(Double luongXetNghiem) {
        LuongXetNghiem = luongXetNghiem;
    }
    @Override
    public Double luongHangThang() {
        Double LuongThang = super.luongHangThang() + this.getLuongKham() + this.getLuongXetNghiem();
        return LuongThang;
    }
}

    