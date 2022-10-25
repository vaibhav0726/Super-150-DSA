#include<bits/stdc++.h>
using namespace std;

long maxScore(int arr[], int l, int h, long tSum) {
	long left = 0, right = tSum;

	for (int i = l; i < h; i ++) {
		left += arr[i];
		right -= arr[i];

		if (left == right)
			return 1 + max(maxScore(arr, l, i + 1, left), maxScore(arr, i + 1, h, right));
	}

	return 0;
}

int main() {
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int arr[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			cin>>arr[i];
			sum += arr[i];
		}
		if (sum == 0)
			cout<<n - 1;
		else
			cout<<maxScore(arr, 0, n, sum)<<endl;
	}
	return 0;
}
