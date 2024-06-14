package ReverseStringVedio150;

public class PalindromeTest {
    public boolean isPalindrome(String str) {
        String name = "";

        for (int i = str.length() - 1; i >=0 ; i--) {
            name = name + str.charAt(i);

        }
        System.out.println(name);
        if(name.equals(str)){
            return  true;
        }else {
            return false;
        }

    }
}


