import Observer.Messenger;
import Observer.Subscriber;
import models.Person;
import services.EmailLogic;
import services.PersonData;

import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonData personData = new PersonData();
        EmailLogic emailLogic = new EmailLogic();
        Person person1 = new Person("Daniela");
        Person person2 = new Person("Karen");
        Person person3 = new Person("Maria");
        personData.setPersonData(person1);
        personData.setPersonData(person2);
        personData.setPersonData(person3);
        JOptionPane.showMessageDialog(null,"Daniela,Karen,Maria usuarios por defecto");
        while (true){
            switch (JOptionPane.showInputDialog(" 1.Enviar correo \n 2. Ver que chats tiene cada persona \n 3. Ver las conversaciones")){
                case "1":
                    emailLogic.initChat();
                break;
                case "2":
                    emailLogic.sawChats();
                    break;

            }
        }

    }
}