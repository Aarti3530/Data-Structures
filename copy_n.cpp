#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int arr[10] = {1,3,5,7,9,2,4,6,8,0};
	int arr1[10];
	copy_n(arr , 10 , arr1);
	
	/*
	copy_n() copies one array elements to new array. This type of copy creates a deep copy of array. 
	This function takes 3 arguments, source array name, size of array and the target array name
	*/
	
	for(int i=0;i<10;i++)
	    cout<<arr1[i];
	    
	return 0;
}
