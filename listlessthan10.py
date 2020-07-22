a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
a1 = []
a2 = []

for i in a:
    if i < 5:
        a1.append(i)

    elif i > 5:
        a2.append(i)
print(a1)
print(a2)
