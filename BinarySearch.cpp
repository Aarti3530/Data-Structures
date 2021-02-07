#include<iostream>
using namespace std;
int main(){
	int arr[20],n,item,loc=-1,lb,ub,mid;
	cin>>n;
	lb = 1;
	ub = n;
	for(int i = 1;i<=n;i++){
		cin>>arr[i];
	}
	mid = (lb+ub)/2;
	cout<<"Enter element to search :";
	cin>>item;
	while(lb<=ub && arr[mid]!=item){
		if(arr[mid] == item){
		loc = mid;
		break;
		
	}
	else{
	if(arr[mid] > item)
	      ub = mid - 1;
	else
	      lb = mid +1;	
	}
}
	if(loc == -1)
	     cout<<"Element not found";
	else
	    cout<<"Element found at : "<<loc<<" position";
    
}
