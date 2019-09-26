def main():

    day = input("input a day : ")
    skipTo = int(input("Enter the number of days you wish to skip to : "))

    if day == "monday" and skipTo % 7 == 0:
        print("monday")

    if day == "monday" and skipTo % 7 == 1:
        print("tuesday")

    if day == "monday" and skipTo % 7 == 2:
        print("wednesday")

    if day == "monday" and skipTo % 7 == 3:
        print("thursday")

    if day == "monday" and skipTo % 7 == 4:
        print("friday")

    if day == "monday" and skipTo % 7 == 5:
        print("saturday")

    if day == "monday" and skipTo % 7 == 6:
        print("sunday")

        #################################################

    if day == "tuesday" and skipTo % 7 == 0:
        print("tuesday")

    if day == "tuesday" and skipTo % 7 == 1:
        print("wednesday")

    if day == "tuesday" and skipTo % 7 == 2:
        print("thursday")

    if day == "tuesday" and skipTo % 7 == 3:
        print("friday")

    if day == "tuesday" and skipTo % 7 == 4:
        print("saturday")

    if day == "tuesday" and skipTo % 7 == 5:
        print("sunday")

    if day == "tuesday" and skipTo % 7 == 6:
        print("monday")

    ################################################################

    if day == "wednesday" and skipTo % 7 == 0:
        print("wednesday")

    if day == "wednesday" and skipTo % 7 == 1:
        print("thursday")

    if day == "wednesday" and skipTo % 7 == 2:
        print("friday")

    if day == "wednesday" and skipTo % 7 == 3:
        print("saturday")

    if day == "wednesday" and skipTo % 7 == 4:
        print("sunday")

    if day == "wednesday" and skipTo % 7 == 5:
        print("monday")

    if day == "wednesday" and skipTo % 7 == 6:
        print("tuesday")

    ########################################################

    if day == "thursday" and skipTo % 7 == 0:
        print("thursday")

    if day == "thursday" and skipTo % 7 == 1:
        print("friday")

    if day == "thursday" and skipTo % 7 == 2:
        print("saturday")

    if day == "thursday" and skipTo % 7 == 3:
        print("sunday")

    if day == "thursday" and skipTo % 7 == 4:
        print("monday")

    if day == "thursday" and skipTo % 7 == 5:
        print("tuesday")

    if day == "thursday" and skipTo % 7 == 6:
        print("wednesday")

    ####################################################

    if day == "friday" and skipTo % 7 == 0:
        print("friday")

    if day == "friday" and skipTo % 7 == 1:
        print("saturday")

    if day == "friday" and skipTo % 7 == 2:
        print("sunday")

    if day == "friday" and skipTo % 7 == 3:
        print("monday")

    if day == "friday" and skipTo % 7 == 4:
        print("tuesday")

    if day == "friday" and skipTo % 7 == 5:
        print("wednesday")

    if day == "friday" and skipTo % 7 == 6:
        print("thursday")

        #################################################

    if day == "saturday" and skipTo % 7 == 0:
        print("saturday")

    if day == "saturday" and skipTo % 7 == 1:
        print("sunday")

    if day == "saturday" and skipTo % 7 == 2:
        print("monday")

    if day == "saturday" and skipTo % 7 == 3:
        print("tuesday")

    if day == "saturday" and skipTo % 7 == 4:
        print("wednesday")

    if day == "saturday" and skipTo % 7 == 5:
        print("thursday")

    if day == "saturday" and skipTo % 7 == 6:
        print("friday")

        ######################################################

    if day == "sunday" and skipTo % 7 == 0:
        print("sunday")

    if day == "sunday" and skipTo % 7 == 1:
        print("monday")

    if day == "sunday" and skipTo % 7 == 2:
        print("tuesday")

    if day == "sunday" and skipTo % 7 == 3:
        print("wednesday")

    if day == "sunday" and skipTo % 7 == 4:
        print("thursday")

    if day == "sunday" and skipTo % 7 == 5:
        print("friday")

    if day == "sunday" and skipTo % 7 == 6:
        print("saturday")

    print(" ")

    restart = input("Do you wish to try again? \nPress 1 to continue : \nPress 2 to exit : ")
    if restart == "1":
        main()

    else:
        exit()

main()

