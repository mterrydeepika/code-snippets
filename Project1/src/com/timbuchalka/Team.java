package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;
    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player)
    {
        if (members.contains(player))
    {
        System.out.println(player.getName() + " already part of team");
        return false;
    }
        else
        {
            members.add(player);
            System.out.println(player.getName() + " added to team " + this.name);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int yourScore, int theirScore )
    {
        String message;
    if(yourScore>theirScore) {
        message = " beat ";
        won++;
    }
    else if(yourScore<theirScore)
    {
        message=" lost to ";
        lost++;
    }
    else
    {
        message=" drew with ";
        tied++;
    }
    played++;
    if(null!=opponent)
    {
        System.out.println(this.name + message + opponent.getName());
        opponent.matchResult(null,theirScore,yourScore);
    }
    }
    public int ranking()
    {
        return (won*2)+tied;
    }

    public int numPlayers()
    {
        return this.members.size();
    }

    public int compareTo(Team<T> team)
    {
        if (this.ranking() > team.ranking())
            return -1;
        else if (this.ranking() == team.ranking())
            return 0;
        else return 1;

    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
