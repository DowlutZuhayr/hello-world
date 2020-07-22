user_input = input("enter a string: ")
print(user_input)

rev = user_input[::-1]

if rev == user_input:
    print("Palindrome \noutput: ", rev)


else:
    print("NOT palindrome because ", user_input, " in reverse is ", rev)
