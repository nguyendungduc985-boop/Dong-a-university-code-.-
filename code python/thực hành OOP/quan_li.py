from danh_sach_benh_nhan import DSBenhNhan

def menu():
    ds = DSBenhNhan()
    while True:
        print("1. Load file | 2. Thêm Bệnh Nhân | 3. In Danh Sách | 4. Xuất Bệnh Nhân Nội trú cao")
        print("5. Tìm mã    | 6. Sắp xếp  | 7. Thoát")
        
        chon = input("Chọn số: ")
        if chon == "1": ds.load_tu_file()
        elif chon == "2": ds.them_moi()
        elif chon == "3": ds.in_danh_sach()
        elif chon == "4": ds.ghi_file_noi_tru_cao()
        elif chon == "5": ds.tim_theo_ma(input("Nhập mã: "))
        elif chon == "6": ds.sap_xep_theo_ma()
        elif chon == "7": break
        else: print("Vui lòng chọn từ 1-7.")

if __name__ == "__main__":
    menu()