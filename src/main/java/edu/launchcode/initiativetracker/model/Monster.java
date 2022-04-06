package edu.launchcode.initiativetracker.model;

import java.util.Objects;

public class Monster {
    private String name;
    private Integer initiativeMod;
    private Integer armorClass;


    public Monster() {
    }

    public Monster(String name, Integer initiativeMod, Integer armorClass) {
        this.name = name;
        this.initiativeMod = initiativeMod;
        this.armorClass = armorClass;
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

    public Monster name(String name) {
        setName(name);
        return this;
    }

    public Monster initiativeMod(Integer initiativeMod) {
        setInitiativeMod(initiativeMod);
        return this;
    }

    public Monster armorClass(Integer armorClass) {
        setArmorClass(armorClass);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Monster)) {
            return false;
        }
        Monster monster = (Monster) o;
        return Objects.equals(name, monster.name) && Objects.equals(initiativeMod, monster.initiativeMod) && Objects.equals(armorClass, monster.armorClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, initiativeMod, armorClass);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", initiativeMod='" + getInitiativeMod() + "'" +
            ", armorClass='" + getArmorClass() + "'" +
            "}";
    }

}
