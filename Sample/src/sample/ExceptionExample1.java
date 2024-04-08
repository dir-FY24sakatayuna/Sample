package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //例外が発生する可能性のあるコード
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //ArithmeticExceptionが発生した場合の処理
            System.out.println("ArithmetivExceptionが発生：" + e.getMessage());
        }finally {
            //例外の有無にかかわらず実行されるコード
            System.out.println("割り算終了");
        }
        
        System.out.println("処理終了");
    }

}
