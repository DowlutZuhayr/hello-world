num1 = input("Enter a number: ")
num2 = input("Enter another number: ")

def add():
    ans = int(num1) + int(num2)
    return ans

def sub():
    ans1 = int(num1) - int(num2)
    return ans1

def mul():
    ans2 = int(num1) * int(num2)
    return ans2

def div():
    ans3 = int( num1) / int(num2)
    return ans3

a = add()
b = sub()
c = mul()
d = div()

print(a)
print(b)
print(c)
print(d)
