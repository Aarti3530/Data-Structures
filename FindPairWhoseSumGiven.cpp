#include<iostream>
using namespace std;
main(){
	int arr[20],sum,n;
	cin>>n;
	cout<<endl;
	for(int i =1;i<=n;i++){
		cin>>arr[i];
	}
	
	cout<<"Enter sum ";
	cin>>sum;
	
	for(int i =1;i<=n;i++){
		for(int j=i+1;j<=n;j++){
			if((arr[i]+arr[j]) == sum){
				cout<<"Pair is ("<<arr[i]<<","<<arr[j]<<")."<<endl;
			}
			else{
				continue;
			}
		}
	}
}
