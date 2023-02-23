import java.util.InputMismatchException;
import java.util.Scanner;

public class credit {

        public static void main (String[] args) {
            double summCredit;
            try {
                System.out.println("Введите сумма кредита");
                Scanner scaner1 = new Scanner(System.in);
                summCredit = scaner1.nextDouble();

                System.out.println("Введите процентную ставку по кредиту");
                Scanner scaner2 = new Scanner(System.in);
                double stavka = scaner2.nextDouble();

                System.out.println("Введите сумму ежемесячного платежа");
                Scanner scaner3 = new Scanner(System.in);
                double payment = scaner3.nextDouble();

                double ostatokOD;
                double percent;

                ostatokOD = summCredit;
                double percentSum = 0;
                double colPy = 0;
                for (int i = 1; ostatokOD > 0; i++) {
                    percent = ostatokOD / 100 * stavka / 365 * 30; //процент за месяц
                    double paymentOD = payment - percent; // сумма от ежем.платежа которая пойдет в погашение основного долга

                    if (ostatokOD >= paymentOD) {
                        ostatokOD -= paymentOD; // остаток основного долга
                    } else if (ostatokOD < paymentOD) {
                        ostatokOD = 0; // остаток основного долга
                    }

                    percentSum += percent;
                    colPy = i;

                    System.out.println(colPy);
                    System.out.println(percentSum);
                    System.out.println(ostatokOD);

                }
            } catch (InputMismatchException exception) {
                System.out.println("Введите коректные данные!");
                ;
            }
        }
    }
