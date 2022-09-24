#include<bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin>>s;
	for(int i=0; i<s.length(); i++){
		if(i%2 ==0 ){
			cout<<(char)(s[i]+1);
		}
		else{
			cout<<(char)(s[i]-1);
		}
	}
	return 0;
}
