from benh_nhan_ngoai_tru import BNNgoaiTru
from benh_nhan_noi_tru import BNNoiTru

class DSBenhNhan:
    def __init__(self): self.danh_sach = []

    def load_tu_file(self, filename="input.txt"):
        try:
            with open(filename, "r", encoding="utf-8") as f:
                for line in f:
                    p = line.strip().split(",")
                    if not p or len(p) < 6: continue
                    bn = BNNgoaiTru(p[1],p[2],p[3],p[4],p[5]) if p[0]=="NgoaiTru" else BNNoiTru(p[1],p[2],p[3],p[4],p[5])
                    self.danh_sach.append(bn)
            print("=> Load thành công!")
        except: print("=> Lỗi đọc file!")

    def them_moi(self):
        loai = input("Chọn loại (1: Ngoại trú, 2: Nội trú): ")
        bn = BNNgoaiTru() if loai == "1" else BNNoiTru()
        bn.nhap()
        self.danh_sach.append(bn)
        prefix = "NgoaiTru" if loai == "1" else "NoiTru"
        data = f"{prefix},{bn.ma},{bn.ho_ten},{bn.tien_thuoc},"
        data += f"{bn.phi_kham},{bn.phi_xet_nghiem}" if loai=="1" else f"{bn.phi_ngay},{bn.so_ngay}"
        with open("input.txt", "a", encoding="utf-8") as f: f.write(data + "\n")
        print("=> Đã thêm và lưu!")

    def in_danh_sach(self):
        for bn in self.danh_sach: print(bn)

    def ghi_file_noi_tru_cao(self):
        with open("out_dsbnnt.txt", "w", encoding="utf-8") as f:
            for bn in self.danh_sach:
                if isinstance(bn, BNNoiTru) and bn.vien_phi() >= 3000:
                    f.write(str(bn) + "\n")
        print("=> Đã xuất file out_dsbnnt.txt")

    def tim_theo_ma(self, ma):
        for bn in self.danh_sach:
            if bn.ma == ma: return print("Tìm thấy:", bn)
        print("Không tìm thấy.")

    def sap_xep_theo_ma(self):
        self.danh_sach.sort(key=lambda x: x.ma)
        print("=> Đã sắp xếp.")

