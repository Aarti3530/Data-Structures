#include<iostream>
using namespace std;
int main(){
	int arr[20],n,item;
	cin>>n;
	for(int i = 1;i<=n;i++){
		cin>>arr[i];
	}
	item = arr[1];
	for(int i = 2;i<=n;i++){
		if(arr[i] > item )
		{
			item = arr[i];
		}
	}
	cout<<"Largest num is "<<item;
}
