#include<iostream>
#include<algorithm>
using namespace std;

reorder(int arr[],int index[],int n){
	int temp[n];
	for(int i=0;i<n;i++)
	  temp[index[i]] = arr[i];
	
	for(int i=0;i<n;i++)
	  arr[i] = temp[i];
	
	sort(index,index+n);
}


main(){
	int arr[100],n,index[100];
	cin>>n;
	for(int i=0;i<n;i++)
	  cin>>arr[i];
	  
	for(int i=0;i<n;i++)
	  cin>>index[i];
	  
	reorder(arr,index,n);
	
	for(int i=0;i<n;i++)
	  cout<<arr[i]<<" ";
	  
	cout<<endl;
	
	for(int i=0;i<n;i++)
	  cout<<index[i]<<" ";
}
