user_number = int(input("Enter a number: "))

if user_number % 2 != 0:
    print("odd")
else:
    print("even")


list1 = list(range(1,10))
list2 = []
list3 = []
print(list1)

for i in list1:
    if i % 2 == 0:
        list2.append(i)

    else:
        list3.append(i)

print("EVEN: ", len(list2))
print("ODD: ", len(list3))
