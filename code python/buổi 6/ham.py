#viết menu 
def tinh_tong(a, b):
    print("Tổng =", a + b)

def tinh_hieu(a, b):
    print("Hiệu =", a - b)

def tinh_tich(a, b):
    print("Tích =", a * b)

def tinh_thuong(a, b):
    if b == 0:
        print("Không thể chia cho 0")
    else:
        print("Thương =", a / b)

def tinh_luy_thua(a, b):
    print(f"{a} ^ {b} =", a ** b)

def tinh_chia_lay_nguyen(a, b):
    if b == 0:
        print("Không thể chia cho 0")
    else:
        print("Chia lấy phần nguyên =", a // b)

def tinh_chia_lay_du(a, b):
    if b == 0:
        print("Không thể chia cho 0")
    else:
        print("Chia lấy phần dư =", a % b)

def tinh_uoc_so_chung_lon_nhat(a, b):
    from math import gcd
    print("Ước số chung lớn nhất =", gcd(a, b))

def tinh_boi_so_chung_nho_nhat(a, b):
    from math import gcd
    print("Bội số chung nhỏ nhất =", abs(a * b) // gcd(a, b))

def tinh_trung_binh_cong_tu_a_den_b(a, b):
    if a > b:
        a, b = b, a
    tong = sum(range(a, b + 1))
    print("Trung bình cộng =", tong / (b - a + 1))

def in_so_nguyen_to_trong_doan(a, b):
    if a > b:
        a, b = b, a
    print("Các số nguyên tố trong đoạn:")
    for i in range(a, b + 1):
        if i > 1:
            for j in range(2, int(i ** 0.5) + 1):
                if i % j == 0:
                    break
            else:
                print(i, end=" ")
    print()

def tinh_so_lon_nhat(a, b):
    print("Số lớn nhất =", max(a, b))


def menu():
    a = int(input("Nhập a: "))
    b = int(input("Nhập b: "))

    while True:
        print("1. Tính tổng")
        print("2. Tính hiệu")
        print("3. Tính tích")
        print("4. Tính thương")
        print("5. Tính lũy thừa")
        print("6. Tính chia lấy phần nguyên")
        print("7. Tính chia lấy phần dư")
        print("8. Tính ước số chung lớn nhất")
        print("9. Tính bội số chung nhỏ nhất")
        print("10. Tính trung bình cộng các số từ a đến b")
        print("11. In các số nguyên tố trong đoạn từ a đến b")
        print("12. Tính số lớn nhất")
        print("0. Thoát chương trình")
        print("=========================")

        chon = input("Bạn chọn chức năng số mấy: ")

        if chon == "1":
            tinh_tong(a, b)
        elif chon == "2":
            tinh_hieu(a, b)
        elif chon == "3":
            tinh_tich(a, b)
        elif chon == "4":
            tinh_thuong(a, b)
        elif chon == "5":
            tinh_luy_thua(a, b)
        elif chon == "6":
            tinh_chia_lay_nguyen(a, b)
        elif chon == "7":
            tinh_chia_lay_du(a, b)
        elif chon == "8":
            tinh_uoc_so_chung_lon_nhat(a, b)
        elif chon == "9":
            tinh_boi_so_chung_nho_nhat(a, b)
        elif chon == "10":
            tinh_trung_binh_cong_tu_a_den_b(a, b)
        elif chon == "11":
            in_so_nguyen_to_trong_doan(a, b)
        elif chon == "12":
            tinh_so_lon_nhat(a, b)
        elif chon == "0":
            print("Tạm biệt!")
            break
        else:
            print("Lựa chọn không hợp lệ, vui lòng chọn lại.")

if __name__ == "__main__":
    menu()
