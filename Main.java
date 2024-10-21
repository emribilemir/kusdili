import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        char letterToAdd = 'g';
        String modifiedString = addLetterBetweenVowelAndDuplicate(input, letterToAdd);

        System.out.print(modifiedString);
    }

    public static String addLetterBetweenVowelAndDuplicate(String str, char letterToAdd){
        String vowels = "aeiıoöuü";
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            result.append(ch);

            if(vowels.indexOf(ch) != -1){
                result.append(letterToAdd).append(ch);
            }
        }

        return result.toString();
    }
}
