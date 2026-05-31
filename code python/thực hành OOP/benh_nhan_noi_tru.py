from benh_nhan import BenhNhan

class BNNoiTru(BenhNhan):
    def __init__(self, ma="", ho_ten="", tien_thuoc=0, pn=0, sn=0):
        super().__init__(ma, ho_ten, tien_thuoc)
        self.__pn, self.__sn = float(pn), int(sn)

    def get_pn(self): return self.__pn
    def set_pn(self, v):
        if float(v) >= 0: self.__pn = float(v)
    phi_ngay = property(get_pn, set_pn)

    def get_sn(self): return self.__sn
    def set_sn(self, v):
        if int(v) >= 0: self.__sn = int(v)
    so_ngay = property(get_sn, set_sn)

    def vien_phi(self):
        phu_phi = 50 if self.so_ngay < 10 else 100
        return (self.tien_thuoc * self.so_ngay) + (self.phi_ngay * self.so_ngay) + phu_phi

    def nhap(self):
        super().nhap()
        self.phi_ngay = input("Nhập phí ngày: ")
        self.so_ngay = input("Nhập số ngày nằm: ")

    def __str__(self): return f"[Nội trú]   {super().__str__()}, Viện phí: {self.vien_phi():.2f}"