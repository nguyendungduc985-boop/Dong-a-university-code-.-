diem = float(input("nhập điểm: "))
#cách 1
if diem < 5 :
    print("yếu")
elif diem <7:
    print("trung bình")   
elif diem <8:
    print("khá") 
elif diem <9:
    print("giỏi")  
else:
    print("xuất sắc") 
#cách 2
if diem < 5:
    print("yếu")
else:
    if diem < 7:
        print("trung bình")
    else:
        if diem < 8:
            print("khá")
        else:
            if diem < 9:
                print("giỏi")
            else:
                print("xuất sắc")                
