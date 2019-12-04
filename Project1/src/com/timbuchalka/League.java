package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<T> league = new ArrayList<>();

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " already added to league "+ this.getName());
            return false;
        } else {
            league.add(team);
            System.out.println(team.getName() + " successfully added to league "+ this.getName());
            return true;
        }
    }
    public void leagueTable()
    {
        System.out.println(league);
        Collections.sort(league);
        System.out.println(league);
        for(T team:league)
        {
           System.out.println(team.getName() + " : " + team.ranking());
        }

    }
}
