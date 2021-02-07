#include<iostream>
using namespace std;

right_rotation(int arr[],int d,int n){
	
	int temp = arr[n-1],i;
	for(i=n-1;i>0;i--)
	    arr[i] = arr[i-1];
	arr[i] = temp;
	
}


main(){
	
	int arr[100],n,d;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"Number of rotation reverse : ";
	cin>>d;
	for(int i=0;i<d;i++){
	right_rotation(arr,d,n);
   }
   for(int i=0;i<n;i++)
      cout<<arr[i];
      
}
