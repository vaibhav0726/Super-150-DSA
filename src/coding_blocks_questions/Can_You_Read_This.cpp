#include<bits/stdc++.h>
using namespace std;

int main() {
	string str;
	cin>>str;
	string s;
	s += str[0];
	int i=1;
	while(i<str.size()){
		if(islower(str[i])){
			s+=str[i];
		}
		else{
			cout<<s<<endl;
			s = "";
			s+=str[i];
		}
		i++;
	}
	cout<<s<<endl;
	return 0;
}
