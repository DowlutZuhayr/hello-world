import math

formula = "ax**2 + bx + c"

a = float(input("Input value of a : "))
b = float(input("Input value of b : "))
c = float(input("Input value of c : "))

numerator = (b**2) - (4*a*c)

answerPositive = (-b + math.sqrt(numerator))/(2*a)
answerNeg = (-b - math.sqrt(numerator))/(2*a)

print(answerPositive, answerNeg)






