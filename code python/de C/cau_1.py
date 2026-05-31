import random
def generate_list(n):
    lst = []
    for _ in range(n):
        lst.append(random.randint(1, 100))
    return lst

def check_prime(number):
    if number < 2:
        return False
    for i in range(2, int(number ** 0.5) + 1):
        if number % i == 0:
            return False
    return True

def prime_numbers(list_numbers):
    primes = []
    for num in list_numbers:
        if check_prime(num):
            primes.append(num)
    return primes


if __name__ == "__main__":
    n = int(input("Nhập số phần tử n: "))
    ds = generate_list(n)
    print("Danh sách sinh ngẫu nhiên:", ds)
    print("Các số nguyên tố trong danh sách:", prime_numbers(ds))
