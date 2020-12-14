package Demo02;

/**
 * 方法就是若干于语句的功能集合
 * 方法好比是工厂
 *      蒙牛工厂            原料，奶牛，饲料，水
 *                                     产出物，奶制品
 *          参数： （原料）进入方法的数据
 *          返回值：（产出物）方法出来的数据
 *  方法定义格式
 *               修饰符     返回值类型    方法名称（参数类型   参数名称）{
 *                   方法体
 *                 return  返回值；
 *               }
 *      修饰符：目前 public static
 *      方法名称：方法的名字，（小驼峰）
 *      参数类型：进入方法的数据是什么类型
 *      参数名称：进入的方法数据对应的变量名称
 *
 *      参数有多个，用逗号分隔
 *
 *      注意：return后面的“返回值”，必须和方法名称的前面的“返回值”类型相互对应
 *
 * 方法的是调用格式
 *         1、单独调用       方法名称（参数）；
 *         2、打印调用
 *         3、赋值调用
 *
 * 注意：void只能单独调用，不能进行打印调用或者赋值调用
 */

//定义一个int数字相加的方法
public class Demo_Define {
    public static void main ( String[] args ) {
        sum ( 10,20 );
        System.out.println ("=========" );

        //打印调用
        System.out.println (sum ( 10,34 ) );
        System.out.println ("=========" );

        //赋值调用
        int number = sum ( 15,16 );
        number +=100;
        System.out.println ("变量的值"+number );
    }
    public static  int sum(int a,int b){
        System.out.println ("方法执行了" );
        int result = a + b;
        return result;
    }
}
