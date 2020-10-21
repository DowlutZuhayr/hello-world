from tkinter import *

win = Tk()

b1 = Button(win, text="one")
b2 = Button(win, text="two")


# b2.pack(side="left")
# b1.pack(side="right")

b1.grid(row=0, column=1)
b2.grid(row=1, column=0)

win.mainloop()
