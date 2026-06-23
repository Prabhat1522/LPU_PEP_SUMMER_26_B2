#include<iostream>
#include<vector>
using namespace std;

int main() {
    vector<int> vec1 = {1, 2, 3, 4, 5};
    //cout << vec1[13]<<endl;
    //cout << vec1.at(13)<<endl;
    vec1.push_back(6);
    cout << vec1.size() << endl;
    vec1.pop_back();
    cout << vec1.size() << endl;
    vec1.clear();
    cout << vec1.size() << endl;


}