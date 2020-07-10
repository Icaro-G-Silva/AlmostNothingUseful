year = int(input('Type the Year: '))

if year % 4 == 0:
    if (year / 4) % 100 == 0:
        if ((year/4)/100) % 400 == 0: leap = True
        else: leap = False
    else: leap = True
else: leap = False

if leap == True: print('Leap Year!')
else: print('Normal Year!')
