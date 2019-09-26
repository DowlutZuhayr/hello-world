list1 = [1, 2, 1, 4, 5]
l = len(list1)
print(l)

for x in list1:
    if list1.count(x) > 1:
        list1.remove(x)

print(list1)

