#include<bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin>>s;
	char ch= s[0]; 
	char temp;
	int count = 1;
	int m = INT_MIN;
	for(int i=1; i<s.length();i++){
		if(ch == s[i]){
			count++;
		}
		else{
			if(count>m){
				temp = ch;
				m = count;
			}
			count=1;
			ch = s[i];
		}
	}
	if(count>m){
		temp = ch;
		m = count;
	}
	cout<<temp;
	return 0;
}
