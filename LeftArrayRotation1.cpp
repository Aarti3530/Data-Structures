#include<iostream>
using namespace std;
main(){
	int arr[100],n,d,i,k;
	cout<<"Enter number of elements: ";
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"Enter the number of element want to left shift : ";
	cin>>d;
	int arr1[d];
	int arr2[n-d];
	for(i=0;i<d;i++){
		arr1[i] = arr[i];
	}
    for(int j = d,i=0;j<n-d;j++,i++){
    	arr2[i] = arr[j];
	}
	k=i;
	for(int j=0;j<k;j++){
		arr[j] = arr2[j];
	}
	for(int j=0;j<d;j++){
		arr[k] = arr1[j];
		k++;
	}
	for(int i=0;i<n;i++){
		cout<<arr[i];
	}
}
