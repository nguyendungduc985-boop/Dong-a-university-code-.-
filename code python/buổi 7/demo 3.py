f = open("buổi 7/input3.txt","r",encoding="utf-8")
data = f.readlines()
f1 = open("buổi 7/output3.txt","w",encoding="utf-8")
for row in data:
    if not row.isspace():
        row_data = row.split()

    
        f1.write(f"nguyễn đức dũng")

        f1.write(f" quân")
           
f.close()
f1.close()