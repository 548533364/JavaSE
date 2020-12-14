package Demo04;

/*
方法重载Overload
        多个方法的名称相同，参数列表不同
  好处：只需要记住一个方法名，就可以实现类似的多个功能
方法重载与下列因素有关：
        1、参数个数不同
        2、参数类型不同
        3、参数的多类型的顺序不同
与下列因素无关：
        1、与参数的名称无关
        2、与参数的返回值类型无关
 */
public class Demo_Overload {
    public static void main ( String[] args ) {
        System.out.println (sum ( 10,10 ) );
        System.out.println (sum ( 10,10,10 ) );
        System.out.println (sum ( 10,10,10,10 ) );

        // System.out.println (sumThree ( 10,10,10 ) );
        // System.out.println (sumFour ( 10,10,10,10 ) );
    }
    public static  int sum(int a, int b){
        System.out.println ("有2个参数" );
        return a +b;
    }
    public static  int sum(int a, int b,int c){
        System.out.println ("有3个参数" );
        return a +b+c;
    }
    public static  int sum(double a,double b){
        return (int)(a +b );
    }
    public static  int sum(int a, int b,int c,int d){
        System.out.println ("有4个参数" );
        return a +b+c+d;
    }

    public  static int sum (int  a ,double b){
        return (int) (a+   b);
    }
}
