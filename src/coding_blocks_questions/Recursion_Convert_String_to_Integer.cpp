#include<bits/stdc++.h>
using namespace std;

void foo(string input, int &output, int idx){
	if(idx >= input.length()){
		return;
	}
	char ch = input[idx];
	output = output*10 + ((int)(ch) - 48);
	foo(input, output, idx+1);
}

int main() {
	string str;
	cin>>str;
	int output = 0;
	foo(str, output, 0);
	cout<<output;
	return 0;
}
