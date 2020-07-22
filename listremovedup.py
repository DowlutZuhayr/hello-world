a = [5, 5, 10, 10, 15, 20, 25]


def list_dup(x):
    z = []
    for i in x:
        if i not in z:
            z.append(i)
    return z

# using set automatically removes the duplicates from the list


def list_dup2(b):
    return list(set(b))


print(list_dup(a))
print(list_dup2(a))



