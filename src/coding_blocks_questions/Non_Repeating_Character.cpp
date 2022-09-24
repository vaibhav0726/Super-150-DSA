#include<bits/stdc++.h>
using namespace std;

int main() {
	int t; cin>>t;
	while(t--){
		string s;
		cin>>s;
		int count[256];
		fill(count, count+256, 0);
		for(int i=0; i<s.length(); i++){
			count[s[i]]++;
		}
		bool flag = 0;
		for(int i=0; i<s.length(); i++){
			if(count[s[i]] == 1){
				flag = 1;
				cout<<s[i]<<endl;
				break;
			}
		}
		if(flag == 0){
			cout<<-1<<endl;
		}
	}
	

	return 0;
}
