#include<iostream>
using namespace std;

void leftRotate(int arr[],int d,int n){
	int a = arr[0],i;
	for(i=0;i<n-1;i++){
		arr[i] = arr[i+1];
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
	cout<<"Enter the number of element want to left shift : ";
	cin>>d;
	for(int i=0;i<d;i++){
		leftRotate(arr,d,n);
	}
	printArray(arr,n);
}

