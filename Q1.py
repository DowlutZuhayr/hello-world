ins_temp = float(input("Enter temperature : "))
ins_type = input("Input C for Celsius or F for Fahrenheit : ")


c = ins_temp   # "temperature in celsius"
f = ins_temp   # "temperature in fahrenheit

formula_to_C = (c * (9/5)) + 32
formula_to_F = (f - 32) * (5/9)

if ins_type == "C":
    print(formula_to_C, "F")

if ins_type == "F":
    print(formula_to_F, "C")














