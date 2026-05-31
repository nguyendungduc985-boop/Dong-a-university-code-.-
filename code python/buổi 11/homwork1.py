ma_sv = input("Ma SV: ")
ho_ten = input("Ho ten: ")
diem_qt = float(input("Diem Qua Trinh (0-10): "))
diem_gk = float(input("Diem Giua Ky (0-10): "))
diem_ck = float(input("Diem Cuoi Ky (0-10): "))
diem_tk = diem_qt * 0.2 + diem_gk * 0.3 + diem_ck * 0.5
ket_qua = "Dat" if diem_tk >= 5.0 else "Khong Dat"

print("\n----- BAO CAO -----")
print(f"Ma SV : {ma_sv}")
print(f"Ho ten: {ho_ten}")
print(f"Diem Qua Trinh: {diem_qt:.2f}")
print(f"Diem Giua Ky : {diem_gk:.2f}")
print(f"Diem Cuoi Ky : {diem_ck:.2f}")
print(f"Diem Tong Ket: {diem_tk:.2f}")
print(f"Ket qua      : {ket_qua}")