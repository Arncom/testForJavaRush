package com.game.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "player")
public class Player {

    public Player() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "title")
    private String title;
    @Column(name = "race")
    @Enumerated(value = EnumType.STRING)
    private Race race;
    @Column(name = "profession")
    @Enumerated(value = EnumType.STRING)
    private Profession profession;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "banned")
    private Boolean banned;
    @Column(name = "experience")
    private Integer experience;
    @Column(name = "level")
    private Integer level;
    @Column(name = "untilNextLevel")
    private Integer untilNextLevel;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "race")
    @Enumerated(value = EnumType.STRING)
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
    @Column(name = "profession")
    @Enumerated(value = EnumType.STRING)
    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getUntilNextLevel() {
        return untilNextLevel;
    }

    public void setUntilNextLevel(Integer untilNextLevel) {
        this.untilNextLevel = untilNextLevel;
    }
}
