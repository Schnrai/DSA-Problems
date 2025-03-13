import java.util.Scanner;

public class countDuplicate_array {
    public static void main(String[] args) {
        int []arr={1,1,22,1,6,4,5,8,2,2,4,3,2,4,5,2,2,1,2,3,2};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to see duplicates: ");
        int target=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if(target==arr[i]){
                count++;
            }

        }
        System.out.printf("Duplicates of %d: "+count,target);
        System.out.println();
        System.out.print (arr[arr.length-1]+" ");
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print (arr[i] +" ");
        }

    }

}
