# Write a Python program that will accept two lists of integer. Your program should
# create a third list such that it contain only odd numbers from the first list and even
# numbers from the second list.

list1 = [10, 21, 30, 45, 56]
list2 = [2, 8, 9, 57, 32, 1]

list3 = []

# odd numbers
for x in list1:
    if x % 2 != 0:
        list3.append(x)

# even numbers
for y in list2:
    if y % 2 == 0:
        list3.append(y)

print("List of even and odd numbers from two previous lists is", list3)

