# dictionaries uses {} commas double quotes

f1Cars = {
    "Vettel": "Ferrari",
    "Hamilton": "Mercedes",
    "Verstappen": "Red Bull Aston Martin",
    "Sainz": "McLaren",
    "Raikonen": "Alfa Romeo",
    "Riciardo": "Renault",
    "Albon": "Toro Rosso",
    "Grosjean" : "Haas Ferrari",
    "Perez" : "Whatever the f it is called",
    "Russell": "Williams"
}

print(type(f1Cars))
# when using dictionaries use , after the " and apply end of statement ;
print(" The F1 cars that Vettel, Hamilton and Sainz drive are ", f1Cars["Vettel"], ",", f1Cars["Hamilton"], " and ",
      f1Cars["Sainz"],
      " respectively.")



