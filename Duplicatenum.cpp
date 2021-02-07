#include<iostream>
using namespace std;
int main(){
	int arr[10],n,count,flag;
	cin>>n;
	for(int i =1 ; i<=n ; i++){
		cin>>arr[i];
	}
	for(int i = 1;i<=n;i++){
		for(int j = i+1;j<=n;j++){
			if(arr[i] == arr[j]){
				cout<<"Duplicate number is "<<arr[i]<<endl;
				break;
			}
			else {
				continue;
			}
		}
	}
}
