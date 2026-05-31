from animal import animal

class cat(animal):
    def __init__(self, ten_goi="", can_nang=0,mau_long="",mau_mat=""):
        super().__init__(ten_goi, can_nang)
        self.mau_long = mau_long
        self.mau_mat = mau_mat

        def get_mau_long(self):
            return self.mau_long
        
        def set_mau_long(self, new_mau_long=""):
            self.mau_long = new_mau_long

        mau_long = property(get_mau_long, set_mau_long)

        def get_mau_mat(self):
            return self.mau_mat
        
        def set_mau_mat(self, new_mau_mat=""):
            self.__mau_mat = new_mau_mat

        mau_mat = property(get_mau_mat, set_mau_mat)

        def __str__(self):
            return super().__str__()+f", Màu lông: {self.mau_long}, Màu mắt:   {self.mau_mat}"
        
        def bat_chuot(self):
            print("con mèo bắt chuột")

        def leo_cay(self):
            print("con mèo leo cây")    

        def nhap(self):
            super().nhap()
            self.mau_long = input("Nhập màu lông: ")
            self.mau_mat = input("Nhập màu mắt: ")