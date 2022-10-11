#include<bits/stdc++.h>
using namespace std;

int f(int *arr, int i, int M, int n){
	if(i < 0) return -1;
	if(arr[i] == M){
		return i;
	}
	return f(arr, i-1, M, n);
}

int main() {
	int n;
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}
	int M;
	cin>>M;
	cout<<f(arr, n-1, M, n);
	return 0;
}
