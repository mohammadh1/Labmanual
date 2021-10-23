package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Voting class to create a voting with single choice or multiple choice
 * Question of vote will be taken too and a list of voters
 * A hashmap will be set so we can track who vote which choices
 *
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class Voting {
    private int type;
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;      // < each choice , who votes >

    public Voting (int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        choices = new HashMap<>();
    }

    public void setVoters(ArrayList<Person> voters) {
        this.voters = voters;
    }
    public void setChoices(HashMap<String, HashSet<Vote>> polls) {

    }
    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public ArrayList<Person> getVoters() {
        return voters;
    }
    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }
    public String getQuestion() {
        return question;
    }

    /**
     * get a new choice and add it into voting
     *
     * @param newChoice
     */
    public void createChoice (String newChoice) {
        choices.put(newChoice,new HashSet<Vote>());
    }

    /**
     * method that process vote to each choice
     *
     * @param person person object that stores info
     * @param date date
     * @param votes list of choices that has been selected
     */
    public void vote (Person person, JalaliCalendar date, ArrayList<String> votes ) {
        voters.add(person);
        //
        //HashSet<Vote> tempVoteList = new HashSet<Vote>();           //temporary all votes that each person voted in a list
        Vote tempVote = new Vote(person, date);                     // temporary vote for each person and date
        for (String strVotes : votes) {
            for (String strChoices : choices.keySet()) {
                if (strChoices.equals(strVotes)) {
                    choices.get(strChoices).add(tempVote);
                    // REMEMBER : you must not use PUT when you know the key is already exists you just need to get the
                    // KEY and add the TEMPVOTE into choices' value
                }
            }
        }
    }
    public void vote (Person person, JalaliCalendar date, String vote ) {

        voters.add(person);
        //HashSet<Vote> tempVoteList = new HashSet<Vote>();           //temporary all votes that each person voted in a list
        Vote tempVote = new Vote(person, date);                     // temporary vote for each person and date
        for (String strChoices : choices.keySet()) {
            if (strChoices.equals(vote)) {
                choices.get(strChoices).add(tempVote);
                // REMEMBER : you must not use PUT when you know the key is already exists you just need to get the
                // KEY and add the TEMPVOTE into choices' value
            }
        }
    }

    /**
     * print votes that has been given to a specific choice
     *
     * @param choice choice that user want to see who vote it
     */
    public void printVotesOfEachChoice (String choice) {
        /*
        اول یه for each میزنیم که بیاد روی key های choices بره جلو و در واقع گزینه رو بگیره و چاپ کنه بعد یه for each دیگه برای اینکه بتونیم
        روی value های مربوط به key که در for each اولی تحت عنوان رشته choice گرفتیم بریم جلو و رای هارو چاپ کنیم
        دو تا پرینت نوشته شده نمیدونم کدومش کار کنه
        */
        /*
         یه مشکلی بود که وقتی از این متود توی printresult استفاده میکردم مشخصات vote رو برای همه گزینه ها چاپ میکرد نه گزینه که بهش مربوط بود
         دلیلش این بود من گزینه مورد نظر رو چک نمیکردم و پارامتر نداده بودم و واسه همین همه key هارو چک میکرد و value رو
         که از جنس vote بود میگرفت و روی اون for each میکرد و هر جی بود چاپ میکرد

         واسه همین پارامتر رو دادم به عنوان ارگومان متود و تونستم چک کنم که اگر گزینه در پارامتر

         str1---->hashset1 {vote1,
                            vote2}

         str2---->hashset2 {vote1}

         str3---->hashset3 {vote1,
                            vote2,
                            vote3}

             حالا فقط همون گزینه که به عنوان پارامتر پاس داده شده vote هاش چاپ میشن
         */
        //System.out.println("Question : " + question);
        for (String tempChoice : choices.keySet()) {
            if (tempChoice.equals(choice)) {
                //System.out.println("Choice : " + choice);
                for (Vote vote : choices.get(tempChoice)) {
                    //System.out.println("Votes : " + vote.toString());
                    System.out.println("Votes : " + vote.getPerson() + " | " + vote.getDate());
                }
            }
        }
        System.out.println("-------------------------------------");
    }


    /**
     * methods to print voters and choices and result of each voting
     */
    public void printVoters () {
        for (Person person : voters) {
            System.out.println("Firstname : " + person.getFirstname() + " | Lastname : " + person.getLastname());
        }
    }
    public void printChoices () {
        int i = 1;
        for (String choice : choices.keySet()) {
            System.out.println("Choice #" + i + ": " + choice);
            i++;
        }
    }
    public void printResult () {
        System.out.println("Question : " + question);
        System.out.println();
        int i = 1;
        for (String choice : choices.keySet()) {
            System.out.println("choice #" + i + " : " + choice);
            i++;
            printVotesOfEachChoice(choice);
        }
    }
}

