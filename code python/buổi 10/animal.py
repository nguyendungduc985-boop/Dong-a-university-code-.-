class animal:
    def __init__(self, ten_goi, can_nang):
        self.ten_goi = ten_goi
        self.can_nang = can_nang

    def get_ten_goi(self):
        return self.ten_goi
    
    def set_ten_goi(self, new_ten_goi = ""):
        self.ten_goi = new_ten_goi
    
    ten_goi = property(get_ten_goi, set_ten_goi)

    def get_can_nang(self):
        return self.can_nang
    
    def set_can_nang(self, new_can_nang = 0.0): 
        self.can_nang = new_can_nang

    can_nang = property(get_can_nang, set_can_nang)

    def nhap(self):
        self.ten_goi = input("Nhập tên gọi: ")
        self.can_nang = float(input("Nhập cân nặng: "))

    def __str__(self):
        return f"Tên gọi: {self.ten_goi}, Cân nặng: {self.can_nang}" 

    def an(self):
        print("animal ăn")

    def di_chyen(self):
        print("animal di chuyển")    
