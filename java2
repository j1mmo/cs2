
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Reminder {
    public static void main(String[] args) {
        Reminder rc = new Reminder();
        rc.showMessage2(args);
        rc.showMessage(args);
    } // main
    private void showMessage(String[] messages) {
        StringBuilder msg = new StringBuilder("Hello");
        if(messages.length > 0) {
            msg.append(", ");
            for(int i = 0; i < messages.length && i < 5; ++i){
                msg.append(messages[i]).append(" ");
            }
        }
        System.out.println(msg.toString());
// using a for/in loop
        StringBuilder msg2 = new StringBuilder("Hello again, ");
        for(String word : messages) {
            msg2.append(word).append(" ");
        }
        System.out.println(msg2.toString());
        String userInput = "";
        System.out.println("Enter your name ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = reader.readLine();
        } catch (IOException ex) { }
        System.out.println("Hello "+ userInput);
    } // showMessage
    private void showMessage2(String[] messages) {
        List<String> ar = Arrays.asList(messages);
        Iterator it = ar.iterator();
        String word;
        while(it.hasNext()) {
            word = (String) it.next();
            System.out.println(word);
        }
    } // showMessages2
} // Reminder
