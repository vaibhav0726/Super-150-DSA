#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
	cin>>s;
	int ans = 0;
	int n =s.length();
	for(int i=0; i<n; i++){
		int left = i, right = i;
		while(left >=0 && right < n && s[left] == s[right]){
			ans++;
			left--;
			right++;
		}
		left = i;
		right = i+1;
		while(left >=0 && right < n && s[left] == s[right]){
			ans++;
			left--;
			right++;
		}
	}
	cout<<ans;
    return 0;
}
