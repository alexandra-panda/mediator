package com.company;

public class MediatorPatternExample {
    public static void main (String args[]){
        ChatServer chatServer = new ChatServerMediator();

        Participant sorin = new Participant("Sorin");
        Participant ana = new Participant("Ana");
        Participant victor = new Participant("Victor");

        sorin.joinChatGroup(chatServer);
        ana.joinChatGroup(chatServer);
        victor.joinChatGroup(chatServer);


        sorin.sendMessage("Salut, sunt Sorin!");

        ana.sendMessage("Salut Sorin, eu sunt Ana!");
    }
}
