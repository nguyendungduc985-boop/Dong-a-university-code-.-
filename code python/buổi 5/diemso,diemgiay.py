import time

# Bài 1: nhập số cho đến khi nhập số âm
while True:
    n = int(input("Nhập số n = "))
    if n < 0:
        print("Bạn đã nhập số âm ")
        break


# Bài 2: đếm giây
n = int(input("Nhập số giây n = "))
while n >= 1:
    print(n)
    time.sleep(1)
    n -= 1
print("START")


#hiển thị xanh - vàng - đỏ


n_green = 10
while n_green >= 1:
    print("\033[92m" + str(n_green) + "\033[0m")
    time.sleep(1)
    n_green -= 1


n_yellow = 3
while n_yellow >= 1:
    print("\033[93m" + str(n_yellow) + "\033[0m")
    time.sleep(1)
    n_yellow -= 1


n_red = 5
while n_red >= 1:
    print("\033[91m" + str(n_red) + "\033[0m")
    time.sleep(1)
    n_red -= 1

