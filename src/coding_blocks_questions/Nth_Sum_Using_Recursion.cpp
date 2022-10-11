#include<bits/stdc++.h>
using namespace std;

int foo(int n){
	if(n <= 0) return 0;
	int sum = n + foo(n-1);
	return sum;
}

int main() {
	int n;
	cin>>n;
	cout<<foo(n);
	return 0;
}
