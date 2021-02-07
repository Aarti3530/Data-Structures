#include<iostream>
using namespace std;
int main(){
	int arr[10],n;
	cin>>n;
	for(int i =1 ; i<=n ; i++){
		cin>>arr[i];
	}
	for(int i = 1;i<=n;i++){
		for(int j = i+1;j<=n;j++){
			if(arr[i] == arr[j]){
				for(int k=j;k<=n;k++){
					arr[k] = arr[k+1];
				}
				n--; 
			}
			else {
				continue;
			}
		}
	}
	for(int i =1 ; i<=n ; i++){
		cout<<arr[i]<<endl;
	}
}
