file1 = open("save1.txt", "r")
file2 = open("save2.txt", "r")

file1_open = file1.read()
print(file1_open)

file2_open = file2.read()
print(file2_open)

file3 = file1_open + file2_open
print(file3)

