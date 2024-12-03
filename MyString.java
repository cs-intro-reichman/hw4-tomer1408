public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String preprocessedVersion = "";
        int i = 0;
    
        while (i < str.length()) {
            char ch = str.charAt(i);
    
            if ((ch >= 97 && ch <= 122) || ch == 32 || (ch >= 48 && ch <= 57)) { 
                preprocessedVersion = preprocessedVersion + ch;
    
            } else if (ch >= 65 && ch <= 90) {
                preprocessedVersion = preprocessedVersion + (char) (ch + 32); 
    
            }
            i++;
        }
        return preprocessedVersion;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        return false;
    }
}
