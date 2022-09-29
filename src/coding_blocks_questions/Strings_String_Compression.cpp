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
			if(count!=1)
            	cout<<ch<<count;
			else
				cout<<ch;
            ch = s[i];
            count = 1;
        }
        i++;
    }
	if(count!=1)
        cout<<s[s.length()-1]<<count;
	else
		cout<<ch;
    return 0;
}
