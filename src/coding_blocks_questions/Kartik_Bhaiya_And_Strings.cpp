#include<bits/stdc++.h>
using namespace std;

int foo(string str,int k,char a)
{
    int l = 0, g = 0, j = 0;
    for(int  i =0; i<str.size(); ++i){
        if(str[i] != a) g++;
        while(j <= i && g > k){
            if(str[j] != a)
            g--;
            j++;
        }
        l = max(i-j+1, l);
    }
    return l;
}
int main() {
	int n;
	cin>>n;
    string str;
	cin>>str;
    cout<<max(foo(str,n,'a'),foo(str,n,'b'));
    return 0;
}
