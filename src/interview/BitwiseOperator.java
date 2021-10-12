package interview;

public class BitwiseOperator {
    public static void main(String[] args) {
//        int x = 4;
//        System.out.println(true & false);
//        System.out.println(false & true);
//        System.out.println(true & true);
//        System.out.println(false & false);

//        System.out.println("|");
//        System.out.println(true | false);
//        System.out.println(false | true);
//        System.out.println(true | true);
//        System.out.println(false | false);
//
//        System.out.println("^");
//        System.out.println(true ^ false);
//        System.out.println(false ^ true);
//        System.out.println(true ^ true);
//        System.out.println(false ^ false);

        System.out.println("====================");

//        System.out.println(4&5);//100 //001 //100 //4
//        System.out.println(5&4);//101
//        System.out.println(4&4);
//        System.out.println(5&5); //
        System.out.println(factOfTwo(4));
//        System.out.println(IsPowerOfTwo(6));
//        System.out.println(IsPowerOf(9,3));

        //IN leftshit * by time with 2
        //in right shift / by time 2

//        System.out.println("x<<=4 => "+(x<<=4));//00000100 //         01000000  //64
//        System.out.println(x*2);
//        System.out.println("x>>=4 => "+(x>>=4));//01111011 //    00000111 //
//        System.out.println(x/2);
    }

    private static boolean factOfTwo(int i) {

        return (i & (i-1))==0;
    }

    static boolean IsPowerOfTwo(int n)
    {
        if (n > 1)
        {
            while (n%2 == 0)
            {
                n >>= 1;
            }
        }
        return n == 1;
    }

    static boolean IsPowerOf(int n, int b)
    {
        if (n > 1)
        {
            System.out.println("n % b = "+(n % b ));
            while (n % b == 0)
            {
                System.out.println("n /= b = "+(n /= b));

            }
        }
        return n == 1;
    }
}
