package method;


public class insertion {
    public static void main(String[] args) {
        int[] arr = {13, 16, 10, 11, 4, 12, 6, 7};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int k=i;
            for(int j=i-1;j>=0;j++){
                if(arr[j]>arr[k]){
                    int t=arr[k];
                    arr[k]=arr[j];
                    arr [j]=t;
                    k=j;
                }


            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
}
