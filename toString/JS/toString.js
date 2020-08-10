function toString(integers) {
    mainString = ""
    for(number in integers) {
        if(integers[number] == 0) mainString += "0"
        else if(integers[number] == 1) mainString += "1"
        else if(integers[number] == 2) mainString += "2"
        else if(integers[number] == 3) mainString += "3"
        else if(integers[number] == 4) mainString += "4"
        else if(integers[number] == 5) mainString += "5"
        else if(integers[number] == 6) mainString += "6"
        else if(integers[number] == 7) mainString += "7"
        else if(integers[number] == 8) mainString += "8"
        else if(integers[number] == 9) mainString += "9"
    }
    return mainString
}

numbers = [9,1,1]
console.log(toString(numbers))
