class QLSV:
    def __init__(self, ho_ten="",diem=0.0):
        self.__ho_ten=ho_ten
        self.__diem = diem
#viết các getter và setter
# viết getter và setter cho họ tên
def get_ho_ten(self):
    return self.__ho_ten
def set_ho_ten(self,new_ho_ten=""):
    self.__ho_ten = new_ho_ten

    #viết getter và setter cho điểm
    def get_diem(self):
        return self.__diem
    
    def get_diem(self):
        return self.__diem
#viết phương thức nhập, xuất,tính học lục
def nhap(self):
    self.__ho_ten = input("Nhập họ tên: ")
    while True:
        try:
            self.__diem = float(input("Nhập điểm: "))
            if 0 <= self.__diem <= 10:
                break
            else:
                print("Điểm phải nằm trong khoảng từ 0 đến 10. Vui lòng nhập lại.")
        except ValueError:
            print("Lỗi: Điểm phải là một số. Vui lòng nhập lại.")
#phần chương trình chính
if __name__=="__main__": # type: ignore
    sv1 = QLSV("Anhr",8.0)
    sv2 = QLSV("Thành",6.5)
    if sv1 > sv2:
        print("sv1 lớn hơn sv2")
    else:
        print("sv2 lớn hơn sv1")  