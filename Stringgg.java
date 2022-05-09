public class Stringgg {
    public static void main(String[] args){
        String name = "Amit";
        int a =45,b= 23, c= 45;
        String channel = "Code With Amit";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name + " from "+ channel);
        System.out.println(name + " from\" " + channel);
        System.out.println(name + " from\\ " + channel);
        System.out.println(name + " from\t " + channel);
        System.out.println(name + " from\n " + channel);
        
        
        //                   ******** Concatination of String with Intege **********
        //if we concatinate integer then string, then it will add the integer first the concatinate with string. Like 45+23+45+Amit=113AMit.
        System.out.println(a+b+c+name); 

        //if we concatinate string then integer, then it will conc string and conc all integer together like Amit452345.
        System.out.println(name+a+b+c); 

        //if we concatinate first the integer then String then againg integer, then it will treate integer as a string. O/p-45Amit2345.
        System.out.println(a+name+a+b+c); 
        
        String st="    Amit is Learner  ";
        // It can also written in either this way or in  the next SOP way.
        // String ch = st.trim(); 
        // System.out.println(ch);
        // Return the new string after removing the leading and trailing spaces from the original string.
        System.out.println(st.trim());

        String ct="Amit is Learner";

        // Return the character which is at index 2.
        System.out.println(ct.charAt(2));

        // Return the index or position of the character.
        System.out.println(ct.indexOf('i'));

        // Return the index of the chatacter but starts searching with the given index.
        System.out.println(ct.indexOf("i", 3));

        // Return true if th string contains string "Am" else return false.
        System.out.println(ct.contains("Am"));

        // Return a substring strat from the given index(Include) throughout the end of the string.
        System.out.println(ct.substring(4)); 

        // It return from the starting index(Include) to the ending index-1 or(Exclude).
        System.out.println(ct.substring(2,6));

        // Return the new string after replaceing l to b.
        System.out.println(ct.replace('L', 'B'));

        // Replace learner to beginner.
        System.out.println(ct.replace("Learner", "Beginner")); 

        // Return true if the string start with String "Am" and return false if not.
        System.out.println(ct.startsWith("Am"));

        // Return true if the string end with String "ner" and return false if not.
        System.out.println(ct.endsWith("ner"));

        // Return the last index of the string but it start searching the string from the ending
        System.out.println(ct.lastIndexOf("i"));

        // Return the index of the string before 4th index
        System.out.println(ct.lastIndexOf("i", 4));

        
        System.out.println(ct.length());


        
    }
}