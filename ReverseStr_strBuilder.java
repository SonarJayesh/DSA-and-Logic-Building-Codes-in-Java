public class ReverseStr_strBuilder {
    public static void main(String[] args) {
        
        StringBuilder sBuilder = new StringBuilder("Jayesh");

        for(int i=0; i<sBuilder.length()/2; i++){

            int front = i;
            int back = sBuilder.length() - 1 - i;

            char frontChar = sBuilder.charAt(front);
            char backChar = sBuilder.charAt(back);           
            
            sBuilder.setCharAt(front, backChar);
            sBuilder.setCharAt(back, frontChar);
        }
        System.out.println(sBuilder);
    }
}
