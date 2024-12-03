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
        String lowCaseVersion = "";
        int i = 0;
    
        while (i < str.length()) {
            char ch = str.charAt(i);
    
            if ((ch >= 97 && ch <= 122) || ch == 32 || (ch >= 48 && ch <= 57)) { 
                lowCaseVersion = lowCaseVersion + ch;
    
            } else if (ch >= 65 && ch <= 90) {
                lowCaseVersion = lowCaseVersion + (char) (ch + 32); 
    
            }
            i++;
        }
        return lowCaseVersion;
    }


    public static boolean contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str2.length()==0) {
            return true; 
        }
        if (str2.length() > str1.length()) {
            return false; 
        }
    
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean match = true;
    
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) { 
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }
    
        return false;
    }
}


  /** If str1 contains str2, returns true; otherwise returns false. */
    // public static boolean contains(String str1, String str2) {
  
    //     if (str1 == null || str2 == null) {
    //         return true;
    //     }
    //     String longerString;
    //     String shorterString;
    
    //     if (str1.length() >= str2.length()) {
    //         longerString = str1;
    //         shorterString = str2;
    //     } else {
    //         longerString = str2;
    //         shorterString = str1;
    //     }
    
    //     for (int i = 0; i <= longerString.length() - shorterString.length(); i++) {
    //         boolean match = true;
    
    //         for (int j = 0; j < shorterString.length(); j++) {
    //             if (longerString.charAt(i + j) != shorterString.charAt(j)) {
    //                 match = false; 
    //                 break;
    //             }
    //         }
    
    //         if (match) {
    //             return true;
    //         }
    //     }
    
    //     return false;
    // }