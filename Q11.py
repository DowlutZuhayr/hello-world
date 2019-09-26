from datetime import date

x = int(input("Enter the lesser year\n"))
y = int(input("Enter the lesser month\n"))
z = int(input("Enter the lesser day\n"))

x1 = int(input("Enter the greater year\n"))
y1 = int(input("Enter the greater month\n"))
z1 = int(input("Enter the greater day\n"))

first_date = date(x, y, z)
last_date = date(x1, y1, z1)

daysBetween = last_date - first_date

print(daysBetween.days, " days")