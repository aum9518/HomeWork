import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Бир санды басыныз: ");
        System.out.println(contains(in.nextInt(),1,2,3,4,5,6));
    }
    static boolean contains(int a,int...varargs){
        for (int i=0;i< varargs.length;i++){
            if (a==varargs[i]){
                return true;
            }
        }
        return false;
    }
}
