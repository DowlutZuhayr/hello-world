a = input("length of first side")
b = input("length of second side")
c = input("length of third side")

if a == b != c or a == c != b or b == a != c or b == c != a or c == a != b or c == b != a :
    print("Isoceles")

if a != b != c:
    print("Scalene")

if a == b == c:
    print("Equilateral")






