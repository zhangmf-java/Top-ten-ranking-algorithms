import java.util.Arrays;

public class SelectionSort {

    public static int[] mySort(int[] source){
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 0;i < arr.length-1;i++){
            int minIndex = i;
            for (int j = i + 1;j < arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] a = {2,1};
        int[] sort = mySort(a);
        StringBuilder sbFir = new StringBuilder();
        StringBuilder sbSec = new StringBuilder();
        sbFir.append("排序前：");
        sbSec.append("排序后：");
        for (int i = 0;i <sort.length;i++){
            sbFir.append(a[i]+" ");
        }
        for (int i = 0;i <sort.length;i++){
            sbSec.append(sort[i]+" ");
        }
        System.out.println(sbFir);
        System.out.println(sbSec);
    }
}
