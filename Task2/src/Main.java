import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHAR = (" -абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' '){
                    spaceCount++;
                }
                if (!CORRECT_CHAR.contains(String.valueOf(input.charAt(i)))) {
                    isValid = false;
                    break;
                }
            }
                if (isValid && spaceCount == 2){
                    System.out.println(input);
                }else {
                    System.out.println("Введенная строка не является ФИО");
                }



        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        System.out.println("Введите Фамилию Имя Отчество");
       String fIO = new Scanner(System.in).nextLine();
        int i = fIO.indexOf(' ');
        System.out.println("Фамилия: " + fIO.substring(0, i).trim());
        System.out.println("Имя: " + fIO.substring(fIO.indexOf(' '), fIO.lastIndexOf(' ')).trim());
        System.out.println("Отчество: " + fIO.substring(fIO.lastIndexOf(' ')).trim());
    }

}