#Viết file cau_1.py thực hiện các yêu cầu sau:
#a. Hàm generate_list(n): Sinh ngẫu nhiên danh sách gồm $n$ số nguyên trong khoảng $[10, 1000]$.
#b. Hàm check_palindrome(number): Trả về True nếu number là số đối xứng (đọc xuôi hay ngược đều giống nhau, ví dụ: 121, 55, 909), ngược lại trả về False. (Gợi ý: Dùng phép chia lấy dư hoặc xử lý chuỗi).
#c. Hàm filter_palindromes(lst): Nhận vào một danh sách số và trả về danh sách mới chỉ chứa các số đối xứng (Sử dụng hàm ở câu b để kiểm tra).

import random

def genarate_list(n):
    return [random.randint(10, 1000) for _ in range(n) ]

def check_palidrome(number):
    s = str(number)
    return s == s[::-1]

def filter_palidrome(lst):
    result = []
    for x in lst:
        if check_palidrome(x):
            result.append(x)
    return result
lst = genarate_list(10)
print("List ngẫu nhiên:", lst)
print("các số đối xứng:", filter_palidrome(lst))

#Đoạn mã sau dùng để quản lý động vật, nhưng khi chạy bị báo lỗi. Hãy chỉ ra dòng lỗi, nguyên nhân và sửa lại cho đúng.
class Animal:
    def __init__(self, name):
        self.name = name

class Dog(Animal):
    def __init__(self, name, breed):
        # Lỗi nằm quanh khu vực này
        self.breed = breed
    
    def speak(self):
        print(f"{self.name} is a {self.breed}")

dog = Dog("Milu", "Pug")
dog.speak()

#Câu 3: Lập trình hướng đối tượng (OOP) - Trọng tâm
#Một trường Đại học cần quản lý lương Giảng viên với mô tả sau:
#Lớp cha GiangVien: gồm thuộc tính ma_gv, ho_ten, luong_co_ban.
#Lớp con GVCoHuu (Giảng viên cơ hữu): kế thừa GiangVien, thêm thuộc tính he_so_luong và phu_cap.
#Lớp con GVThinhGiang (Giảng viên thỉnh giảng): kế thừa GiangVien, thêm thuộc tính so_gio_day và don_gia.

#Machine Learning cơ bản
#Cho đoạn code sử dụng thư viện sklearn để dự đoán Doanh thu (Sales) dựa trên Chi phí quảng cáo (AdSpend):
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

data = {'AdSpend': [100, 200, 300, 400, 500], 
        'Sales': [20, 45, 60, 85, 100]}
df = pd.DataFrame(data)

# ... (Các dòng code bị thiếu) ...-