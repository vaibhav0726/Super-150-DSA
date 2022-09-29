#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    int i = 1;
    // int arr[26]= {0};
    char ch = s[0];
    int count = 1;
    while(i<s.length()){
        if(ch == s[i]){
            count++;
        }
        else{
            cout<<ch<<count;
            ch = s[i];
            count = 1;
        }
        i++;
    }
    cout<<s[s.length()-1]<<count;
    return 0;
}
