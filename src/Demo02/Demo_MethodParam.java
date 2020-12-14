package Demo02;
/*
有参数：（小括号有内容）
无参数：（小括号无内容）
 */
public class Demo_MethodParam {
    public static void main ( String[] args ) {
        Method01 ( 10,20 );
        System.out.println ("============" );
        Method02 ();
    }

    //两个数字相乘
    //有参数
    public  static  void Method01(int a ,int b){
        int  result = a*b;
        System.out.println ("有结果"+result );
    }

    //例如打印输出固定10次文本字符串
    public  static  void Method02(){
        for (int i = 1; i < 10; i++) {
            System.out.println ( "Hello World"+i);
        }
    }
}
