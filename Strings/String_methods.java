public class String_methods{
    public static void main(String[] args){
        String name = "PRIYanka";
       // System.out.println(name);
       int value = name.length();
       System.out.println(value);

       String lstring = name.toLowerCase();
       System.out.println(lstring);
        String Ustring = name.toUpperCase();
       System.out.println(Ustring);



       //TRIMMING CONCEPT...

       String  nonTrimmedString = "     pihu   ";
       System.out.println(nonTrimmedString);

       String trimmedString = nonTrimmedString.trim();
       System.out.println(trimmedString);

       //SUBSTRING
       System.out.println(name.substring(3));
       System.out.println(name.substring(1,5));


    }
}