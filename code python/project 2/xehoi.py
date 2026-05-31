class xe_hoi:
    def __init__(self,hang_xe="",nam_san_xuat=0,van_toc=0):
        self.__hang_xe=hang_xe
        self.__nam_san_xuat=nam_san_xuat
        self.__van_toc=van_toc
    def van_toc(self):
        if self.__van_toc <120:
            return "xe yếu"
        elif self.__van_toc <160:
            return "xe tầm trung"
        elif self.__van_toc <200:
            return "mạnh"
        else:
            return "siêu xe" 
        #getter và setter cho van_toc
    def get_van_toc(self):
        return self.__van_toc
    def set_van_toc(self,new_van_toc=0):
        self.__van_toc=new_van_toc
    property(get_van_toc,set_van_toc)

#chương trình chính
xh=xe_hoi("honda",2020,150)
print("đánh giá xe:",xh.van_toc())  
xh.set_van_toc(220)
print("đánh giá xe sau khi tăng vận tốc:",xh.van_toc())