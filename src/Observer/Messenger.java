package Observer;

import Interfaces.Observer;
import models.Conversation;
import models.Person;

public class Messenger implements Observer {
    Person personOwner;
    Person personChat;
    Conversation conversation = new Conversation();
    public Messenger(){

    }

    public Messenger(Person personOwner,Person personChat){
        this.personOwner = personOwner;
        this.personChat = personChat;
    }
    @Override
    public void update(String str) {
        conversation.setConversation(str);
    }

    @Override
    public String getNamePerson() {
        return this.personOwner.getName();
    }

    public Conversation getConversation(){
        return conversation;
    }
    public Person getPerson() {
        return personOwner;
    }

    public void setPerson(Person personOwner) {
        this.personOwner = personOwner;
    }

    public Person getPersonOwner() {
        return personOwner;
    }

    public Person getPersonChat() {
        return personChat;
    }
}
