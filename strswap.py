word = input("enter a word")
word1 = input("enter a word")

word2 = word1[0:2] + word[2:]
word3 = word[0:2] + word1[2:]

result = word2 + " " + word3
print(result)

a = "abc"
b = "xyz"

c = a[:2] + b[2:]
d = b[:2] + a[2:]

print(c + " " + d)
