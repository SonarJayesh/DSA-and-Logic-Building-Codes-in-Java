public class StringBuliderDemo {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Jayesh");

        System.out.println(sb);

        //chat at of index 0
        System.out.println(sb.charAt(0));

        //set char at of index 0
        sb.setCharAt(0, 'm');
        System.out.println(sb);


        sb.insert(2, 'h');
        System.out.println(sb);
        
        System.out.println(sb.deleteCharAt(2));

        System.out.println(sb.replace(0, 1,"J"));


        StringBuilder stringBuilder = new StringBuilder("H");
        stringBuilder.append("e");
        stringBuilder.append("l");
        stringBuilder.append("l");
        stringBuilder.append("o");
        
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
    }
}
