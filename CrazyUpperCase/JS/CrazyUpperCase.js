const text = 'Icaro'.toLowerCase().trim().split(' ')

for(i in text) {
    for(j in text[i]) 
        console.log(text[i].replace(text[i][j], text[i][j].toUpperCase()))
    console.log('-'.repeat(15))
}
