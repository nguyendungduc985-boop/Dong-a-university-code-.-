package buoi6;

public class main {
    public class thuocnd extends thuoc {
        Double giabaoquan;
        Double giavanchuyen;

        public thuocnd(String _ma_thuoc, String _ten_thuoc, Double _Gia_cb, Double _giabaoquan, Double _giavanchuyen) {
            super(_ma_thuoc, _ten_thuoc, _Gia_cb);
            this.giabaoquan = _giabaoquan;
            this.giavanchuyen = _giavanchuyen;
        }
        //tính giá thuốc nhập khẩu = giá thuốc cơ bản + giá nhập khẩu * số lần bán
        @Override
        public Double tinhGiaThuoc() {
            return super.tinhGiaThuoc() + this.giabaoquan * this.giavanchuyen;
        }
    }

}