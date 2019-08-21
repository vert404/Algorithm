/*
选择排序
算法原理：第i次排序（1≤ i ≤n-1），从待排序的n-i+1个记录中， 进行n-i次关键字比较，从n-i+1个记录中选出最小的，并和第i-1个记录进行交换。
其实就是每一趟排序将当前未排序序列中的最小的记录与未排序序列的最前端的位置进行交换。
    时间复杂度：
对于比较次数而言，无论最好最差情况，其比较次数都是一样的：第i趟排序需要进行n-i次比较，此时比较次数=(n-1)+(n-2)+...+1 = n*(n-1)/2；
对于交换次数而言，其最好情况为顺序表，交换次数为0次；最差情况为逆序表，交换次数为n-1次，那么平均情况则为(n-1)/2次交换；
由于时间复杂度取决于比较次数和交换次数总和，故而交换排序的时间复杂度为O(n^2)。
因为相较于冒泡排序，选择排序的交换次数要少，所以选择排序的性能要优于冒泡排序。
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 3, 7, 6, 1, 0};
        SelectionSort s = new SelectionSort();
        System.out.println("排序前：");
        for (int num : a) {
            System.out.print(num+" ");
        }
        System.out.println();
        s.sort(a);
        System.out.println("排序后：");
        for (int num : a){
            System.out.print(num+" ");
        }

    }

    private void sort(int[] a) {
        int min,temp,len = a.length;
        for (int i=0;i<len-1;i++){
            min=i;//未排序序列中最小数据数组下标
            for (int j=i+1;j<len-1;j++){//在未排序元素中继续寻找最小元素，并保存其下标
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {//在i之后的数据中找到了最小值,将最小元素放到已排序序列的末尾a[0]->a[1]->
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }
}