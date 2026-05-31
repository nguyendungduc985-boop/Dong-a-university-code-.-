#DEMO 1


#tạo hàng
a= list()
print(a)

#thêm số
a.append(1)
print(a)
a.append(2)
print(a)

#in ra độ dài của list a
print(f"len = {len(a)}")
print("len = ", len(a))
print("len = " + str(len(a)))

#đếm xem có bao nhiêu số 2
print(f"có tất cả bao nhiêu {a.count(2)} số 2:")

#thay đôi vị trí số 0 và số 2
a[0] =9
print(a)

#xóa phan tử thứ 2 (index 1) khối list:hàm pop
a.pop(1)
print(a)

#thay đổi list a
b = list("PYTHON")
print(b)

#thêm chữ N vào khối list b
b.append("N")
print(b)
#xóa chữ N trong khối list b
b.remove("N")
print(b)

#Đếm xem có bao nhiêu chữ P
print(f"có tất cả bao nhiêu chữ P: {b.count('P')}")

#Xóa các chu tu [1:4]
del b[1:4]
print(b)

#đảo ngược khối list b
b.reverse()
print(b)

#sắp xếp khối list b
b.sort()
print(b)

#xóa hết các phần tử trong list b
b.clear()
print(b )

#kiểm tra list b có rỗng không
if len(b) == 0:
    print("list b rỗng")
else:
    print("list b không rỗng")
#DEMO 2


#tạo list c
c = list("Hello")
print(c)

#loại bỏ chữ ở giữa trong list c
c.pop(len(c)//2)
print(c)

#loại bỏ chữ nhỏ nhất trong list c
c.remove(min(c))
print(c)
#DEMO 3


#tạo list d
d = list("i love python")
print(d)

#sử dụng index chuyển đôi chữ love thành like
d[d.index("l")] = "l"
d[d.index("o")] = "i"
d[d.index("v")] = "k"
d[d.index("e")] = "e"
print(d)
#DEMO 4


# nhập chuỗi bất kỳ
s = input("nhập chuỗi bất kỳ: ")
print(s)

# chuyển sang list
s = list(s)
print(s)

# loại bỏ chữ ở giữa trong list s
a= len(s) // 2
print("kí tự ở giữa bị xóa là:", s[a])
s.pop(a)
print(s)

#loại bỏ chữ nhỏ nhất trong list s
small= min(s)       # tìm ký tự nhỏ nhất
print("kí tự nhỏ nhất bị xóa là:", small)
s.remove(small)      # xóa ký tự nhỏ nhất
print(s)

#DEMO 6
f= input ("nhập một chuỗi bất kỳ")

list_number =[]
f_num ="" #chuỗi tạm chứa các số 
for i in range(len(f)):
    if f[i].isnumeric(): #kiểm tra xem kí tự có phải là số không
        f_num += f[i]  #nếu là số thì thêm vào chuỗi tạm
    else:
        if len(f_num) >0: #nếu chuỗi tạm có số thì chuyển sang kiểu int và thêm vào list_number
            list_number.append(int(f_num))
            f_num ="" #xóa chuỗi tạm để chứa số tiếp theo