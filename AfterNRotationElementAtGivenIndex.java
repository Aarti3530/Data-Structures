import java.util.*;

class Main{
    
    // Rotate funtion for Right Rotation
    public static void rotate(int [] arr,int r , int l){    
        int i = l;
        int f=arr[l];
        for(;i>=r;i--){
            if(i-1>=r)
            arr[i] = arr[i-1];
        }
        arr[r] = f;
    }
    
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();                // Enter size of Array.
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();   // Enter array elements
        
        int [][] range = new int [2][2];  // range upto 0-2
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                range[i][j] = sc.nextInt();   // give range1 like (0-n) and range2 like (0-n)
            }
        }
        
        int index = sc.nextInt();
        rotate(arr,range[0][0],range[0][1]);  
        rotate(arr,range[1][0],range[1][1]);  
        
        for(int i=0;i<n;i++){
            if(i==index)
            System.out.println(arr[i]);
        }
    }
}

// https://www.geeksforgeeks.org/find-element-given-index-number-rotations/
