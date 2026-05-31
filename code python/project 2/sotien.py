class TaiKhoan:
    def __init__(self, ten_chu="", so_tk="", so_du=0):
        self.__ten_chu = ten_chu
        self.__so_tk = so_tk
        self.__so_du = so_du

    def nap(self, so_tien):
        if so_tien > 0:
            self.__so_du += so_tien
            print(f"Nạp {so_tien} vào tài khoản thành công.")
        else:
            print("Số tiền nạp phải lớn hơn 0.")

    def rut(self, so_tien):
        if so_tien <= 0:
            print("Số tiền rút phải lớn hơn 0.")
        elif so_tien > self.__so_du:
            print("Không đủ số dư để rút tiền.")
        else:
            self.__so_du -= so_tien
            print(f"Rút {so_tien} thành công.")

    def get_so_du(self):
        return self.__so_du

    def set_so_du(self, new_so_du):
        if new_so_du >= 0:
            self.__so_du = new_so_du
        else:
            print("Số dư không hợp lệ.")

    so_du = property(get_so_du, set_so_du)


# --- CHƯƠNG TRÌNH CHÍNH ---
ten = input("Nhập tên chủ tài khoản: ")
stk = input("Nhập số tài khoản: ")
sodu = int(input("Nhập số dư ban đầu: "))

tk = TaiKhoan(ten, stk, sodu)

tk.nap(int(input("Nhập số tiền muốn nạp: ")))
tk.rut(int(input("Nhập số tiền muốn rút: ")))

print("Số dư cuối cùng:", tk.so_du)
