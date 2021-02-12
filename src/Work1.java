public class Work1 {
    public static void main(String[] args) {
        String name = "LAJU SHRESTHA";

        //string with spaces
        System.out.println("Length of the string:" +name.length());

        //string without spaces
        String space = name.replace(" ","");
        System.out.println(" The length of the word without space " +space.length());

    }
}
