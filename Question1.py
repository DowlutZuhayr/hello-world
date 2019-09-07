# Write a simple program that will prompt user to input a sentence. Your program
# will count all lower case alphabets, upper case alphabets, digits, and special
# symbols. Then your program will display the all the counts on screen.

# prompt the user to input a sentence
sentence = input("Enter a sentence")
count = 0
count1 = 0
count2 = 0

a = not(sentence.isalnum())

# use a for loop to go through each iteration and if statement to verify
for x in sentence:
    if x.isupper():
        count = count + 1

    elif x.islower():
        count1 = count1 + 1

    elif not(x.isalnum()):
        count2 = count2 + 1

print("Number of uppercase letters are", count)
print("Number of lower case numbers are", count1)
print("Number of special symbols are", count2)






















