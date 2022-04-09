package edu.launchcode.initiativetracker.model;

import java.util.Map;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String email;

    private String displayName;

    private String passwordHash;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public User() {
    }

    public User(int id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.displayName = username;
        this.passwordHash = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public User email(String email) {
        setEmail(email);
        return this;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(email, user.email) && Objects.equals(displayName, user.displayName) && Objects.equals(passwordHash, user.passwordHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, displayName, passwordHash);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", Display Name='" + getDisplayName() + "'" +
            "}";
    }

    public Map<String, ?> getId() {
        return null;
    }

}
