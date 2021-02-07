#include<iostream>
using namespace std;
main(){
	int arr[10],n,temp[10];
	cin>>n;
	for(int i=0;i<n;i++)
	  cin>>arr[i];
	for(int i=0;i<n;i++){
	    int	j = arr[i];
		temp[j] = i;
	}
	for(int i=0;i<n;i++)
	  arr[i] = temp[i];
	
	for(int i=0;i<n;i++)
	  cout<<arr[i];
	  
}
