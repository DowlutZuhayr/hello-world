# Write a Python program for the stock of a pharmacy, with menu 1. Add an item to
# stock pharmacy, 2. Remove item from stock, 3. Insert item at specified position.
# Your program should do all the operations. Hint: use list.


def main():

    menu1 = ["Panadol", "Doliprane", "Cough Syrup", "Regamol", "Vitamins", "Calciums"]
    print(menu1)
    a = len(menu1)
    print(a)

    print("Press 1 to add an item. \nPress 2 to remove an item \nPress 3 to insert an item.")
    choice = int(input("Input Your Choice: "))
    if choice != 1 and choice != 2 and choice != 3:
        print("Invalid Output")
        choice = int(input("Enter 1, 2 or 3: "))

    if choice == 1:
        # add item
        new_item = input("Enter item you wish to add : ")
        menu1.append(new_item)
        print(menu1)

    if choice == 2:
        # remove item
        remove_item = input("Enter item you wish to remove: ")

        if remove_item in menu1:
            if remove_item in menu1:
                menu1.remove(remove_item)
                print(menu1)
        else:
            remove_item = input("Enter a valid item you wish to remove: ")
            menu1.remove(remove_item)
            print(menu1)

    if choice == 3:
        # insert item

        insert_item = input("Which item do you want to insert : ")
        where_item = int(input("where do you want to insert it? (We have 5 items in our stock) : "))

        menu1.insert(where_item, insert_item)
        print(menu1)

    restart = input("Do you wish to try again? \nPress 1 to continue : \nPress 2 to exit :  ")
    if restart == "1":
        main()

    else:
        exit()


main()




