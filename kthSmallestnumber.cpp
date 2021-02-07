#include<iostream>
#include<algorithm>
using namespace std;
int main(){
	int n,k;
	cin>>n;
	int arr[n];
	cout<<endl;
	for(int i=0;i<n;i++)
	   cin>>arr[i];
	   
	sort(arr,arr+n);
	   
	cout<<"Enter the kth smallest number you want : ";
	cin>>k;
	
	cout<<arr[k-1];
	return 0;
}
