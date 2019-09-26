list1 = ["abc", "xyz", "aba", "1121", "202"]
count = 0

for x in list1:
    if x[0] == x[-1]:
        count = count + 1

print(count)


