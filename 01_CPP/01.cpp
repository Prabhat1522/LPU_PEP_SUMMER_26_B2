#include<iostream>
using namespace std;

//function
    void fun1() {
        cout<< "The value of x is: " << x <<endl;
    }
    int fun2(int x){
        return x;
    }

int main() {
    //int age = 10;
    // int -> 4 byte
    // long long -> 8 byte
    // float -> 4 byte
    // double -> 8 byte

    // char -> 1 byte (2 byte in java)
    // bool -> 1 byte (1 byte in java)

    cout << "Hello, World!" << endl;
    // cout<<age<<endl;
    // int marks, leaves;
    // cin>>marks>>leaves;
    // if(marks > 50 && leaves < 10) {
    //     cout<<"Student is pass"<<endl;
    // } else {
    //     cout<<"Student is fail"<<endl;
    // }

    // char grade = 'A';
    // switch(grade) {
    //     case 'A':
    //         cout<<"Excellent"<<endl;
    //         break;
    //     case 'B':
    //         cout<<"Good"<<endl;
    //         break;
    //     case 'C':
    //         cout<<"Average"<<endl;
    //         break;
    //     default:
    //         cout<<"Invalid"<<endl;
    // }

    // int x, y;
    // cin>>x>>y;
    // int ans =(x > y) ? x : y;
    // cout<<ans<<endl;

    // int i = 0;
    // for(int i = 0; i < 5; i++) {
    //     cout<<i<<endl; // 0 1 2 3 4
    // }
    // while(i < 5) {
    //     cout<<i<<endl; // 0 1 2 3 4
    //     i++;
    // }
    // do {
    //     cout<<i<<endl; // 5
    //     i++;
    // } while(i < 5);

    //Hollow Rectangle pattern
    // int r, c;
    // cin>>r>>c;
    // for(int i=0;i<r;i++) {
    //     for(int j=0;j<c;j++) {
    //         if(i==0 || i==r-1 || j==0 || j==c-1) {
    //             cout<<"*";
    //         } else {
    //             cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    // }
    
    fun1(10);
    
    
    return 0;
}