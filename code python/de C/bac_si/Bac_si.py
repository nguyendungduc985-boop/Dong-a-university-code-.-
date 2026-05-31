class BacSi:
    def __init__(self, ma, ho_ten, muc_luong):
        self._ma = ma
        self._ho_ten = ho_ten
        self._muc_luong = muc_luong
    @property
    def ma(self):
        return self._ma
    
    @property
    def ho_ten(self):
        return self._ho_ten
    
    @property
    def muc_luong(self):
        return self._muc_luong
    
    @muc_luong.setter
    def muc_luong(self, value):
        self._muc_luong = value

    def luong_hang_thang(self):
        return self._muc_luong

    def __str__(self):
        return f"Mã: {self._ma}, Họ tên: {self._ho_ten}, Lương: {self.luong_hang_thang():,.0f}"