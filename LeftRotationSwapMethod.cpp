#include<iostream>
using namespace std;

void reverseArray(int arr[],int start,int end){
    int temp;
    while(start<end){
       temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       start++;
       end++;
    }
}


 void leftRotate(int arr[], int n, int d) {
        // code here
        if(d == 0)
            return;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
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
	leftRotate(arr,d,n);
	printArray(arr,n);
	return 0;
}
