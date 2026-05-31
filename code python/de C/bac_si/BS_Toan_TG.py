from Bac_si import BacSi 

class BSToanTG(BacSi):
    def __init__(self, ma, ho_ten, muc_luong, luong_kham, luong_xet_nghiem):
        super().__init__(ma, ho_ten, muc_luong)
        self._luong_kham = luong_kham
        self._luong_xet_nghiem = luong_xet_nghiem

    def luong_hang_thang(self):
        return self._muc_luong + self._luong_kham + self._luong_xet_nghiem