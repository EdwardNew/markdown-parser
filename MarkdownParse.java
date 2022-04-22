//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);

            //Checks that a an open bracket exists, if not, return what is currently in toReturn
            if(openBracket < 0){
                return toReturn;
            }

            int closeBracket = markdown.indexOf("]", openBracket);

            //Checks that a an close bracket exists, if not, return what is currently in toReturn
            if(closeBracket < 0){
                return toReturn;
            }

            int openParen = markdown.indexOf("(", closeBracket);

            //Checks that a an open parentheses exists, if not, return what is currently in toReturn
            if(openParen < 0){
                return toReturn;
            }

            int closeParen = markdown.indexOf(")", openParen);

            //Checks that a an close parentheses exists, if not, return what is currently in toReturn
            if(closeParen < 0){
                return toReturn;
            }

            if(openBracket == 0 || (openBracket > 0 && markdown.charAt(openBracket-1) != '!')
                                                            && (closeBracket + 1 == openParen)){
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }

            currentIndex = closeParen + 1;
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
