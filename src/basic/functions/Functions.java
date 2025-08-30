package basic.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        ArrayList<String> listEmails = new ArrayList<>(Arrays.asList("david@gmail.com","stalin@gmail.com","davi.gmail.com"));

        sendEmail(listEmails);


    }

    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

    public static void sendEmail(String email) {
        System.out.println("Mensaje enviado: " + email);
    }
    public static void sendEmail(ArrayList<String> emails) {
        for(String email : emails){
            if (checkEmail(email)){
                sendEmail(email);
            }
        }
    }

    public static boolean checkEmail(String email) {
        if(email.contains("@")){
            return true;
        }else {
            return false;
        }
    }

}
