#include<bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin>>s;
	int i=0,j=s.length()-1;
	bool flag = 0;
	while(i<j)
	{
		if(s[i]!=s[j]){
			flag = 1;
			cout<<"false";
			break;
		}
		else{
			i++; j--;
		}
	}
	if(flag==0){
		cout<<"true";
	}
	return 0;
}
