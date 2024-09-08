public class Recurtion_PrintAllSubsequenceOfString {

    public static void subSequence(String str, int index, String newString){
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        //to be
        subSequence(str, index+1, newString+currChar);
 
        //or not to be
        subSequence(str, index+1, newString);
    }
    public static void main(String[] args) {
        
        String str = "abc";
        subSequence(str, 0, "");
    }
}
