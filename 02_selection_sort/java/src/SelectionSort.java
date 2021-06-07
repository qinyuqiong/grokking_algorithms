import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 选择排序
 */
public class SelectionSort {

    /**
     * 选择排序算法
     * @param arr
     * @return
     */
    private static List<Integer> selectionSort(List<Integer> arr) {
        //构建一个新数组，和原数组大小相同
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        //循环
        for (int i = 0; i < size; i++) {
            //获取最小值的坐标
            int smallest = findSmallest(arr);
            //将元素添加到新的数组中
            newArr.add(arr.get(smallest));
            //并在旧的的数组中删除坐标对应的值
            arr.remove(smallest);
        }

        return newArr;
    }

    /**
     * 找到最小，并返回他的坐标
     * @param arr
     * @return
     */
    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void main(String[] args) {
        //构建list集合
        //List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        List<Integer> arr = Arrays.asList(5, 3, 6, 2, 10);
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }
}