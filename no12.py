li = ['Red', 'Green', 'White', 'Black', 'Pink', 'Yellow']
li1 = []

for x in li:
    if li.index(x) != 0 and li.index(x) != 4 and li.index(x) != 5:
        li1.append(x)

print(li1)
print(li[1:4] + li[6:])



