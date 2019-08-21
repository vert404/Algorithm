import java.util.Arrays;

/**
 * @author vert  @date 2019/8/21 22:04
 */

/*
冒泡排序是一种交换排序，它的基本思想是：两两比较相邻记录的关键字，如果反序则交换，直至没有反序的记录为止。
待排序的数组是 {8, 1, 5, 9, 3, 7, 4, 6, 2}
第一趟排序将当前序列最小值2移动至未排序的序列最前面的位置。
第2趟排序： 因为第一趟已经排好一个最小的位置，所以只需要对剩下的{8, 2, 5, 9, 3, 7, 4, 6}再进行冒泡排序
直至排序完毕

当待排序数组为{1, 3, 4, 5, 6, 7, 8, 9, 2}时：
第1趟排序的结果为： 1 2 3 4 5 6 7 8 9
此时其实序列已经完成，但是根据上述代码仍得继续遍历，直至第9趟排序。这显然是不合理的，
如果我们能在代码中加入一个flag标记上一趟排序中是否进行过交换，如果进行过未进行交换，说明当前数组已经有序。

时间复杂度：
最好情况： 排序表本身是顺序的，根据优化后的代码，则只需要进行n-1次比较，故时间复杂度为O(n)；
最差情况： 排序表本身是逆序的，则比较次数为 1+2+...+(n-1) = n*(n-1)/2 , 并做等数量级的移动操作；
平均情况： 时间复杂度为 O(n^2)
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] a = {8, 1, 5, 9, 3, 7, 4, 6, 2};
        int[] a = {1, 3, 4, 5, 6, 7, 8, 9, 2};
        BubbleSort b = new BubbleSort();
        b.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private void sort(int[] a){
        int len = a.length;
        boolean flag = true;//标记是否进行过交换，如果已排好序，flag=false，则下一次不会进入第一层循环，直接结束
        for (int i=0;i<len-1 && flag;i++){
            flag = false;
            for (int j=len-1;j>i;j--){//这里j要取数组里最后一个（下标最大）开始进行比较，比较len-1-i次
                if (a[j]<a[j-1]){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    flag = true;
                }
            }
        }
    }
}
