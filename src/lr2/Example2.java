package lr2;

public class Example2 {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);

        return encryptString;
    }

    public static void main(String[] args) {
        String encrypt = "Добавочный метод для работы класса шифрования";
        int shift = 7;
        String encrypted = getEncryptString(encrypt, shift);
        System.out.println("Зашифрованное сообщение: " + encrypted);
    }
}
