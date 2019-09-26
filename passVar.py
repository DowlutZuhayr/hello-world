num1 = input("Enter a number: ")
num2 = input("Enter another number: ")


def add(a, b):
    ans = int(a) + int(b)
    return ans


result = add(num1, num2)
print(result)


def sub(c, d):
    ans1 = int(c) - int(d)
    return ans1


result1 = sub(num1, num2)
print(result1)


def mul(e, f):
    ans2 = int(e) * int(f)
    return ans2


result2 = mul(num1, num2)
print(result2)


def div(g, h):
    ans3 = int(g) / int(h)
    return ans3


result3 = div(num1, num2)
print(result3)


