from BS_Toan_TG import BSToanTG
from BS_Ban_TG import BSBanTG

list_bac_si = []
bs1 = BSToanTG("NV01", "Nguyễn Văn A", 5_000_000, 2_000_000, 1_500_000)
bs2 = BSBanTG("NV02", "Nguyễn Thị C", 15, 4_550_000, 26)

list_bac_si.append(bs1)
list_bac_si.append(bs2)

print("--- DANH SÁCH LƯƠNG BÁC SĨ ---")
for bs in list_bac_si:
    print(bs)