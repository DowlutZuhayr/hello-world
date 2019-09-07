# Write a Python program that will accept a number. If you reverse the given number
# and it is the same as the original number then the program should return true

# to accept a number
number = input("Enter a number")
b = len(number)
count = 0

if not(number.isnumeric()):
    number = input("Enter a valid number : ")
a = number[::-1]
print("The reverse order is : " + a)

c = number[0:]
print("The correct order is : " + c)

if number[0:] == number[::-1]:
    result = True
    print(result)
else:
    result1 = False
    print(result1)



