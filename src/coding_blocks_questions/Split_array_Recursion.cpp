// Take as input N, a number. Take N more inputs and store that in an array.

// a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

// b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.

// Input Format
// Take as input N, a number. Take N more inputs and store that in an array.

// Constraints
// None

// Output Format
// Display all the groups in a comma separated manner and display the number of ways the array can be split

// Sample Input
// 6
// 1
// 2
// 3
// 3
// 4
// 5
// Sample Output
// 1 2 3 3 and 4 5 
// 1 3 5 and 2 3 4 
// 1 3 5 and 2 3 4 
// 2 3 4 and 1 3 5 
// 2 3 4 and 1 3 5 
// 4 5 and 1 2 3 3 
// 6



#include<bits/stdc++.h>
using namespace std;

void split(long int *arr, int i, vector<long int> &l1, vector<long int> &l2, long int sum, int n, int &cnt){
	if(i == n){
		long sum1 = 0;
		for(int j = 0; j < l1.size(); j++){
			sum1 += l1[j];
		}
		if(sum1 == sum){
			for(int j = 0; j < l1.size(); j++){
				cout<<l1[j]<<" ";
			}
			cout<<"and ";
			for(int j = 0 ; j < l2.size(); j++){
				cout<<l2[j]<<" ";
			}
			cout<<endl;
			cnt++;
		}
		return;
	}
	l1.push_back(arr[i]);
	split(arr, i+1, l1, l2, sum, n, cnt);
	l1.pop_back();
	l2.push_back(arr[i]);
	split(arr, i+1, l1, l2, sum, n, cnt);
	l2.pop_back();
}

int main() {
	int n;
	cin>>n;
	long int arr[n];
	long int sum = 0;
	for(int i=0; i<n; i++){
		cin>>arr[i];
		sum += arr[i];
	}
	if(sum % 2 == 1) {
		cout<<"0";
		return 0;
	}
	vector<long int> l1;
	vector<long int> l2;
	int cnt = 0;
	split(arr , 0 ,l1,l2 ,sum/2 , n, cnt);
	cout<<cnt<<endl;
	return 0;
}
