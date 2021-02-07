#include<iostream>
using namespace std;
main(){
	int l;
	cin>>l;
	for(int i = l;i>=1;i--){
		for(int j =1;j<=i;j++){
			cout<<" * ";
		}
		cout<<endl;
	}
}
