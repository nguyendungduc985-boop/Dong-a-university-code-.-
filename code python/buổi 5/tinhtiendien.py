kw = int(input("nhập só kw điện đã tiêu thụ: "))

gia1,gia2,gia3,gia4,gia5,gia6 = 1678,1734,2014,2536,2834,2927

tien=0
if kw <=50:
    tien = 50 * gia1
elif kw <=100:
    tien = 50 * gia1+ (kw-50) * gia2
elif kw <=200:
    tien = 50 * gia1 + 50*gia2 + (kw-100) *gia3
elif kw <=300:
    tien = 50 * gia1 + 50*gia2 + 100 *gia3 +(kw - 200)*gia4
elif kw <=400:
    tien = 50 * gia1 + 50*gia2 + 100 *gia3 + 100*gia4+(kw - 300)*gia5
else:
    tien = 50 * gia1 + 50*gia2 + 100 *gia3 + 100*gia4+100*gia5+(kw-400)*gia6

print(f"số tiền cần trả là :{tien}")    

