ten_hang = input("Ten hang: ")
so_luong = int(input("So luong: "))
don_gia = int(input("Don gia (VND): "))
vat_phan_tram = float(input("VAT (%): "))
thanh_tien = so_luong * don_gia
tien_vat = thanh_tien * (vat_phan_tram / 100)
tong_cong = thanh_tien + tien_vat

print("\n===== HOA DON =====")
print(f"{'Tên hàng':<20} {'Số lượng':<10} {'Đơn giá':<15} {'Thành tiền':<15}")
print("-" * 65)
print(f"{ten_hang:<20} {so_luong:<10} {don_gia:>14,.0f} {thanh_tien:>14,.0f}")
print("-" * 65)
print(f"VAT ({vat_phan_tram}%) {'':<32} {tien_vat:>14,.0f}")
print(f"TOTAL {'':<36} {tong_cong:>14,.0f}")