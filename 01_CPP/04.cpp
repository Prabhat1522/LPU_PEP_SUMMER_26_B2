#include<iostream>
using namespace std;
int main() {
    int a = 10;
    int *ptr = &a;

    cout << &a <<endl; //address of a
    cout << ptr <<endl; //address of a
    cout << *ptr <<endl; //value of a
    cout << *(ptr + 1) <<endl; //garbage value
    return 0;
}