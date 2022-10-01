#include<bits/stdc++.h>
using namespace std;

map<long long,int>m;

int recurse(unsigned long long a,string str,int i)
{
    if(i==str.size()){   
        if(a==0 || a==1)
        	return 0;
        if(m[a])
        	return 1;
        for(auto temp:m){
            if(a%temp.first==0)
            return 0;
        }
        return 1;
    }
    if(a==1)
        return max(recurse(a*10+(str[i]-'0'),str,i+1),recurse(str[i]-'0',str,i+1));     
    if(a==0)
        return (recurse(str[i]-'0',str,i+1));

    bool flag = 1;
    for(auto temp:m){
        if(a%temp.first==0){
            flag=0;
            break;
        }
    }
    if(m[a])
    	flag=1;
    if(flag)
    	m[a]=1;
    if(flag)
        return max(recurse(a*10+str[i]-'0',str,i+1),recurse(str[i]-'0',str,i+1)+1);
    return max(recurse(a*10+(str[i]-'0'),str,i+1),recurse(str[i]-'0',str,i+1)); 
}
int main() {
    m[2]=1;
    m[3]=1;
    m[5]=1;
    m[7]=1;
    m[11]=1;
    m[13]=1;
    m[17]=1;
    m[19]=1;
    m[23]=1;
    m[29]=1;
    int n;
	cin>>n;
    string str;
	cin>>str;
    unsigned long long a = 0;
    cout<<recurse(a,str,0);
    return 0;
}
