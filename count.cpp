#include<iostream>
using namespace std;
main(){
	int n,arr[10],p=100;
	cin>>n;
	cout<<endl;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n-1;i++){
	    if(arr[i]>arr[i+1]){
	    	p=i+1;
		}
		
	}
	cout<<"Count is: "<<p;
}
