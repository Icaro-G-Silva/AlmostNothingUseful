word = str(input('Please, write a word: '))
rWord = word[::-1]
if word == rWord: print(f'The word {word} is a palindrome!')
else: print(f'The word {word} is not a palindrome! Look -\n{rWord}')
