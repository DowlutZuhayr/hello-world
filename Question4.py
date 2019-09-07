# Write a Python program that will find the L.C.M. of two input number.

a = int(input("input a number : "))
b = int(input("input a second number : "))

if a < b:
    lcmStore = a
else:
    lcmStore = b

while True:
    # using an if statement alone will not work because it needs to increment
    if lcmStore % a == 0 and lcmStore % b == 0:
        lcm = lcmStore
        print(lcm)
        break
    lcmStore += 1
