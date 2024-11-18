public class Main {
    public static void main(String[] args) {

        System.out.println("Hello BridgeLabs");
        System.out.println(add(2,3));
    }
    static int add(int a,int b){
        int c= a+b;
        return c;
    }
    static int product(int a, int b){
        int c=0;
        if(b>a){
            c+=b-a;
        }
        return c;

    }

}