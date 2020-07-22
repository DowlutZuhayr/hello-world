def reverse():
    user = input("Enter a string of multiple words: ")
    b = user.split()
    print(b)

    rev = b[::-1]
    result = " ".join(rev)
    print(rev)
    print(result)


reverse()

