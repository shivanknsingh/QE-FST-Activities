dict={
     "kela" : 20,
     "seb" : 30,
     "pineapple" : 40 
}

randomFruit=input("Enter fruit naem")
for i in dict:
    if i==randomFruit:
        print("fruit is available with price " , dict.get(i))
        break
    else:
        print("false")
