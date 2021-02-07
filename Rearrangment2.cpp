#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 




void rearrange(int arr[], int n) {
	    // code here
	    sort(arr,arr+n);
	    for(int start =0,end = n-1;start<end;){
	        int temp;
	        if(arr[start]<0){
	            temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start+=2;
	            end++;
	        }
	    }
	    
	}
	
	int main() 
{ 
    int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 }; 
    int size = sizeof(arr) / sizeof(arr[0]); 
    rearrange(arr, size); 
    for(int i=0;i<size;i++)
       cout<<arr[i];
    return 0; 
} 
	

