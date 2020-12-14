package Demo03;
/*
使用方法注意事项
    1、方法应该定义在类当中， 但是不能咋i方法当中再定义，不能嵌套
    2、方法定义前后顺序无所谓
    3、方法定义之后不会执行，如果希望执行。一定要调用，单独调用，打印调用，赋值调用
    4、如果方法有返回值，必须写上return【返回值】
    5、return后面的返回值类型必须和方法的返回值类型对应
    6、对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
    7、对于方法当中最后一行的return可以省略
    8、一个方法中可以有多个return语句，但是必须保证同时只有一个会执行到
 */
public class Demo_MethodNotice {
    public  static  int method1(){
        return 10;
    }
    public static  void method02(){
        return;     //没有返回值，只是结束方法的运行
    }

    public  static  void  method03(){
        System.out.println ("AAA" );
        System.out.println ("BBB" );
        //return     最后一行可以省略不写
    }

    public static int setMax(int a, int  b) {
        //     int max;
        //     if (a > b){
        //         max = a ;
        //     }else {
        //         max= b;
        //     }
        // return max；
        // }
        if (a > b) {
            return a;
        }else {
            return b;
        }
    }
}
