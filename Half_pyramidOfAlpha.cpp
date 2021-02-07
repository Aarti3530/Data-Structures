#include<iostream>
using namespace std;
main(){
	char ch,alph = 'A';
	cout<<"Enter the last alphabet : ";
	cin>>ch;
		for(int i = 1;i<=(ch-'A'+1);i++){
		for(int j=1;j<=i;j++){
			cout<<" "<<alph<<" ";
		}
		alph++;
		cout<<endl;
	}
}

