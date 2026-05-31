# tính tổng các số trong file
f = open("buổi 7/input.txt")# default là rồi
data = f.readlines()
for row in data:
    if not row.isspace():
        row_data = row.split(",")

        tong = 0
        for x in row_data:
            if x.strip().isnumeric():
                tong += int(x)

                f1= open("buổi 7/output.txt","w",encoding="utf-8")
                f1.write(f"tổng các số là:{tong}")
                f1.close()
                print("tổng các số là:{tong}")

f.close()               


