f = open("buổi 7/input2.txt", "r", encoding="utf-8")
data = f.readlines()
f1 = open("buổi 7/output2.txt", "w", encoding="utf-8")
for row in data:
    if not row.isspace():     
        row_data = row.split()

        tiền = int(row_data[0])  
        tháng = int(row_data[1]) 

        if tháng == 3:
            lãisuất = 0.5
        elif tháng == 6:
            lãisuất = 0.8
        elif tháng == 12:
            lãisuất = 1.2
        else:
            lãisuất = 0

        lãi = int(tiền * (lãisuất / 100))
       
        f1.write(f"tiền {tiền} gửi {tháng} tháng có lãi là {lãi} đồng\n")

f.close()
f1.close()
