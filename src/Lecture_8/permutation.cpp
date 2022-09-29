/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <bits/stdc++.h>
using namespace std;


// to print permutations of abc
void permutation(string ques, string ans){
    if(ques.length() == 0){
        cout<<ans<<endl;
        return;
    }
    char ch = ques[0];
    permutation(ques.substr(1), ans);
    permutation(ques.substr(1), ans+ch);
}

// to print permutations of no of times coin is tossed
void permutation2(int n, string ans){
    if(n==0){
        cout<<ans<<endl;
        return;
    }
    if(ans[ans.length()-1]!='H')
        permutation2(n-1, ans+"H");
    permutation2(n-1, ans+"T");
}

int main()
{
    // string s = "abc";
    int n = 3;
    permutation2(n, "");
    // permutation(s, "");
    return 0;
}