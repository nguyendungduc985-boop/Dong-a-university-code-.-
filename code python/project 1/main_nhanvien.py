from nhan_vien_sx import NVSX
from nhan_vien_vp import NVVP
import os 
dsnv = [] 
def tao_nhan_vien(ttnv, i):
    """Tạo đối tượng NVSX hoặc NVVP từ danh sách thuộc tính."""
    loai_nv = ttnv[0].upper()  
    try:
        if loai_nv == "L": 
            if len(ttnv) >= 4:
                return NVSX(ttnv[1], int(ttnv[2]), int(ttnv[3]))
            else:
                print(f"Dòng {i+1} (NVSX) thiếu dữ liệu: {ttnv}")
        else: 
            if len(ttnv) >= 5:
                return NVVP(ttnv[1], int(ttnv[2]), float(ttnv[3]), float(ttnv[4]))
            else:
                print(f"Dòng {i+1} (NVVP) thiếu dữ liệu: {ttnv}")
                
    except ValueError:
        print(f"Dòng {i+1}: Dữ liệu không hợp lệ (Không phải số): {ttnv}")
    except Exception as e:
        print(f"Dòng {i+1}: Lỗi không xác định: {e} - Dữ liệu: {ttnv}")    
    return None 
def load_file(filename):
    global dsnv
    dsnv.clear() 
    file_path = filename 
    try:
        with open(file_path, "r", encoding="utf-8") as f:
            data = f.readlines()
            
            for i, nv in enumerate(data):
                ttnv = nv.strip().split(",") 

                if not ttnv or ttnv[0] == "": 
                    continue

                new_nv = tao_nhan_vien(ttnv, i)
                if new_nv:
                    dsnv.append(new_nv)          
    except FileNotFoundError:
        print(f"Lỗi: Không tìm thấy file '{filename}'. Vui lòng đảm bảo file nằm cùng thư mục.")
    except Exception as e:
        print(f"Đã xảy ra lỗi khi đọc file: {e}") 
    return dsnv 
def tinh_tong_tien(dsnv):
    """Tính tổng lương công ty phải trả."""
    tong_tien = sum(nv.luong() for nv in dsnv)
    return tong_tien
def ghi_ra_file(filename):
    """Đưa danh sách nhân viên có số năm công tác trên 7 năm ra file."""
    global dsnv
    nv_tren_7_nam = [nv for nv in dsnv if nv.so_nam > 7]
    try:
        with open(filename, "w", encoding="utf-8") as f:
            if not nv_tren_7_nam:
                f.write("Không có nhân viên nào có số năm công tác trên 7 năm.")
                print(f"Không có nhân viên nào đủ điều kiện, đã ghi thông báo vào file '{filename}'.")
            else:
                for nv in nv_tren_7_nam:
                    f.write(str(nv) + "\n")
                print(f"Đã ghi {len(nv_tren_7_nam)} nhân viên có số năm công tác trên 7 năm ra file '{filename}'.")
    except Exception as e:
        print(f"Lỗi khi ghi file: {e}")
def in_(dsnv):
    """Xuất thông tin tất cả các nhân viên ra màn hình."""
    if not dsnv:
        print("Danh sách nhân viên trống.")
        return
        
    print("\n--- THÔNG TIN TẤT CẢ CÁC NHÂN VIÊN ---")
    for i, nv in enumerate(dsnv):
        print(f"[{i+1}]: {nv}")
    print("---------------------------------------")
def menu():
    global dsnv
    while True:
        print("\n=== DANH MỤC LỰA CHỌN ===")
        print("1. Đọc danh sách nhân viên từ file")
        print("2. Tính tổng số tiền công ty sẽ trả cho các nhân viên")
        print("3. Đưa danh sách các nhân viên có số năm công tác trên 7 năm ra file")
        print("4. Xuất thông tin tất cả các nhân viên ra màn hình")
        print("5. Thoát chuong trình")
        
        chon = input("Nhập lựa chọn của bạn (1-5): ")
        if chon == '1':
            dsnv = load_file("nhanvien.txt") 
            print(f"Đã đọc xong {len(dsnv)} nhân viên hợp lệ.")
            
        elif chon == '2':
            if not dsnv:
                print("Danh sách nhân viên đang trống. Vui lòng chọn 1 để đọc file.")
            else:
                 print(f"Tổng số tiền mà công ty sẽ trả là: {tinh_tong_tien(dsnv):,.2f} VNĐ")
                 
        elif chon == '3':
            if not dsnv:
                print("Danh sách nhân viên đang trống. Vui lòng chọn 1 để đọc file.")
            else:
                 ghi_ra_file("nhanvien7nam.txt")
                 
        elif chon == '4':
             in_(dsnv)
        elif chon == '5':
            print("Kết thúc chương trình. Hẹn gặp lại!")
            return
        else:
            print("Bạn chọn không đúng chức năng vui lòng chọn lại!") 


if __name__ == "__main__":
    menu()