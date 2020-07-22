a = [1, 2, 3, 10, 15, 21, 27, 33]
b = [2, 3, 5, 8, 71, 52]
duplicate = []

for i in a:
    if i in b:
        duplicate.append(i)
print(duplicate)


