public class Recurtion_MoveAllDonEndoftheString {

    public static void moveAlld(String str, int index, int count, String newString){

        if (index == str.length()) {
            for(int i=0; i<count; i++){
                newString += 'd';

            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'd'){
            count++;
            moveAlld(str, index+1, count, newString);

        }else{
            newString += currChar;
            moveAlld(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {

        String str = "addbdc";
        moveAlld(str, 0, 0, "");

    }
}
