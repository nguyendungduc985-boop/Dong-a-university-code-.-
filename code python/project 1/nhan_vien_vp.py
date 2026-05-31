from nhanvien import NhanVien

class NVVP(NhanVien):
    def __init__(self, ho_ten="",so_nam=0,muc_luong=0,so_ngay_nghi=0):
        super().__init__(ho_ten,so_nam)
        self._muc_luong = muc_luong
        self._so_ngay_nghi = so_ngay_nghi

    
    def get_muc_luong(self):
        return self._muc_luong
    
    def set_muc_luong(self, new_muc_luong=0):
        if new_muc_luong >= 0:
            self._muc_luong = new_muc_luong

    muc_luong = property(get_muc_luong, set_muc_luong)
    
    def get_so_ngay_nghi(self):
        return self._so_ngay_nghi
    
    def set_so_ngay_nghi(self, new_so_ngay_nghi=0):
        if new_so_ngay_nghi >= 0:
            self._so_ngay_nghi = new_so_ngay_nghi

    so_ngay_nghi = property(get_so_ngay_nghi, set_so_ngay_nghi) 

    def nhap(self):
        super().nhap() 
        while True:
            try:
                self._muc_luong = float(input("Nhập mức lương: "))
                if self._muc_luong >= 0:
                    break
                else:
                    print("Mức lương không thể là số âm.")
            except ValueError:
                print("Lỗi: Vui lòng nhập số.")
                
        while True:
            try:
                self._so_ngay_nghi = int(input("Nhập số ngày nghỉ: "))
                if self._so_ngay_nghi >= 0:
                    break
                else:
                    print("Số ngày nghỉ không thể là số âm.")
            except ValueError:
                print("Lỗi: Vui lòng nhập số nguyên.")


    def __str__(self):
        return f"{super().__str__()}, Mức lương: {self._muc_luong}, Số ngày nghỉ: {self._so_ngay_nghi}"
    
    def luong(self):

        return self._muc_luong - (self._so_ngay_nghi * 10) + self.phu_cap