public class a1_RotateArrayRight {
    public static void rotateArrBy1(int arr[], int n){
        int i, temp;
        temp=arr[n-1];
        for(i=n-1; i>0; i--)
            arr[i]=arr[i-1];
            arr[0]=temp;
    }
    public static void rotateRight(int arr[], int d, int n){
        for(int i=0; i<d; i++){
            rotateArrBy1(arr, n);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 12, -9, 45, 23, -99, 67, 98, 90, 11, 45};   
        int n=arr.length;
        int r=1;
        System.out.println("Array before Rotation");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after Rotation");
        rotateRight(arr, r, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
