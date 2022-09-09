package com.example.practo.hms.demo1.domain;

import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.sql.Timestamp;

@Entity
@Table(name= "relation_master")
@Where(clause = "status = active")
public class Relationship extends BaseDomain {
    private Long relation_id;
    private String relation;

    public Relationship() {
    }

    public Relationship(String relation) {
        this.relation = relation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "relation_id",  nullable = false)
    public Long getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(Long relation_id) {
        this.relation_id = relation_id;
    }

    @Column(name = "realation", length = 15,  nullable = false)
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
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

