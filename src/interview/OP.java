package interview;

public class OP {
    public static void main(String[] args) {
//        System.out.println(fact(5));
        System.out.println(ispowerTwo(6));
    }

    private static boolean ispowerTwo(int number) {
        if (number !=0){
            while (number% 2==0){
                number>>=1;
            }
        }
        return number == 1 ;
    }

    private static int fact(int number) {
        return number!=0? number* fact(number-1) : 1;
    }
}
