package com.example.practo.hms.demo1.domain;

import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class BaseDomain implements Serializable {

    protected Timestamp created_time =  Timestamp.valueOf( LocalDateTime.now() );;
    protected Timestamp mod_time = Timestamp.valueOf( LocalDateTime.now() ); ;
    protected String created_by;
    protected String mod_user;
    protected Character status;

    public BaseDomain(Timestamp created_time, Timestamp mod_time, String created_by, String mod_user, Character status) {
        this.created_time = created_time;
        this.mod_time = mod_time;
        this.created_by = created_by;
        this.mod_user = mod_user;
        this.status = status;
    }

    public BaseDomain() {
    }


    @Column(name = "created_time" , nullable = false)
    public Timestamp getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Timestamp created_time) {
        this.created_time = created_time;
    }

    @Column(name = "mod_time" , nullable = false)
    public Timestamp getMod_time() {
        return mod_time;
    }

    public void setMod_time(Timestamp mod_time) {
        this.mod_time = mod_time;
    }

    @Column(name = "created_by" ,length = 100, nullable = false)
    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Column(name = "mod_user" , length = 100, nullable = false)
    public String getMod_user() {
        return mod_user;
    }

    public void setMod_user(String mod_user) {
        this.mod_user = mod_user;
    }

    @Column(name = "mod_user" , length = 1, nullable = false)
    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }




}
