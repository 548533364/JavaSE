package Demo01_Circulation;

public class If {
    public static void main ( String[] args ) {
        /**如果分数超过100.也会出现不及格的情况**/
        int score =98 ;
        if (score>=90&& score<100){
            System.out.println ("优秀" );
        }else if (score>=80&& score<90){
            System.out.println ("好" );
        }else if (score>=70&& score<80){
            System.out.println ("良" );
        }else if (score>=60&& score<70){
            System.out.println ("及格" );
        }else  if (score>=0&&score<60){
            System.out.println ("不及格" );
        }else {
            System.out.println ("数据错误" );
        }
    }
}
