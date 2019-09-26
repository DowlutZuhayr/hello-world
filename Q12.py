number = int(input("Enter a number:\n"))


def factors(x):
    print("Factors of ", x, "are: ")
    for i in range(1, x+1):
        if x % i == 0:
            print(i)


factors(number)









