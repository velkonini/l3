import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkThree {
    static Scanner scanner;
    static Random random;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        guessTheNumber();

    }


    static void guessTheNumber() {
        int x = random.nextInt(10);
        int userAnswer;
        int y;

        do {
            System.out.println("Добро пожаловать в игру \n'Угадай число'!");
            for (y = 1; y <= 3; y++) {
                System.out.println("Введите число от 0 до 9");
                userAnswer = scanner.nextInt();
                if (userAnswer == x) {
                    System.out.println("Поздравляю, вы угадали");
                    break;
                }
                if (userAnswer > x) {
                    System.out.println("Загаданное число меньше");
                }
                if (userAnswer < x) {
                    System.out.println("Загаданное число больше");
                }
            }
            while (y > 3) {
                System.out.println("Количество попыток исчерпано");
                break;
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

        } while (scanner.nextInt() == 1);
    }
}
