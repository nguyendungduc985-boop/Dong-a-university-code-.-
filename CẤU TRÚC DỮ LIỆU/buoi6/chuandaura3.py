def nhapMang(n):
    a = []
    for i in range(n):
        val = int(input(f"Nhập a [{i}]: "))
        a.append(val)
    return a

def inMang(a):
    for x in a:
        print(x, end = " ")
    print()

def insertionSort(a):
    for i in range(1, len(a)):
        key = a[1]
        j = i-1
        while j >= 0 and key < a[j]:
            a[j+1] = a[j]
            j -= 1
        a[j+1] = key

def binarySearch(a, x):
    left, right = 0, len(a) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if a[mid] == x:
            return mid
        elif a[mid] < x:
            left = mid + 1
        else:
            right = mid - 1
    return -1

if __name__ == "__main__":
    n = int(input("Nhập số phần tử cảu mảng: "))
    a = nhapMang(n)
    insertionSort(a)
    print("Mảng sau khi sắp xếp:")
    inMang(a)
    x = int(input("Nhập phần tử cần tìm: "))
    index = binarySearch(a,x)
    if index != -1:
        print(f"Phần tử {x} được tìm thấy tại vị trí {index}.")
    else:
        print(f"Phần tử {x} không được tìm thấy phần tử cần tìm ([index])")
        