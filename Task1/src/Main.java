public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static String CORRECT_CHAR = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        for (int i = 1; i <CORRECT_CHAR.length(); i++) {
            int a = CORRECT_CHAR.charAt(i);
            System.out.println((char) a + "-" + a);
        }
            String i = CORRECT_CHAR.toUpperCase();
            for (int b = 1; b <i.length(); b++){
                int a = i.charAt(b);
                System.out.println((char) a + "-" + a);
            }



    }
}