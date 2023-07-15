import java.util.Scanner;

public class SubArrays {
    static void returnRange(int arr[],int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        returnRange(arr,start,end);
    }
}
