var = [1, 2, 3]
smallest = 100

for x in var:
    if x < smallest:
        smallest = x

print(smallest)

a = min(int(x) for x in var)
print(a)
