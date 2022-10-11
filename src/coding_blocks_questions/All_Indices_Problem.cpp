#include<bits/stdc++.h>
using namespace std;

void f(int *arr, int i, int M, int n, vector<int> &v){
	if(i >= n) return;
	if(arr[i] == M)
		v.push_back(i);
	f(arr, i+1, M, n, v);
}

int main() {
	int n;
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
		cin>>arr[i];
	}
	vector<int> v;
	int M;
	cin>>M;
	f(arr, 0, M, n, v);
	for(int i=0; i<v.size(); i++){
		cout<<v[i]<<" ";
	}
	return 0;
}
