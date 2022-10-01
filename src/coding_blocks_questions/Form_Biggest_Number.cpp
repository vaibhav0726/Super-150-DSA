#include<bits/stdc++.h>
using namespace std;

bool comparator(string one,string two)
{
    string str1 = one + two, str2 = two + one;
    int i=0;
    while(str1[i] && str2[i])
    {
        if(str1[i]>str2[i])
            return true;
        else if(str1[i] < str2[i])
            return false;
        ++i;
    }
    return false;
}

int main() {
	int t;
	cin>>t;
	while(t--){
	   int len;
	   cin>>len;
	   vector<string> v;
	   int i;
	   string temp;
	   for(i=0;i<len;++i)
	   {
	       cin>>temp;
	       v.push_back(temp);
	   }
	   sort(v.begin(),v.end(),comparator);
	   for(i=0;i<len;++i) cout<<v[i];
	   cout<<endl;
	}
	return 0;
}
