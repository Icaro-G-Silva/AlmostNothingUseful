var word = 'Tenet'.toUpperCase()
var rWord = ''
for(let i = word.length - 1; i >= 0; i--) {
    rWord += word[i]
}
if(word == rWord) console.log(`The word ${word} is a palindrome!`)
else console.log(`The word ${word} is not a palindrome! Look -\n${rWord}`)
