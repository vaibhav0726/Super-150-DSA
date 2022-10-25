#include<bits/stdc++.h>
using namespace std;

void solve(int n, char A, char B, char C){
	if(n == 1){
		cout<<"Moving ring 1 from "<<A<<" to "<<C<<endl;
		return;
	}
	solve(n-1, A, C, B);
	cout<<"Moving ring "<<n<<" from "<<A<<" to "<<C<<endl;
	solve(n-1, B, A, C);
}

int main() {
	int n;
	cin>>n;
	solve(n, 'A', 'C', 'B');
	return 0;
}
