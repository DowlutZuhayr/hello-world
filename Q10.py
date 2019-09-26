list1 = []
list2 = []

numbers = int(input("Enter number 1 :  "))
list1.append(numbers)

number2 = int(input("Enter number 2 : "))
list1.append(number2)

number3 = int(input("Enter number 3 : "))
list1.append(number3)

number4 = int(input("Enter number 4 : "))
list1.append(number4)

print(list1)

for x in list1:
    if x > 0:
        list2.append(x)
print(list2)



