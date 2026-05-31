from nhanvien import NhanVien

class NVSX(NhanVien): 
    def __init__(self, ho_ten="", so_nam=0, so_san_pham=0):
        super().__init__(ho_ten, so_nam)
        self._so_san_pham = so_san_pham

    def get_so_san_pham(self):
        return self._so_san_pham

    def set_so_san_pham(self, new_so_san_pham=0):
        if new_so_san_pham >= 0:
            self._so_san_pham = new_so_san_pham

    so_san_pham = property(get_so_san_pham, set_so_san_pham)

    def luong(self):

        return (self._so_san_pham * 10) + self.phu_cap

    def __str__(self):
        return f"{super().__str__()}, So san pham: {self._so_san_pham}"
    
    def nhap(self):
        super().nhap()

        while True:
            try:
                self._so_san_pham = int(input("Nhap so san pham: "))
                if self._so_san_pham >= 0:
                    break
                else:
                    print("Số sản phẩm không thể là số âm.")
            except ValueError:
                print("Lỗi: Vui lòng nhập số nguyên.")