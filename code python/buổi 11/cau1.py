import random

# a. Hàm sinh danh sách ngẫu nhiên
def generate_list(n):
    # Sinh ra n số nguyên ngẫu nhiên trong đoạn [1, 100]
    return [random.randint(1, 100) for _ in range(n)]

# b. Hàm kiểm tra số nguyên tố (không dùng thư viện)
def check_prime(number):
    if number < 2:
        return False
    # Duyệt từ 2 đến căn bậc 2 của number (hoặc number - 1)
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

# c. Hàm lọc số nguyên tố từ danh sách
def prime_numbers(list_numbers):
    primes = []
    for num in list_numbers:
        # Sử dụng lại hàm check_prime ở câu b
        if check_prime(num):
            primes.append(num)
    return primes

# --- Test thử code câu 1 ---
if __name__ == "__main__":
    n = 10
    my_list = generate_list(n)
    print(f"Danh sách ngẫu nhiên ({n} phần tử): {my_list}")
    
    primes = prime_numbers(my_list)
    print(f"Các số nguyên tố trong danh sách: {primes}")