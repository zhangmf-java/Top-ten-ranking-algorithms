import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static int[] mySort(int[] source){
        int[] arr = Arrays.copyOf(source, source.length);

        for (int i = arr.length-2;i >= 0;i--){
            for (int j = 0;j <= i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }

    public static int[] standardSort(int[] source){
        int[] arr = Arrays.copyOf(source, source.length);

        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0;j < arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1};
        int[] sort = standardSort(a);
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
