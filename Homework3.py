def main():
    num1 = input("Enter a number: ")
    if num1.isdigit():
        print("Continue")

    else:
        num1 = input("Enter a valid number: ")

    num2 = input("Enter another number: ")
    if num2.isdigit():
        print("Continue")

    else:
        num2 = input("Enter a valid number")

    operator_sign = input("Enter an operator sign")

    if operator_sign == '*':
        def mul(a, b):
            ans = int(a) * int(b)
            return ans
        result = mul(num1, num2)
        print(result)

    if operator_sign == '+':
        def add(c, d):
            ans1 = int(c) + int(d)
            return ans1
        result2 = add(num1, num2)
        print(result2)

    if operator_sign == '-':
        def sub(e, f):
            ans2 = int(e) - int(f)
            return ans2
        result3 = sub(num1, num2)
        print(result3)

    if operator_sign == '/':
        def div(g, h):
            ans3 = int(g) / int(h)
            return ans3
        result4 = div(num1, num2)
        print(result4)

    restart = input("Do you wish to restart?").lower()
    if restart == "yes":
        main()
    else:
        exit()


main()

