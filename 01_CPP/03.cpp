#include<iostream>
using namespace std;
void doubleTheValue1(int num) {
    num *= 2;
    cout << "Inside : " << num <<endl;
}
void doubleTheValue2(int &num) {
    num *= 2;
    cout << "Inside : " << num <<endl;
}
int main() {
    int num = 10;
    doubleTheValue1(num);
    cout << "Outside : "<< num <<endl;

    doubleTheValue2(num);
    cout << "Outside : "<< num <<endl;

    return 0;
}