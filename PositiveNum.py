pos_num = input("Enter a positive number: ")

for i in range(0, int(pos_num)):
    if i % 2 == 0:
        print(i)

print("Now onto the odd numbers")

for i in range(0, int(pos_num)):
    if i % 2 != 0:
        print(i)
