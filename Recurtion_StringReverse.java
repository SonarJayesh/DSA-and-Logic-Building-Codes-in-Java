public class Recurtion_StringReverse {

    public static void printRevStr(String str, int Index){

        if (Index == 0) {
            System.out.println(str.charAt(Index));
            return;
        }

        System.out.print(str.charAt(Index));
        printRevStr(str, Index-1);
    }
    public static void main(String[] args) {

        String str = "Jayesh";
        printRevStr(str, str.length()-1);
    }
}
