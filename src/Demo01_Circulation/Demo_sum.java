package Demo01_Circulation;
/**求和1-100之间偶数
 * 判断偶数 num%2==0
 * 需要一个变量，用来累加操作
 * **/
public class Demo_sum {
    public static void main ( String[] args ) {
        int sum = 0;//用来累加的操作
        for (int i=1;i<=100;i++){
            if (i % 2==0){//如果是偶数
                sum+= i;
            }
            System.out.println ("结果是"+sum );
        }
    }
}
