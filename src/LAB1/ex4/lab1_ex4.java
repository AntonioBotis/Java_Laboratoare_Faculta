package LAB1.ex4;

public class lab1_ex4 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 30) + 1;
        int b = (int) (Math.random() * 30) + 1;

        System.out.println("numerele sunt `"+a+ " "+b);

        if(a==1 || b==1)
            System.out.println("cel mai mare divizor pentru " + a + " si "+ b + "este" +1);


        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
