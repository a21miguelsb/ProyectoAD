package model.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Partido implements Serializable {
    @Id
    private long id;
    private LocalDate date;
    private Equipo home_team;
    private Equipo visitor_team;
    private int home_team_score;
    private int visitor_team_score;
    private String status;
    private String time;
    private long season;
    private String period;
    private String postseason;

    public Partido() {
    }

    public Partido(long id, LocalDate date, Equipo home_team, Equipo visitor_team, int home_team_score, int visitor_team_score, String status, String time, long season, String period, String postseason) {
        this.id = id;
        this.date = date;
        this.home_team = home_team;
        this.visitor_team = visitor_team;
        this.home_team_score = home_team_score;
        this.visitor_team_score = visitor_team_score;
        this.status = status;
        this.time = time;
        this.season = season;
        this.period = period;
        this.postseason = postseason;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Equipo getHome_team() {
        return home_team;
    }

    public void setHome_team(Equipo home_team) {
        this.home_team = home_team;
    }

    public Equipo getVisitor_team() {
        return visitor_team;
    }

    public void setVisitor_team(Equipo visitor_team) {
        this.visitor_team = visitor_team;
    }

    public int getHome_team_score() {
        return home_team_score;
    }

    public void setHome_team_score(int home_team_score) {
        this.home_team_score = home_team_score;
    }

    public int getVisitor_team_score() {
        return visitor_team_score;
    }

    public void setVisitor_team_score(int visitor_team_score) {
        this.visitor_team_score = visitor_team_score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getSeason() {
        return season;
    }

    public void setSeason(long season) {
        this.season = season;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPostseason() {
        return postseason;
    }

    public void setPostseason(String postseason) {
        this.postseason = postseason;
    }
}
