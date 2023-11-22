package Examples;

public class Strings {
    public static void main(String[] args)
    {
        String sentence = "Text processing is hard!";
        int position = sentence.indexOf("hard");

        //strings own manyfunctions sucha as indexOf which indicates the position of the first character


        System.out.println(sentence);
        System.out.println("012345678901234567890123"); 
        System.out.println("The word \"hard\" starts at index " + position);

            // in strings the \ indicates a special character inside the string
            //to print backslash we use double backslash such as \\ 


        sentence = sentence.substring(0, position) + "easy!";
		sentence = sentence.toUpperCase();
        System.out.println("The changed string is:");
        System.out.println(sentence);
    }
}
