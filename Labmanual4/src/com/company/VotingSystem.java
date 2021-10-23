package com.company;

import ir.huri.jcal.JalaliCalendar;
import java.util.ArrayList;

/**
 * VotingSystem class to use all previous classes and be runnable in main class
 *
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class VotingSystem {

    private ArrayList<Voting> votingList;
    private Vote vote;
    private Person person;
    private Voting voting;

    // REMEMBER : when you want to use other CLASSES' methods in the last and final CLASS , it's a nice approach that
    // you create an INSTANCE of each of them so you can use their methods easily


    /**
     * allocate space for voting which is an ArrayList
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }
    public Vote getVote() {
        return vote;
    }
    public void setVote(Vote vote) {
        this.vote = vote;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
    public void setVotingList(ArrayList<Voting> votingList) {
        this.votingList = votingList;
    }


    /**
     * createVoting method
     * get question and type of vote and choices of vote then add them in voting object
     *
     * @param question question of vote
     * @param type single or multiple vote ?
     * @param choicesList all choices that must be shown for voters
     */
    public void createVoting (String question, int type, ArrayList<String> choicesList) {
        Voting voting = new Voting(type, question);
        for (String choice : choicesList) {
            voting.createChoice(choice);
        }
        votingList.add(voting);
    }

    /**
     * createVoting method @overriding
     * get question and type of vote then add them in voting object
     *
     * @param question question of vote
     * @param type single or multiple vote ?
     */
    public void createVoting (String question, int type) {
        Voting voting = new Voting(type, question);
        votingList.add(voting);
    }

    /**
     * @param index shows which one of votes is selected to add choice in it
     * @param newChoice the choice that will be added into voting
     */
    public void createChoice (int index, String newChoice) {
        votingList.get(index).createChoice(newChoice);
    }

    /**
     * @param question shows which one of votes is selected to add choice in it
     * @param newChoice the choice that will be added into voting
     */
    public void createChoice (String question, String newChoice) {
        int index;
        for (Voting voting : votingList) {
            if (voting.getQuestion().equals(question)) {
                index = votingList.indexOf(voting);
                votingList.get(index).createChoice(newChoice);
                break;
            }
        }

    }

    /**
     * print all votes by printing their questions
     */
    public void printListOfVoting () {
        int i = 0;
        for (Voting question : votingList) {
            System.out.print("Questions #" + i + " : ");
            System.out.println(question.getQuestion());
            i++;
        }
    }

    /**
     * print specific voting with index
     * @param index index of voting to use in votingList ArrayList
     */
    public void printVoting (int index) {
        System.out.println("Question : " + votingList.get(index).getQuestion());
        votingList.get(index).printChoices();
    }

    /**
     * most important method that take vote from voters and check the type of voting to see whether it's possible to vote multiple
     * choices or not and store vote in selected voting
     *
     * @param index index of voting
     * @param voterFirstName voter's firstname
     * @param voterLastName voter's lastname
     * @param date date that vote has been taken
     * @param votedChoices list of selected choices by voter
     */
    public void vote (int index, String voterFirstName, String voterLastName, JalaliCalendar date, ArrayList<String> votedChoices) {
        if (votingList.get(index).getType() == 0) {
            person = new Person(voterFirstName, voterLastName);
            String temp = votedChoices.get(0);
            votedChoices.clear();
            votedChoices.add(temp);
            votingList.get(index).vote(person, date, votedChoices);
        }
        else if (votingList.get(index).getType() == 1) {
            person = new Person(voterFirstName, voterLastName);
            votingList.get(index).vote(person, date, votedChoices);
        }
        else {
            System.err.println("type is invalid");
        }
    }

    /**
     * print all results so you can see who vote to which choices
     *
     * @param index index of voting
     */
    public void printResult (int index) {
        votingList.get(index).printResult();
    }
}
