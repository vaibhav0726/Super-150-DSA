#include <bits/stdc++.h>
using namespace std;

int numSubarrayProductLessThanK(vector<int>& nums, int k) {
    if(k <= 1) return 0;
    int right = 0, left = 0;
    int prod = 1, ans = 0;
    int n = nums.size();
    while(right < n){
        prod = prod * nums[right];
        while(prod >= k){
            prod = prod / nums[left];
            left++;
        }
        ans += right - left + 1;
        right++;
    }
    return ans;        
}

int main() {
    int n, k;
    cin>>n>>k;
    vector<int> v;
    int a;
    // for(int i=0; i<n; i++){
    //     cin>>a;
    //     cin>>v.push_back(a);
    // }
    while (cin >> a)
    v.push_back(a);
    cout<<numSubarrayProductLessThanK(v, k);
}
