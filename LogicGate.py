def main():
    gate = input("Enter logic gate AND/OR")

    if gate == "AND" or "OR":
        if gate == "AND":
            # when inputting values please do leave a space in between

            logic = input("inputs : ")
            if logic == '0 0':
                print('0')

            elif logic == "0 1":
                print('0')

            elif logic == "1 0":
                print(0)

            elif logic == "1 1":
                print(1)

        elif gate == "OR":
            logic = input("inputs : ")
            if logic == '0 0':
                print('0')

            elif logic == '0 1':
                print('1')

            elif logic == '1 0':
                print('1')

            elif logic == '1 1':
                print('1')

        else:
            print("Invalid Gate")

    restart = input("Do you wish to restart? (y/n) :").lower()
    if restart == "y":
        main()

    else:
        exit()


main()

