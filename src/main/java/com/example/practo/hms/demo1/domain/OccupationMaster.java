package com.example.practo.hms.demo1.domain;


import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name= "occupation_master")
@Where(clause = "status = active")
public class OccupationMaster extends BaseDomain {


    private Long occupationId;
    private String occupation;
    private String code;
    private String details;

    public OccupationMaster() {
    }

    public OccupationMaster(String occupation, String code, String details) {
        this.occupation = occupation;
        this.code = code;
        this.details = details;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "occupationId",  nullable = false)
    public Long getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Long occupationId) {
        this.occupationId = occupationId;
    }

    @Column(name = "occupation",  length = 100,  nullable = false)
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Timestamp getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Timestamp created_time) {
        this.created_time = created_time;
    }

    public Timestamp getMod_time() {
        return mod_time;
    }

    public void setMod_time(Timestamp mod_time) {
        this.mod_time = mod_time;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getMod_user() {
        return mod_user;
    }

    public void setMod_user(String mod_user) {
        this.mod_user = mod_user;
    }
}

