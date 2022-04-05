package edu.launchcode.initiativetracker.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CreatedCharacter {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique=true)
    private String name;
    private Integer initiativeMod;
    private Integer armorClass;

    public CreatedCharacter() {
    }

    public CreatedCharacter(Integer id, String name, Integer initiativeMod, Integer armorClass) {
        this.id = id;
        this.name = name;
        this.initiativeMod = initiativeMod;
        this.armorClass = armorClass;
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

    public Integer getInitiativeMod() {
        return this.initiativeMod;
    }

    public void setInitiativeMod(Integer initiativeMod) {
        this.initiativeMod = initiativeMod;
    }

    public Integer getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(Integer armorClass) {
        this.armorClass = armorClass;
    }

    public CreatedCharacter id(Integer id) {
        setId(id);
        return this;
    }

    public CreatedCharacter name(String name) {
        setName(name);
        return this;
    }

    public CreatedCharacter initiativeMod(Integer initiativeMod) {
        setInitiativeMod(initiativeMod);
        return this;
    }

    public CreatedCharacter armorClass(Integer armorClass) {
        setArmorClass(armorClass);
        return this;
    }


    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreatedCharacter)) {
            return false;
        }
        CreatedCharacter character = (CreatedCharacter) o;
        return Objects.equals(id, character.id) && Objects.equals(name, character.name) && Objects.equals(initiativeMod, character.initiativeMod) && Objects.equals(armorClass, character.armorClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, initiativeMod, armorClass);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", initiativeMod='" + getInitiativeMod() + "'" +
            ", armorClass='" + getArmorClass() + "'" +
            "}";
    }

}
