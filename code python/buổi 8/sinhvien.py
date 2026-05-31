class sinhvien:
    def __init__(self, ten="", tuoi=0, mssv=""):
        self.__ten = ten
        self.__id = id
        self.__diem = diem

    def hoc_luc(self):
        if self.__diem < 5:
            return "Yếu"
        elif self.__diem < 7:
            return "Trung bình"
        elif self.__diem < 8:
            return "Khá"
        elif self.__diem < 9:
            return "Giỏi"
        else:
            return "Xuất sắc"
#các getter và setter
def get_id(self):
     return self.__id
def set_id(self,new_id=0.0):self.__id=new_id

id=property(get_id,set_id)
# thuộc tính đại diện


        