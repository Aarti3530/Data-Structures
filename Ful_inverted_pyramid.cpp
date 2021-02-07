#include<iostream>
using namespace std;
main(){
	int l,k;
	cin>>l;
	for(int i = 1;i<=l;i++){
		for(int j =1;j<=(2*l-1);j++){
			if(j>=l-(l-i) && j<=l+(l-i)){
				cout<<"*";
			}
			else{
				cout<<" ";
			}
		}
		cout<<endl;
	}
}
