import java.util.Arrays;

/**
 * 插入排序
 *
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一个位置
 * 重复步骤三，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到改位置后
 * 重复步骤2~5
 */
public class InsertionSort {

    public static int[] mySort(int[] source){
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 1;i < arr.length;i++){
            int index = 0;
            for (int j = i;0 < j;j--){
                if (source[j-1] > source[i]){
                    arr[j] = arr[j-1];
                }
                index = j;
            }
            arr[index-1] = source[i];
        }
        return arr;
    }

    public static int[] sort(int[] source){
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 1;i < arr.length;i++){
            int preIndex = i - 1;
            int currentVal = arr[i];
            while (preIndex >= 0 && arr[preIndex] > currentVal){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = currentVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1};
        int[] sort = sort(a);
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
