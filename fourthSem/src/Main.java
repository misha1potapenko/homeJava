public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        float res1 = results(5f,7.3f);
        printAnyThink(String.valueOf(res1));
        int res3 = factor(7);
        printAnyThink(String.valueOf(res3));

    }
    public static void printAnyThink(String any){
        System.out.println(any);
    }

    public static float results(float a, float b) {
        float res = a + b;
        return res;

    }
    public static int factor(int n){
         if (n <= 1) {
             return 1;
         }
         else {
             int res2;
             res2 = n * factor(n-1);
            return res2;
         }
    }
//    public static int[] array(int[] arr, int start, int finish){
//        int[] leftArray = array(arr, start,finish/2);
//
//
//    }
}