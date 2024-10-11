import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] monthlyPayments = {10000, 20000, 30000, 50000, 40000};
        int totalPayments = 0;
        for (int pay : monthlyPayments) {
            totalPayments += pay;
        }
        System.out.println("Сумма трат за месяц составила " + totalPayments + " рублей");

        System.out.println();
        System.out.println("Задача 2");

        int minPayment = monthlyPayments[0];
        int maxPayment = monthlyPayments[0];
        for (int pay : monthlyPayments) {
            if (pay < minPayment) {
                minPayment = pay;
            }
            if (pay > maxPayment) {
                maxPayment = pay;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        System.out.println();
        System.out.println("Задача 3");

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int[] monthlyPayments1 = {10000, 20000, 30000, 50000, 40001};
        int totalPayments1 = 0;

        for (int pay : monthlyPayments1) {
            totalPayments1 += pay;
        }
        double averagePayment = (double) totalPayments1 / monthlyPayments1.length;
        String averagePaymentKopeyki = decimalFormat.format(averagePayment);
        System.out.println("Средняя сумма трат за месяц составила " + averagePaymentKopeyki + " рублей");

        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


}