from animal import animal
class fish(animal):
    def __init__(self, kieu_vay="",ten_goi="",can_nang="", loai_nuoc=""):
        super().__init__(ten_goi, can_nang)
        self.loai_nuoc = loai_nuoc

    def get_loai_nuoc(self):
        return self.loai_nuoc
    
    def set_loai_nuoc(self, new_loai_nuoc=""):
        self.loai_nuoc = new_loai_nuoc

    loai_nuoc = property(get_loai_nuoc, set_loai_nuoc)

    def __str__(self):
        return super().__str__()+f", Loại nước: {self.loai_nuoc}"
    
    def boi(self):
        print("con cá bơi")

    def nhap(self):
        super().nhap()
        self.loai_nuoc = input("Nhập loại nước (ngọt/mặn): ")

    def nhap(self):
        super().nhap()
        self.kieu_vay = input("Nhập kiểu vây: ")    