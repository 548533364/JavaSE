package Demo02;

/**
 * 定义一个方法，用来【求出】两个数字之和
 * 【变形】定义一个方法，用来【打印】两个数字之和
 */
public class Demo_Return {
    public static void main ( String[] args ) {
        //我是main方法，我调用你
        //我调用你，你来帮我，算完之后，把结果告诉我的num变量
         int sum = getSum ( 10,40 );
        System.out.println ("返回值是"+sum );

        System.out.println ("+++++++++++++" );
        printSum ( 100,200 );
    }


    //我是一个方法，我负责两个数字相加
    //我有返回值int，谁调用我，我就吧计算结果告诉谁
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责两个数字相加
    //我有返回值int，不会把结果告诉别人，而是自己打印输出
    public  static  void printSum(int a, int b){
        int result = a + b;
        System.out.println ("结果是"+ result );
    }
}
