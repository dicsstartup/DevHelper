package com.dicsstartup.devhelper.core.entitys;

import com.dicsstartup.devhelper.core.util.PasswordConverter;
import jakarta.persistence.CascadeType;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Didier Piracoca
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NICK", length = 100, nullable = false)
    private String nick;

    @Column(name = "PASSWORD", length = 256)
    @Convert(converter = PasswordConverter.class)
    private String password;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Archive> general_archives = new ArrayList<>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Credential> general_credentials = new ArrayList<>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reminder> reminders = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Archive> getGeneral_archives() {
        return general_archives;
    }

    public void setGeneral_archives(List<Archive> general_archives) {
        this.general_archives = general_archives;
    }

    public List<Credential> getGeneral_credentials() {
        return general_credentials;
    }

    public void setGeneral_credentials(List<Credential> general_credentials) {
        this.general_credentials = general_credentials;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Reminder> getNotes() {
        return reminders;
    }

    public void setNotes(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nick=" + nick + '}';
    }

}
