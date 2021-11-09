package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
