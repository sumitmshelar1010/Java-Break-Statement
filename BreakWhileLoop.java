package MainPackage.JavaBasics.breakstatements;

public class BreakWhileLoop {
    public static void main(String[] args){
        int a=0;
        while (a<=5){
            if (a==3){break;}
            System.out.println(a);a++;
        }
    }
}
