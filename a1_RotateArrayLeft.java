class a1_RotateArrayLeft{
    public static void rotateLeft(int arr[], int d, int n){
        for(int i=0; i<d; i++)
        rotateArrBy1(arr, n);
    }
    public static void rotateArrBy1(int arr[], int n){
        int i, temp;
        temp=arr[0];
        for(i=0; i<n-1; i++)
            arr[i]=arr[i+1];
            arr[i]=temp;
        
    }
    
    public static void main(String[] args) {
        int arr[]={11, 22, 33, 44, 55, 66, 77};
        int n=arr.length;
        int r=1;
        System.out.println("Array before Rotation");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after Rotation");
        rotateLeft(arr, r, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}