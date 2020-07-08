#include <iostream>
using namespace std;

int main() {

    string word, rWord;
    cout << "Please, write a word: ";
    cin >> word;

    for(int i = 0; i <= word.length() -1; i++) {
        word[i] = toupper(word[i]);
    }
    
    for(int i = word.length() - 1; i >= 0; i--) {
        rWord = rWord.append(1, word[i]);
    }

    if(rWord == word) cout << "The word " << word << " is a palindrome!" << endl;
    else cout << "The word " << word << " is not a palindrome! Look -\n" << rWord << endl;

    return 0;
}