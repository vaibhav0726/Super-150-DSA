#include<bits/stdc++.h>
using namespace std;

bool isitPossible(vector<string> &board, int &row, int &col){
	int r = row; 
	int c = col;
	// vertical up
	while(r>=0){
		if(board[r][c] == 'q')
			return false;
		r--;
	}
	// diagonally right
	r = row;
	c = col;
	while(r>=0 && c<board.size()){
		if(board[r][c] == 'q')
			return false;
		r--;
		c++;
	}

	// diagonally left
	r = row;
	c = col;
	while(r>=0 && c>=0){
		if(board[r][c] == 'q')
			return false;
		r--;
		c--;
	}
	return true;
}

void solve(vector<string> &board, vector<string> &ans, int cr, int &n, int tq, string output, int &count){
	if(tq == 0){
		count++;
		ans.push_back(output);
		return;
	}
	for(int col=0; col<board.size(); col++){
		if(isitPossible(board, cr, col)){
			board[cr][col] = 'q';			
			string temp = "{" + to_string(n-tq+1) + "-" + to_string(col+1) + "} ";
			solve(board, ans, cr+1, n, tq-1, output+temp, count);
			board[cr][col] = '.';
		}
	}
}

int main() {
	int n;
	cin>>n;
	vector<string> ans;
	vector<string> board(n, string(n, '.'));
	int count = 0;
	solve(board, ans, 0, n, n, "", count);
	for(int i=0; i<ans.size(); i++){
		cout<<ans[i]<<" ";
	}
	cout<<endl<<count;
	return 0;
}
