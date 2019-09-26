word = input("enter a word")
n1 = "ing"
n2 = "ly"

if len(word) >= 3:
    if word.endswith(n1):
        word = word + n2
        print(word)

    else:
        print(word + n1)

else:
    print(word)
