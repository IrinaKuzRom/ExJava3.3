import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму которую вы хотите взять в кредит: ");
        double summa = in.nextDouble();
        System.out.print("Вы хотите взять в кредит   " + summa + "  рублей \n");

        System.out.print("Введите процентную ставку: ");
        double rate = in.nextDouble();
        System.out.printf("Ваша процентная ставка составляет  " + rate + " процентов \n");

        System.out.print("На сколько месяцев вы хотите взять кредит: ");
        int term = in.nextInt();
        System.out.print("Вы хотите взять кредит на  " + term + "  месяцев \n");


        double indMass = service.calculate(summa, rate, term);
        System.out.printf("Ваш ежемесячный платёж составит: %.2f", (double) (Math.round(indMass * 100)) / 100);
        in.close();
    }

}
