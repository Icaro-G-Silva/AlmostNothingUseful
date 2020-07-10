var word = 'Tenet'.toLowerCase().split(''), counter = 0

for(let i = 0; i <= word.length; i++) {
    if(word[i] === 'a' || word[i] === 'e' || word[i] === 'i' || word[i] === 'o' || word[i] === 'u') {
        word[i] = word[i].toUpperCase()
        counter++
    }
}

if(counter === 0) {
    console.log('There arent any vowel!')
    return
}
word = word.join('')

console.log(`Numbers of vowels: ${counter}\nHere is where they are: ${word}`)
