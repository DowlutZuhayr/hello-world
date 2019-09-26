f = 101
print(f)

def global_f():
    global f
    print(f)
    f= " i am learning python."


global_f()
print(f)
