#include<iostream>
#include<algorithm>
using namespace std;
main(){
	int arr[100],n,item;
	cin>>n;
	for(int i=0;i<n;i++)
	    cin>>arr[i];
	cout<<"Enter element to search : ";
	cin>>item;
	sort(arr,arr+n);
    if(binary_search(arr,arr+n,item))
           cout<<"Element found.";
    /*
    Binary search is a widely used searching algorithm that requires the array to be sorted before search is applied.
	The main idea behind this algorithm is to keep dividing the array in half (divide and conquer) until the 
	element is found, or all the elements are exhausted.
	*/

    else
           cout<<"Not found.";
    return 0;
}
