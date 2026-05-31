class Music:
    def __init__(self, ten="", bai_hat_thich="", bai_hat_khong_thich=""):
        self.__ten = ten
        self.__bai_hat_thich = bai_hat_thich
        self.__bai_hat_khong_thich = bai_hat_khong_thich

    def get_ten(self):
        return self.__ten
    
    def set_ten(self, new_ten=""):
        self.__ten = new_ten

    def get_bai_hat_thich(self):
        return self.__bai_hat_thich
    
    def set_bai_hat_thich(self, new_bai_hat_thich=""):
        self.__bai_hat_thich = new_bai_hat_thich

    def get_bai_hat_khong_thich(self):
        return self.__bai_hat_khong_thich
    
    def set_bai_hat_khong_thich(self, new_bai_hat_khong_thich=""):
        self.__bai_hat_khong_thich = new_bai_hat_khong_thich

    def listen(self,song=""):
        if self.get_bai_hat_thich().lower() == song.lower():
            print(f"{self.get_ten()} đang nghe bài hát {song} và rất thích nó")

        elif self.get_bai_hat_khong_thich().lower() == song.lower():
            print(f"{self.get_ten()} đang nghe bài hát {song} nhưng không thích nó")