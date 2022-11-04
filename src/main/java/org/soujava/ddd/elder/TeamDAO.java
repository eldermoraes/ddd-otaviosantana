package org.soujava.ddd.elder;

public class TeamDAO implements ChampionLeague {

    @Override
    public Team subscribe(Team team) {
        TeamRelational relational = TeamRelational.of(team);
        //id? update: delete
        return relational.toTeam();
    }


    static class TeamRelational {

        public static TeamRelational of(Team team) {
            return new TeamRelational();
        }

        public Team toTeam() {
            return null;
        }
    }
}
