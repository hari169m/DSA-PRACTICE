//Day-1
class ReverseArray {
        static void reverse( int a[],int n){
            int b[]= new int[n];
            int j=n;
            for (int i=0;i<n;i++){
                b[j-1]=a[i];
                j--;
            }
            for (int k=0;k<n;k++){
                System.out.print(b[k]+" ");
            }
            
        }
        public static void main(String[] args){
            int[] arr={10,20,30,40,50};
            reverse(arr,arr.length);
        }
        
    
}
