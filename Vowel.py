def main():
    character = input("Enter a character: ").upper()

    if character == 'A' or character == 'E' or character == 'I' or character == 'O' or  character == 'U':
        print("Vowel")

    else:
        print("Consonant")

    restart = input("Do you wish to try again? Y/N ")
    if restart == "Y":
        main()

    else:
        exit()


main()
