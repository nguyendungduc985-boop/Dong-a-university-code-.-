from Bac_si import BacSi 

class BSBanTG(BacSi):
    def __init__(self, ma, ho_ten, muc_luong, luong_ngay, so_ngay_lam_viec):
        super().__init__(ma, ho_ten, muc_luong)
        self._luong_ngay = luong_ngay
        self._so_ngay_lam_viec = so_ngay_lam_viec

    def luong_hang_thang(self):
        # Logic tính phụ phí
        if self._so_ngay_lam_viec < 7:
            phu_phi_luong = 500
        else:
            phu_phi_luong = 1000 
        return (self._muc_luong * 0.3 + 
                self._luong_ngay * self._so_ngay_lam_viec + 
                phu_phi_luong)