public class Recurtion_PrintKeypad_Combination {

    public static String[] keypad = {".","abc","def","ghi", "jkl","mno","pqr","stu","vwx","yz"};

    public static void printComb(String str, int index, String combination){

        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length();i++){
            printComb(str, index+1, combination + mapping.charAt(i)); 
        }
    }
    public static void main(String[] args) {
        
        String str = "25";
        printComb(str, 0, "");
    }
}
