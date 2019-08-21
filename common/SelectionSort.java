/*选择排序算法的伪码描述
void SelectionSort ( int List[], int N )
{ /* 将N个整数List[0]...List[N-1]进行非递减排序
    for ( i = 0; i < N; i ++ ) {
        MinPosition = ScanForMin( List, i, N–1 );
        /* 从List[i]到List[N–1]中找最小元，并将其位置赋给MinPosition
        Swap( List[i], List[MinPosition] );
        /* 将未排序部分的最小元换到有序部分的最后位置
    }
}
    抽象
    List到底是数组还是链表（虽然看上去很像数组）？
    Swap用函数还是用宏去实现？
*/

//选择排序

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
            if (min != i) {
                temp = a[min];//将最小元素放到已排序序列的末尾
                a[min] = a[i];
                a[i] = temp;
                //最小赋值temp之后，把最小的改变成非最小数，将最小数放到序列的末尾a[i]
            }
        }
    }
}