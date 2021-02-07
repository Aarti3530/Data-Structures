#include<iostream>
using namespace std;

void rightRotate(int arr[],int d,int n){
	int a = arr[n-1],i;
	for(i=n-1;i>0;i--){
		arr[i] = arr[i-1];
	}
	arr[i] = a;
}

void printArray(int arr[],int n){
	for(int i=0;i<n;i++){
		cout<<arr[i]<<endl;
	}
}

main(){
	int arr[100],n,d;
	cout<<"Enter number of elements: ";
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"Enter the number of element want to right shift : ";
	cin>>d;
	for(int i=0;i<d;i++){
		rightRotate(arr,d,n);
	}
	printArray(arr,n);
}
