#include<iostream>
using namespace std;
int main(){
	int arr[20],n,item,loc=-1;
	cin>>n;
	for(int i = 1;i<=n;i++){
		cin>>arr[i];
	}
	cout<<"Enter element to search :";
	cin>>item;
	for(int i = 1;i<=n;i++){
		if(arr[i] == item)
		     {
		     	loc = i;
		     	break;
			 }
	}
	if(loc >= 0){
		cout<<"Element found at "<<loc<<" Location";
	}
	else{
		cout<<"Element not found :(";
	}
}
