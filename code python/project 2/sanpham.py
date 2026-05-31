class san_pham:
    def __init__(self, ten_sp="", gia=0, thuong_hieu=""):
        self.ten_sp = ten_sp
        self.gia = gia
        self.thuong_hieu = thuong_hieu
    def kiem_tra_gia(self, threshold=0):
        if self.gia < threshold:
            return "rẻ"
        elif self.gia == threshold:
            return "trung bình"
        else:
            return "đắt"
        #getter và setter cho gia
        def get_gia(self):
            return self.gia
        def set_gia(self, new_gia=0):
            self.gia = new_gia
        gia = property(get_gia, set_gia)
        #chương trình chính
sp = san_pham("Điện thoại", 500, "Samsung")
print("Kiểm tra giá sản phẩm:", sp.kiem_tra_gia(400))
