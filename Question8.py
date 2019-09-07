"""" Write a Python program to make a two-player Rock-Paper-Scissors game.
(Hint: Ask for player plays (using input), compare them, print out a message of
congratulations to the winner, and ask if the players want to start a new game)
Remember the rules:
Rock beats scissors
Scissors beats paper
Paper beats rock """


def main():

    player1 = input("Enter your name : ")
    play1_choice = input("Choose between 'Rock', 'Paper' and 'Scissors' : ")

    player2 = input("Enter your name: ")
    play2_choice = input("Choose between 'Rock', 'Paper' and 'Scissors' : ")

    if play1_choice == "Rock" and play2_choice == "Scissors":
        print("Congratulations " + player1)

    if play1_choice == "Scissors" and play2_choice == "Rock":
        print("Congratulations " + player2)

    if play1_choice == "Scissors" and play2_choice == "Paper":
        print("Congratulations " + player1)

    if play1_choice == "Paper" and play2_choice == "Scissors":
        print("Congratulations " + player2)

    if play1_choice == "Paper" and play2_choice == "Rock":
        print("Congratulations " + player1)

    if play1_choice == "Rock" and play2_choice == "Paper":
        print("Congratulations " + player2)

    if play1_choice == "Rock" and play2_choice == "Rock":
        print("Draw")

    if play1_choice == "Scissors" and play2_choice == "Scissors":
        print("Draw")

    if play1_choice == "Paper" and play2_choice == "Paper":
        print("Draw")

    restart = input("Do you wish to try again? \nPress 1 to continue : \nPress 2 to exit : ")
    if restart == "1":
        main()

    else:
        exit()


main()
