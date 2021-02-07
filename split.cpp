#include<iostream>
using namespace std;

/*

weare doing nothing but left shift using split trick.

*/

split(int arr[],int n,int p){
	int brr[p],p1,p2=0;
	for(int i=0;i<p;i++)
	   brr[i] = arr[i];
	   
	p1=p;

	for(int i=0;p1<n;i++){
	   arr[i] = arr[p1++];
	   p2++;
    }
    for(int i=0;i<p;i++)
       arr[p2++] = brr[i];
}

int main(){
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	  cin>>arr[i];
	int d;
	cout<<"Enter the position of split : ";
	cin>>d;
	split(arr,n,d);
	for(int i=0;i<n;i++)
	  cout<<arr[i]<<" ";
}
