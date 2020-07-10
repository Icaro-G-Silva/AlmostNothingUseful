#include <iostream>
using namespace std;

int main() {

    int counter = 0;
    string word;
    cout << "Please, write a word: ";
    cin >> word;

    for(int i = 0; i <= word.length() -1; i++) {
        word[i] = tolower(word[i]);
        if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') {
            word[i] = toupper(word[i]);
            counter++;
        }
    }

    if(counter == 0) {
        cout << "There arent any vowel!" << endl;
        return 0;
    }

    cout << "Numbers of vowels: " << counter << "\nHere is where they are: " << word << endl;

    return 0;
}