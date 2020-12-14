package Demo03;

/**
 * 定义一个方法，1 - 100的和
 */
public class Demo_MethodSum {
    public static void main ( String[] args ) {
        System.out.println (getSum () );
    }
    /*
    三要素
    返回值；int
    方法名；getSum
    参数列表；
     */
    public  static  int getSum(){
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum +=i;
        }
        return  sum;
    }
}
