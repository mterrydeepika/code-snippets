package com.timbuchalka;

public class Main {
    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.
    public static void main(String[] args)
    {
        FootballPlayer fbplayer1 = new FootballPlayer("David Bekham");
        FootballPlayer fbplayer2 = new FootballPlayer("Lionel Messi");
        FootballPlayer fbplayer3 = new FootballPlayer("Karim Benzema");
        FootballPlayer fbplayer4 = new FootballPlayer("Frank Riberi");


        SoccerPlayer scplayer1 = new SoccerPlayer("Christiano Ronaldo");
        BaseballPlayer bsplayer1= new BaseballPlayer("Babe Ruth");

        Team<FootballPlayer> FbTeam = new Team<>("Manchester United");
        boolean result = FbTeam.addPlayer(fbplayer1);
        System.out.println("Result of adding is "+result);
        result = FbTeam.addPlayer(fbplayer2);
        System.out.println("Result of adding is "+result);
         result = FbTeam.addPlayer(fbplayer1);
        System.out.println("Result of adding is "+result);
        Team<FootballPlayer> FbTeam1 = new Team<>("Arsenal");
         result = FbTeam1.addPlayer(fbplayer3);
         result = FbTeam1.addPlayer(fbplayer4);
        Team<FootballPlayer> FbTeam2 = new Team<>("Everton");
        Team<FootballPlayer> FbTeam3 = new Team<>("LiverPool");
        Team<FootballPlayer> FbTeam4 = new Team<>("Chelsea");

        Team<BaseballPlayer> BBTeam = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> SCTeam = new Team<>("Everton");




        FbTeam.matchResult(FbTeam1,3,4);
        FbTeam1.matchResult(FbTeam2,1,0);
        FbTeam2.matchResult(FbTeam3,1,9);
        FbTeam3.matchResult(FbTeam4,5,7);

        System.out.println(FbTeam.getName()+ " " + FbTeam.ranking());
        System.out.println(FbTeam1.getName()+ " " + FbTeam1.ranking());
        System.out.println(FbTeam2.getName()+ " " + FbTeam2.ranking());
        System.out.println(FbTeam3.getName()+ " " + FbTeam3.ranking());
        System.out.println(FbTeam4.getName()+ " " + FbTeam4.ranking());


        System.out.println(FbTeam.numPlayers());
        System.out.println(FbTeam.compareTo(FbTeam1));
        System.out.println(FbTeam1.compareTo(FbTeam));

        League<Team<FootballPlayer>> FBLeague= new League("NFL");
        FBLeague.addTeam(FbTeam);
        FBLeague.addTeam(FbTeam1);
        FBLeague.addTeam(FbTeam2);
        FBLeague.addTeam(FbTeam3);
        FBLeague.addTeam(FbTeam4); //Dup
        FBLeague.addTeam(FbTeam);   //Dup
        //FBLeague.addTeam(BBTeam);
       //FBLeague.addTeam(SCTeam);
       //FBLeague.addTeam("hi");

        FBLeague.leagueTable();






    }

}

