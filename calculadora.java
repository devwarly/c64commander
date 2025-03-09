import java.util.Scanner;
public class calculadora {
    public static void main(String args[]){
        int A, B, OP, R;
        System.out.println("Calculadora com Switch");
        System.out.print("Por favor, digite o primeiro valor: ");
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        System.out.print("Por favor, digite o segundo valor: ");
        B = s.nextInt();
        System.out.println("Por favor digite sua opção: \n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        OP = s.nextInt();
        switch (OP) {
            case 1:
                R = A + B;
                System.out.println("A soma de " + A + " + " + B + " é " + R);
                System.out.println("Finalizando...");
                break;
            case 2:
                R = A - B;
                System.out.println("A subtração de " + A + " - " + B + " é " + R);
                System.out.println("Finalizando...");
                break;

            case 3:
                R = A * B;
                System.out.println("A multiplicação de " + A + " x " + B + " é " + R);
                System.out.println("Finalizando...");
                break;

            case 4:
                R = A / B;
                System.out.println("A divisão de " + A + " / " + B + " é " + R);
                System.out.println("Finalizando...");
                break;

            default:
                System.out.println("A opção inserida não é valida!");
                break;
        }
    }
}