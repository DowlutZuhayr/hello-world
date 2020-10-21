import time

begin = time.time()

z = 4
for i in range(1,10):
    x = z-1
    y = z + 3 * i
    if (x > 0) and (y > 0):
        print("the value of the sum x + y is", x+y)

time.sleep(1)
end = time.time()

print(f"Total runtime of the program is {end - begin}")