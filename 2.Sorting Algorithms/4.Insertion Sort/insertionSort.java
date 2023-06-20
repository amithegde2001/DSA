import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={6,1,11,8,7,5};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static  int[] insertionSort(int[] arr)
    {

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int f,int s)
    {
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
