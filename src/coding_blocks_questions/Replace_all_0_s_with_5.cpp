#include<bits/stdc++.h>
using namespace std;

void f(int n){
	if(n <= 0) return;
	int rem = n % 10;
	n = n / 10;
	f(n);
	if(rem == 0) cout<<5;
	else cout<<rem;
}

int main () {
	int n;
	cin>>n;
	f(n);
	// cout<<n;
	return 0;
}
