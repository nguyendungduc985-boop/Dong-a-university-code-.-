dssv = []

def doc_file(filename):
f==open(filename,"r",encoding="utf-8")
lines = f.readlines()#đọc hết file đưa và mảng data
for sv in data:
    if not sv.isspace():
        if not sv.isspace():
            id = sv.split(",")[0]
            ho_ten = sv.split(",")[1]
            diem = float(sv.split(",")[2])
            s = SinhVien(id, ho_ten, diem)
    dssv = doc_file("buoi8/mainsv.txt")
            dssv.append(s)
f.close()
return dssv
