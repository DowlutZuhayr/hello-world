word = input("enter a word")

my_count = {}

for x in word:
    my_count[x] = word.count(x)
    print(my_count)
