alphabet = ('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
decryptedWord = []

word = list(str(input('Write the ciphered word: ')).upper().strip())
factor = int(input('Write the factor: '))

for char in word:
    actualIndex = alphabet.index(char)
    newIndex = actualIndex - factor
    if newIndex > len(alphabet):
        print("I don't know how it happened, but 'newIndex' > 'alphabet'")
        exit()
    elif newIndex < 0: newIndex = len(alphabet) - (newIndex * -1)
    decryptedWord.append(alphabet[newIndex])

for char in decryptedWord: print(char, end='')
