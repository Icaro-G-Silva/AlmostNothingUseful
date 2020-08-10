def toString(*integers):
    mainString = str()
    for number in integers:
        if number == 0: mainString += '0'
        elif number == 1: mainString += '1'
        elif number == 2: mainString += '2'
        elif number == 3: mainString += '3'
        elif number == 4: mainString += '4'
        elif number == 5: mainString += '5'
        elif number == 6: mainString += '6'
        elif number == 7: mainString += '7'
        elif number == 8: mainString += '8'
        elif number == 9: mainString += '9'
    return mainString

print(toString(9,1,1))
