# Tạo danh sách sinh viên đăng ký bài tập
Baitap = {
    "BT1": ["Huỳnh Kiệt", "Trọng Hưng"],
    "BT2": ["Duy Thiện", "Bảo Huy"],
    "BT3": ["Huỳnh Kiệt", "Quang Vinh"],
    "BT4": ["Bảo Huy", "Xuân Trường"],
    "BT5": ["Quang Minh", "Phước Tuấn"]
}

# In ra danh sách sinh viên đã đăng ký bài tập
print("Danh sách sinh viên đăng ký bài tập:")
for bt, ds_sv in Baitap.items():
    print(f"{bt}: {', '.join(ds_sv)}")

ten = input("\nNhập tên sinh viên cần tra: ")

baitap_sv = [bt for bt, ds_sv in Baitap.items() if ten in ds_sv]

if baitap_sv:
    print(f"\n{ten}  {', '.join(baitap_sv)}")
else:
    print(f"\n{ten}   ")

