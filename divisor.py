user_choice = int(input("Please choose a number to divide: "))
theList = list(range(1, 101))
finalList = []

for i in theList:
    if user_choice % i == 0:
        finalList.append(i)

print(finalList)
