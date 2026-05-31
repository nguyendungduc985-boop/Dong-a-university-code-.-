from animal import animal
from cat import cat
from fish import fish



if __name__ == "_main_":
    anil =animal()
    anil.nhap()

    ani2 = animal("hổ skbidi", 100)

    print(anil)
    print(ani2)
    
    anil.an()
    ani2.di_chyen()
     
    cat1 = cat()
    cat1.nhap()

    cat2 = cat("tom", 4, "Vàng", "Xanh")
    print(cat2)
    cat2.an()
    cat2.leo_cay()

    fish1 = fish()
    fish1.nhap()

    
    
    
    fish2 = fish("Cá vàng", 0.2, "Nước ngọt")
    print(fish2)
    fish2.an()
    fish2.boi()
