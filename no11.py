list1 = [1, 2, 3, 4, 5]
list2 = [2, 6, 7]


def common(n1, n2):
    for x in list1:
        for y in list2:
            if x == y:
                result = True
                return result


a = common(list1, list2)
print(a)
