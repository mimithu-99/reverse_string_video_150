public class ReverseStringPractice01 {
    public static void main(String[] args) {
        //String name = "Helen_Italian";
        String reverseName = "";
        String name = "StudentTeacher"
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println("check index " + name.charAt(2));
        System.out.println(name.indexOf(4));

        for (int i = name.length() -1; i > 0 ; i--) {
         reverseName = reverseName + name.charAt(i);

        }
    }
}
