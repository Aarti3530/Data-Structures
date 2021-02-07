#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int arr[100],n;
	cout<<"Enter the number of element you want in array: ";
	cin>>n;
	cout<<"Now enter elements : "<<endl;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<"Before sort : "<<endl;
	for(int i=0;i<n;i++){
		cout<<arr[i];
		cout<<endl;
	}
	sort(arr,arr+n);
	/*
	This function internally uses IntroSort. In more details it is implemented using hybrid of QuickSort,
	HeapSort and InsertionSort.By default, it uses QuickSort but if QuickSort is doing unfair partitioning
	and taking more than N*logN time, it switches to HeapSort and when the array size
	becomes really small, it switches to InsertionSort. */
	
	cout<<"After sort : "<<endl;
	for(int i=0;i<n;i++){
		cout<<arr[i];
		cout<<endl;
	}
	return 0;
}
