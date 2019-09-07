# Write a Python program that will find the H.C.F of two input number.

a = int(input("Enter a number : "))
b = int(input("Enter another number : "))
hcf = 0

if a > b:
    lcmStore = a
else:
    lcmStore = b

# use a for loop and range to go through the number between
for x in range(1, lcmStore+1):
    if a % x == 0 and b % x == 0:
        hcf = x
print(hcf)
