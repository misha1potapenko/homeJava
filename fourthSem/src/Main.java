public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        float res1 = results(5f,7.3f);
        printAnyThink(String.valueOf(res1));

    }
    public static void printAnyThink(String any){
        System.out.println(any);
    }

    public static float results(float a, float b) {
        float res = a + b;
        return res;

    }
}