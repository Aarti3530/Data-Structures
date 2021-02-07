#include<iostream>
using namespace std;
main(){
	int arr[10],n,res;
	cin>>n;
	res = ((n+1)*(n+2))/2;
	for(int i = 1; i<=n ;i++){
	cin>>arr[i];
	res-=arr[i];	
	}
	cout<<"Missing number is "<<res;
}
