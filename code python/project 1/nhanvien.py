from abc import ABC, abstractmethod

class NhanVien(ABC):
    def __init__(self,ho_ten="",so_nam=0):
        self._ho_ten = ho_ten
        self._so_nam = so_nam
    
    
    @property
    def phu_cap(self):
        return 100 + self._so_nam*20
    
   
    def get_ho_ten(self):
        return self._ho_ten
    def set_ho_ten(self,new_ho_ten=""):
        self._ho_ten = new_ho_ten
    ho_ten = property(get_ho_ten,set_ho_ten)
    
    def get_so_nam(self):
        return self._so_nam
    def set_so_nam(self,new_so_nam=0):
        if new_so_nam >=0:
            self._so_nam = new_so_nam

    so_nam = property(get_so_nam,set_so_nam)
    
    @abstractmethod
    def luong(self):
        pass

    def nhap(self):
        self._ho_ten = input("Nhap ho ten: ")
        
        while True:
            try:
                self._so_nam = int(input("Nhap so nam cong tac:"))
                if self._so_nam >= 0:
                    break
                else:
                    print("Số năm công tác không thể là số âm.")
            except ValueError:
                print("Lỗi: Vui lòng nhập số nguyên.")
        
    def __str__(self):
        return f"Ho ten: {self._ho_ten}, So nam cong tac: {self._so_nam}, Phu cap: {self.phu_cap}, luong: {self.luong()}"