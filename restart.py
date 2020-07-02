def main():
    print("hello World!")
    user1 = input("Input your name:")
    user2 = int(input("Input your age: "))

    print("Your name is ", user1, "and your age in 50 years will be ", user2 + 50)

    restart = input("Try again? \nPress 1 to try again : \nPress 2 to exit :")
    if restart == "1":
        main()
    else:
        exit()

main()
