import random

def sansinhmang(n):
    mang=[]
    for i in range(n):
        so_ngau_nhien= random.randint(-100,100)
        mang.append(so_ngau_nhien)

    return mang

def tim_tuyen_tinh(mang, x):
    n = len(mang)
    for i in range(n):
        if mang[i] ==x :
            return i

    return -1

def main():
    mang = sansinhmang(20)
    print(mang)

    x = int(input("nhập vào một so nguyên cần tìm"))

    vitri  =tim_tuyen_tinh(mang ,x)
    if vitri != -1:
        print(f"giá trị {x} đã được tìm thấy tại vị trí {vitri}")
    else:
        print(f"giá trị {x} không được tìm thấy trong mảng")


if __name__ == "__main__":
    main()