#tính tông số chẵn
n = int(input("nhập n = "))

tong = 0
for i in range(n+1):
    if i % 2 ==0:
        tong += i

print(f"tổng là:{tong} ")



#in ra màn hình các dấu *
n = 7 #7 dòng
s= ""
for i in range(1, n+1):
    s += str(i) 
    print(s + "*" * (n-1))       