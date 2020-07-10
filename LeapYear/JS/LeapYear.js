var year = 2020
var leap

if(year % 4 == 0) {
    if((year / 4) % 100 == 0) {
        if(((year / 4) / 100) % 400 == 0) leap = true
        else leap = false
    }
    else leap = true
}
else leap = false

if(leap) console.log("Leap Year!")
else console.log("Normal Year!")
