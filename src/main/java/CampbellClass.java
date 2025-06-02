public class CampbellClass {

    private CampbellClass() {
    }
    
    public static String convertString(int num) {
        return Integer.toString(num);
    }
    public static String convertString(double dnum) {    
        return Double.toString(dnum);
    }
    public static String convertString(char c) {
        return Character.toString(c);
    }
    public static String convertString(boolean boo) {
        return Boolean.toString(boo);
    }
    public static int convertMetersToCenti(int m) {
        return m * 100;
    }
    public static double convertMetersToCenti(double dm) {
        return dm * 100.00;
    }
    public static String removeNonAlpha(String word) {
        word = word.replaceAll("[^a-zA-z]", "");
        return word;
    }
    public static String removeNonAlpha(String word, boolean boo) {
        word = word.replaceAll("[^a-zA-z]", "");
        if (boo) {
            return word.toUpperCase();
        }
        return word.toLowerCase();  
    }
    
}