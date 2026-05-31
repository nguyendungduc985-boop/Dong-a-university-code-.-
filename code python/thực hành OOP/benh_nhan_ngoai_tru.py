from benh_nhan import BenhNhan

class BNNgoaiTru(BenhNhan):
    def __init__(self, ma="", ho_ten="", tien_thuoc=0, pk=0, pxn=0):
        super().__init__(ma, ho_ten, tien_thuoc)
        self.__pk, self.__pxn = float(pk), float(pxn)

    def get_pk(self): return self.__pk
    def set_pk(self, v): 
        if float(v) >= 0: self.__pk = float(v)
    phi_kham = property(get_pk, set_pk)

    def get_pxn(self): return self.__pxn
    def set_pxn(self, v):
        if float(v) >= 0: self.__pxn = float(v)
    phi_xet_nghiem = property(get_pxn, set_pxn)

    def vien_phi(self): return self.phi_kham + self.phi_xet_nghiem + self.tien_thuoc

    def nhap(self):
        super().nhap()
        self.phi_kham = input("Nhập phí khám: ")
        self.phi_xet_nghiem = input("Nhập phí xét nghiệm: ")

    def __str__(self): return f"[Ngoại trú] {super().__str__()}, Viện phí: {self.vien_phi():.2f}"