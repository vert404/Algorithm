import java.util.Arrays;

/**
 * @author vert  @date 2019/8/22 13:52
 */
/*
插入排序
插入排序是插入类的排序算法，基本原理：将一个记录插入到已经排好序的有序表中，
从而得到一个新的记录数增加1的有序表。
具体算法：
整个序列分为两部分，左边部分为已排序的子序列，右边部分为未排序的子序列，取出第1个未排序元素存放在临时变量tmp中，
在已经排序的元素序列中从后往前遍历，逐一比较，如果遍历到的元素大于tmp，则将该元素替换下一个位置的元素，
直至遍历到的元素小于或等于tmp为止。相当于将未排序的第一个元素插入到已排序的数组中，故以插入排序为名。
复杂度为O(n^2)
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {1, 6, 2, 0, 9, 7, 5};//第三趟排序开始{1,2,6,0,9,7,5},i=3,a[i]=0,a[j]=6
        InsertSort I = new InsertSort();
        I.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public void sort(int[] a) {
        int len = a.length;
        int i, j;
        for (i = 1; i < len; i++) {
            if (a[i] < a[i - 1]) {
                int tmp = a[i];//记录当前要排序的元素a[i]
                for (j = i - 1; j >= 0 && tmp < a[j]; j--) {//j要选取数标大的，数标小的已排好序
                    a[j + 1] = a[j];//如果要排序的a[i]<a[j],就将记录往前移一位，逐一比较,不满足终止循环
                }
                a[j + 1] = tmp;//循环之后j--,要将值赋给a[j+1]
            }
        }
    }
}

