#game đếm số bạn nam nữ trong dictionary cho trước
people={    
    1:{"name":"An", "gender":"male"},
    2:{"name":"Bình", "gender":"male"},
    3:{"name":"Cường", "gender":"male"},
    4:{"name":"Dũng", "gender":"male"},
    5:{"name":"Lan", "gender":"female"},
    6:{"name":"Mai", "gender":"female"},
    7:{"name":"Hà", "gender":"female"},
    8:{"name":"Phương", "gender":"female"},
}    
#lấy các value đưa ra list,mỗi phần tử là một dict nhỏ
people_values = people.values()
print(people_values)
list_people = list(people_values)
print(list_people)
#duyệt qua các phàn tử của list để đếm male và female
count_male = count_female = 0
for person in people_values:
    if person["gender"] == "male":
        count_male += 1
    else:
        count_female += 1
print(f"count male: {count_male}\ncount female: {count_female}")