hayError = True
division = 8
sueldo = 0
while hayError:
    try:
        entrada = input("introduce tu sueldo")
        sueldo = float(entrada)
        divisor = int(input("introduce  un divisor"))
        division = division/divisor
        hayError = False

    except ValueError:
        print("could not convert string to float:")
    except ZeroDivisionError:
        print("division by zero")

print(sueldo)
print(division)