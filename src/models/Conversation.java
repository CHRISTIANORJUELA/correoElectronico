package models;

import java.util.ArrayList;

public class Conversation {
    private final ArrayList<String> textConversation = new ArrayList<>();

    public Conversation(){

    }

    public ArrayList<String> getConversation() {
        return textConversation;
    }

    public void setConversation(String sentece) {
        this.textConversation.add(sentece);
    }
}
