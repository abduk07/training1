import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ведите ваше имя и фамилию");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Привет " + name);


        System.out.println("Введите ваш пароль");
        Scanner password = new Scanner(System.in);
        String pass = password.nextLine();
        System.out.println("Введите пароль еще раз!");

        Scanner passwordRight = new Scanner(System.in);
        String passR = passwordRight.nextLine();

        if (pass.equals(passR)){
            System.out.println("Вы ввели правильный пароль");
        }else {
            System.out.println("Пароль не потвержден");
        }



    }
}


