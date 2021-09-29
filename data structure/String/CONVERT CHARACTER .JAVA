CONVERT UPPER TO LOWER , LOWER TO UPPER :

public class CharUpperLowerCase {
    public static void main(String[] args) {
        char char1, char2;

        char1 = 'a';
        char2 = 'B';

        char char1UpperCase = Character.toUpperCase(char1);
        char char2LowerCase = Character.toLowerCase(char2);

        System.out.println(char1UpperCase);
        System.out.println(char2LowerCase);

    }
}
OUTPUT: A B
