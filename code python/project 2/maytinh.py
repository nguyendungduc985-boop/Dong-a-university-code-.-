class Maytinh:
    def __init__(self, ten_may="", ram=0, CPU=0):
        self.__ten_may = ten_may
        self.__ram = ram
        self.__CPU = CPU

    # phương thức đánh giá
    def danh_gia(self):
        if self.__ram < 4:
            return "yếu"
        elif self.__ram < 8:
            return "trung bình"
        elif self.__ram < 16:
            return "khá"
        else:
            return "xuất sắc"

    # getter và setter cho ram
    def get_ram(self):
        return self.__ram

    def set_ram(self, new_ram=0):
        self.__ram = new_ram

    ram = property(get_ram, set_ram)

    #chương trình chính
mt = Maytinh("Dell", 8, 4)
print("Đánh giá máy tính:", mt.danh_gia())
mt.ram = 16
print("Đánh giá máy tính sau khi nâng cấp RAM:", mt.danh_gia())


 