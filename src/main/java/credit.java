import java.util.InputMismatchException;
import java.util.Scanner;

public class credit {

        public static void main (String[] args) {
            double summCredit;
            double stavka;
            double payment;
            try {
                System.out.println("Введите сумму кредита");
                Scanner scaner1 = new Scanner(System.in);
                summCredit = scaner1.nextDouble();

                System.out.println("Введите процентную ставку");
                Scanner scaner2 = new Scanner(System.in);
                stavka = scaner2.nextDouble();

                System.out.println("Введите сумму ежемесячного платежа");
                Scanner scaner3 = new Scanner(System.in);
                payment = scaner3.nextDouble();

                double ostatokOD;
                double percent;
                int percentSumm;

                ostatokOD = summCredit;
                double percentSum = 0;
                double colPy = 0;
                for (int i = 1; ostatokOD > 0; i++) {
                    percent = ostatokOD / 100 * stavka / 365 * 30.42; //% за месяц
                    double paymentOD = payment - percent; // сумма от ежем.платежа которая пойдет в погашение основного долга

                    if (ostatokOD >= paymentOD) {
                        ostatokOD -= paymentOD; // остаток ОД
                    } else if (ostatokOD < paymentOD) {
                        ostatokOD = 0; // остаток ОД
                    }

                    percentSum += percent;

                    colPy = i;



                }
                percentSumm = (int)Math.ceil(percentSum);
                System.out.println("Для погашения потребуется " + colPy + " мес.");
                System.out.println("Переплата по процентам составит " + percentSumm + " руб.");
//                System.out.println(ostatokOD);
            } catch (InputMismatchException exception) {
                System.out.println("Введите коректные данные!");
                ;
            }
        }
    }
