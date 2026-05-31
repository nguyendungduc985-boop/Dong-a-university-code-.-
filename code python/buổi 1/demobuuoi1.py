print("Hello, World!")
print("This is a demo file.")
print("Xin chào các bạn")
#Toán tử
a = 4
b = 5
print(a + b)  # 4
print(a - b)  # 5
print(a * b)  # 4
print(a / b)  # 3
print(a // b) # 2 (chia lấy nguyên)
print(a % b)  # 1 (chia lấy dư)
print(a ** b) # 7 (lũy thừa)
#Biên và kiểu dữ liệu
x = 10              # int
y = 3.14            # float
name = "Python"     # string
is_ok = True        # boolean
lst = [1, 2, 3]     # list
tup = (4, 5, 6)     # tuple
dct = {"a": 1, "b": 2} # dict
st = {1, 2, 3}      # set
#cấu trúc điều khiển
age = 18
if age >= 18:
    print("Người lớn")
else:
    print("Trẻ con")
#vòng lặp
for i in range(5):    # 0 -> 4
    print(i)
x = 5
while x > 0:
    print(x)
    x -= 1
#hàm
def tong(a, b):
    return a + b

print(tong(3, 4))
#ngoại lệ
try:
    x = int("abc")
except ValueError:
    print("Lỗi: không chuyển được sang số")
#lớp& oop
class Animal:
    def __init__(self, name):
        self.name = name
    
    def speak(self):
        print(f"{self.name} đang kêu...")

dog = Animal("Chó")
dog.speak()
#import thu viện
import math, random, datetime

print(math.sqrt(16))       # 4.0
print(random.randint(1,10)) # số ngẫu nhiên 1-10
print(datetime.datetime.now())
#Một số hàm built-in hay dùng
len([1,2,3])   # 3
max([1,2,3])   # 3
min([1,2,3])   # 1
sum([1,2,3])   # 6
type(123)      # <class 'int'>
input("Nhập gì đó: ")
if 5 < 10:
   print("5 nhỏ hơn 10")
if 5 > 2:
 print("Five is greater than two!") 
if 5 > 2:
        print("Five is greater than two!")
x=5
y="Dũng"
print(x,y)
# (x) bằng 5.0
x=5
print(x)   

