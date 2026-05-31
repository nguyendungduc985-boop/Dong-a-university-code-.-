class QLSV:
    """Class Quản lý Sinh viên"""
    def __init__(self, hoten="", diem=0.0):
        self.hoten = hoten
        self.diem = diem
    def nhap(self):
        self.hoten = input("Nhập họ tên: ")
        while True:
            try:
                self.diem = float(input("Nhập điểm: "))
                if 0 <= self.diem <= 10:
                    break
                else:
                    print("Điểm phải nằm trong khoảng từ 0 đến 10. Vui lòng nhập lại.")
            except ValueError:
                print("Lỗi: Điểm phải là một số. Vui lòng nhập lại.")
    def xephocluc(self):
        if self.diem < 5:
            return "Yếu"
        elif self.diem < 7:
            return "Trung bình"
        elif self.diem < 8:
            return "Khá"
        elif self.diem < 9:
            return "Giỏi"
        else:
            return "Xuất sắc"
    def xuat(self):
        hocluc = self.xephocluc()
        print(f"Họ tên: {self.hoten}, Điểm: {self.diem}, Học lực: {hocluc}")
if __name__ == "__main__":
    print("--- Nhập thông tin Sinh viên 1 ---")
    sv1 = QLSV()
    sv1.nhap()
    print("\n--- Thông tin Sinh viên 1 ---")
    sv1.xuat()
    print("\n--- Nhập thông tin Sinh viên 2 ---")
    sv2 = QLSV() 
    sv2.nhap()
    print("\n--- Thông tin Sinh viên 2 ---")
    sv2.xuat()