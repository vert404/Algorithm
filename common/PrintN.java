/*写程序实现一个函数PrintN，使得
传入一个正整数为N的参数后，能顺序
打印从1到N的全部正整数*/

//解决问题方法的效率，跟数据的组织方式有关
//解决问题方法的效率，跟空间的利用效率有关
//解决问题方法的效率，跟算法的巧妙程度有关


//循环实现
/*public class PrintN {
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++){
            System.out.println(i);
        }
    }
}*/

//递归函数实现
public class PrintN {
    int i=1;
    public static void main(String[] args) {
        PrintN a = new PrintN();
        a.function(10000,1);
    }

    public void function(int N,int i) {
        if (N >= i) {
            System.out.println(i);
            function(N,i+1);
        }
    }
}
