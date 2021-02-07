#include<iostream>
using namespace std;
main(){
	int l,k;
	cin>>l;
	for(int i = 1,k=1;i<=l;i++){
		for(int j = 1;j<=(2*l-1);j++){
			if(j>=(l-i+1) && j<=(l+i-1)){
				cout<<k;
			    if(j<=l){
			    	k++;
				}
				else{
					k--;
				}
			}
			else{
				cout<<" ";
			}
		}
		cout<<endl;
	}
}
