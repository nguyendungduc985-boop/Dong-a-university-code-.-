n1 = int(input("nhập số thứ nhất: "))
n2 = int(input("nhập số thứ hai: "))
n3 = int(input("nhập số thứ ba: "))
n4 = int(input("nhập số thứ tư: "))

#cách 1
m = min(n1,n2,n3,n4)
print("giá trị bé nhất là:",m)

#cách 2
m = n1# mốc m lầ giá trị đầu tiên 
if m > n2:
    m = n2
if m > n3:
    m = n3
if m > n4:
    m = n4
print("giá trị bé nhất là:",m)  

n1 = int(input("nhập số thứ nhất: "))
n2 = int(input("nhập số thứ hai: "))
n3 = int(input("nhập số thứ ba: "))
n4 = int(input("nhập số thứ tư: "))

#cách 1
m = max(n1,n2,n3,n4)
print("giá trị lớn nhất là:",m)
