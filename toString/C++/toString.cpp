#include <iostream>
#include <string>
using namespace std;

string toString(int integers[], int arraySize);

int main(void) {
    int numbers[] = {9,1,1};
    int arraySize = sizeof(numbers) / sizeof(numbers[0]);
    cout << toString(numbers, arraySize) << endl;
    return 0;
}

string toString(int integers[], int arraySize) {
    string mainString;
    for(int number = 0; number <= arraySize; number++) {
        if(integers[number] == 0) mainString += "0";
        else if(integers[number] == 1) mainString.append("1");
        else if(integers[number] == 2) mainString.append("2");
        else if(integers[number] == 3) mainString.append("3");
        else if(integers[number] == 4) mainString.append("4");
        else if(integers[number] == 5) mainString.append("5");
        else if(integers[number] == 6) mainString.append("6");
        else if(integers[number] == 7) mainString.append("7");
        else if(integers[number] == 8) mainString.append("8");
        else if(integers[number] == 9) mainString.append("9");
    }
    return mainString;
}
