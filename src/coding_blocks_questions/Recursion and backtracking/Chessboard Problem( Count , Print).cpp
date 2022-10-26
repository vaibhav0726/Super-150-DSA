#include<bits/stdc++.h>
using namespace std;

void chessBoard(int n, int row, int col, string ans, int &count)
{
	if(row == n-1 && col == n-1)
	{
		cout<<ans<<" ";
		count++;
		return;
	}
	if(col >= n || row >= n)
	{
		return;
	}

	chessBoard(n, row+2, col+1, ans+"K{"+to_string(row+2)+"-"+to_string(col+1)+"}", count);
	chessBoard(n, row+1, col+2, ans+"K{"+to_string(row+1)+"-"+to_string(col+2)+"}", count);
	if(row == 0 || row == n-1 || col == 0 || col == n-1)
	{
		for(int i=1; i<n; i++)
		{
			chessBoard(n, row, col+i, ans+"R{"+to_string(row)+"-"+to_string(col+i)+"}", count);
		}
		for(int i=1; i<n; i++)
		{
			chessBoard(n, row+i, col, ans+"R{"+to_string(row+i)+"-"+to_string(col)+"}", count);
		}
	}
	if(row == col || row+col == n-1)
	{
		for(int i=1; i<n; i++)
		{
			chessBoard(n, row+i, col+i, ans+"B{"+to_string(row+i)+"-"+to_string(col+i)+"}", count);
		}
	}
}

int main() {
	int n;
	cin>>n;
	int count = 0;
	string output = "{"+to_string(0)+"-"+to_string(0)+"}"; 
	chessBoard(n, 0, 0, output, count);
	cout<<endl<<count;
	return 0;
}
