ani = {"name2": "jerry", "name1": "tom", "name3": "spire"}
#in ra số phần tử trong dict
print("số phần tử của dict ani là:", len(ani))
ani["name4"] = "micky"
print(ani)

ani_new = sorted(ani.items()) #sắp xếp dict theo key
print(dict(ani_new))

ani_new_2= (sorted(ani.items(), key=lambda kv: kv[1]))
print(ani_new_2)
