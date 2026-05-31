# tạo dict để in biển số xe
b = {29: "Hà Nội", 15: "Hải Phòng", 43: "Đà Nẵng"}
print(b)

#thêm biển số xe đà nẵng,quảng ninh,quảng ngãi,quảng trị
b["43"] = "Đà Nẵng"
b["14"] = "Quảng Ninh"
b["58"] = "Quảng Ngãi"
b["75"] = "Quảng Trị"
b["73"] = "Thừa Thiên Huế"

#in ra xem số dict
print(b)

#bổ sung thêm biển số hà tĩnh
b["38"] = "Hà Tĩnh"

#xóa biển sô huế
del b["73"]

#sắp xếp theo mã biển số
b_new = (sorted(b.items()))

#sắp xếp theo tỉnh thành
b_new = dict(sorted(b.items(), key=lambda kv: kv[1]))
print(b_new)

#tìm tên các tỉnh thành theo các biển số đã được nhập
mã = int(input("nhập mã biển số xe:"))
kết_quả = b.get(mã, "không tìm thấy")
print(kết_quả)  

