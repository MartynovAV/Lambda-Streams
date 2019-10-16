package testStrings;
//https://www.geeksforgeeks.org/reverse-a-string-in-java/

public class TestMainStrings {
    public static void main(String[] args) {

        int num=747;
        String str=new StringBuilder(Integer.toString(num)).reverse().toString();
        System.out.println(str);
        boolean palindrom =Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString());
        System.out.println(palindrom);

        String str1="madam";
        String str2=new StringBuilder(str1).reverse().toString();
        System.out.println(str2);


        if(str1.equals(new StringBuilder(str1).reverse().toString())){
            System.out.println("Palindrom");
        } else{
            System.out.println("not palindrom");
        }
    }
}
