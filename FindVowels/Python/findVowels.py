import sys

word = list(str(input('Please, write a word: ')))
counter = 0

for index, item in enumerate(word):
    if item in 'aeiou':
        word[index] = item.upper()
        counter += 1

if counter == 0:
    print('There arent any vowel!')
    sys.exit()

print(f'Numbers of vowels: {counter}\nHere is where they are: ', end='')

for item in word:
    print(f'{item}', end='')
