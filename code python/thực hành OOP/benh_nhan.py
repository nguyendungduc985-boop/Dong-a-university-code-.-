from abc import ABC, abstractmethod

class BenhNhan(ABC):
    def __init__(self, ma="", ho_ten="", tien_thuoc=0):
        self.__ma = ma
        self.__ho_ten = ho_ten
        self.__tien_thuoc = float(tien_thuoc)

    def get_ma(self): return self.__ma
    def set_ma(self, v): self.__ma = v
    ma = property(get_ma, set_ma)

    def get_ten(self): return self.__ho_ten
    def set_ten(self, v): self.__ho_ten = v
    ho_ten = property(get_ten, set_ten)

    def get_tt(self): return self.__tien_thuoc
    def set_tt(self, v): 
        if float(v) >= 0: self.__tien_thuoc = float(v)
    tien_thuoc = property(get_tt, set_tt)

    @abstractmethod
    def vien_phi(self): pass

    def nhap(self):
        self.ma = input("Nhập mã Bệnh Nhân: ")
        self.ho_ten = input("Nhập họ tên: ")
        self.tien_thuoc = input("Nhập tiền thuốc: ")

    def __str__(self): return f"Mã: {self.ma}, Tên: {self.ho_ten}"
    