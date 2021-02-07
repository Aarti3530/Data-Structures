#include<iostream>
using namespace std;

void leftRotate(int arr[],int n){
	int a = arr[0],i;
	for(i=0;i<n-1;i++){
		arr[i] = arr[i+1];
	}
	arr[i] = a;
}

int sumCal(int arr[],int n){
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum = sum + i*arr[i];
	}
	return sum;
} 


main(){
	int arr[10],n,count=0,sum,largest;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	largest = sumCal(arr,n);
	leftRotate(arr,n);
	count++;
	sum = sumCal(arr,n);
	for(int i = 1;i<n;i++){
		if(sum > largest){
			largest = sum;
		}
		else{
		leftRotate(arr,n);
	    count++;
		sum = sumCal(arr ,n);	
		}
	}
	cout<<"Output : "<<largest<<endl;
	cout<<"We can get "<<largest<<" by rotating array "<<count<<" times.";
	
}
