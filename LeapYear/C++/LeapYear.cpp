#include <iostream>
using namespace std;

int main() {
    int year;
    bool leap;
    cout << "Type a year: ";
    cin >> year;

    if(year % 4 == 0) {
        if((year / 4) % 100 == 0) {
            if(((year / 4) / 100) % 400 == 0) leap = true;
            else leap = false;
        }
        else leap = true;
    }
    else leap = false;

    if(leap) cout << "Leap Year!" << endl;
    else cout << "Normal Year!" << endl;

    return 0;
}