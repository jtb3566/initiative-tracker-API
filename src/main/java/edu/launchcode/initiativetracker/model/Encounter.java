package edu.launchcode.initiativetracker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Encounter {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToMany
    private final List<CreatedCharacter> characters = new ArrayList<>();

    private String monsters = "";

    public Encounter(Integer id, String name, String monsters) {
        this.id = id;
        this.name = name;
        this.monsters = monsters;
    }

    public String getMonsters() {
        return this.monsters;
    }

    public void setMonsters(String monsters) {
        this.monsters = monsters;
    }

    public Encounter monsters(String monsters) {
        setMonsters(monsters);
        return this;
    }

    public Encounter(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Encounter() {
    }

    public Encounter(Integer id, String name, List<CreatedCharacter> characters) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CreatedCharacter> getCharacters() {
        return this.characters;
    }

    public Encounter id(Integer id) {
        setId(id);
        return this;
    }

    public Encounter name(String name) {
        setName(name);
        return this;
    }

    public void addCharacter (CreatedCharacter character) {
        characters.add(character);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Encounter)) {
            return false;
        }
        Encounter encounter = (Encounter) o;
        return Objects.equals(id, encounter.id) && Objects.equals(name, encounter.name) && Objects.equals(characters, encounter.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, characters);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", characters='" + getCharacters() + "'" +
            "}";
    }
    
}
