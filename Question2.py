# Write a Python program that will accept four lists of four values. Then your program
# should find the list whose sum of elements is the highest and display the list.

# 4 lists with 4 values
list1 = [10, 20, 30, 40]
list2 = [9, 8, 12, 13]
list3 = [8, 52, 9, 1]
list4 = [4, 60, 1, 2]

sum1 = 0
sum2 = 0
sum3 = 0
sum4 = 0

for x in list1:
    sum1 += x

for x in list2:
    sum2 += x

for x in list3:
    sum3 += x

for x in list4:
    sum4 += x

a = sum1
b = sum2
c = sum3
d = sum4

print(a)
print(b)
print(c)
print(d)

if a > b and a > c and a > d:
    print("list1", list1)

elif b > a and b > c and b > d:
    print("list2", list2)

elif c > a and c > b and c > d:
    print("list3", list3)

elif d > a and d > b and d > c:
    print("list4", list4)

else:
    print("Exit")




