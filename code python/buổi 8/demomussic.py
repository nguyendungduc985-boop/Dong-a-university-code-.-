from music import Music

ds = []  
def menu():
    global ds        
    while True:
        print("1. khởi tạo danh sách")
        print("2. nhập tên bài hát và tìm kiếm")
        print("3. Thoát")

        chọn = input("bạn chọn chức năng số mấy(1-3): ")

        if chọn == "1":
            ds = []
            p1 = Music("Thành", "Con cò bé bé", "cháu lên ba")
            p2 = Music("lâm", "Bé đi mẫu giáo", "con cò bé bé")
            ds.append(p1)
            ds.append(p2)

        elif chọn == "2":
            bai_hat = input("nhập tên bài hát cần biết: ")
            for p in ds:           
                p.listen(bai_hat)

        elif chọn == "3":
            print("chương trình kết thúc")
            return

        else:
            print("chức năng không hợp lệ, vui lòng chọn lại")

if __name__ == "__main__":
    menu()

#if __name__== "__main__":
 #   p1 = Music("Thành","Con cò bé bé ","cháu lên ba")
  #  p2 = Music("lâm","Bé đi mẫu giáo","con cò bé bé")

   # p1.listen("Bé đi mẫu giáo")
    #p2.listen("Con cò bé bé")
