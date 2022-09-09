package com.example.practo.hms.demo1.domain;

import javax.persistence.*;

import org.hibernate.annotations.Where;

import java.sql.Timestamp;

@Entity
@Table(name= "next_of_kin_details")
@Where(clause = "status = active")
public class NextOfKin extends BaseDomain {


    private Long nextOfKinId;
    private String mr_no;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String contactNo;
    private String countryCode;

    private Relationship relationId;

    public NextOfKin() {
    }



    public NextOfKin(String mr_no, String firstName, String middleName, String lastName, String address, String contactNo, String countryCode, Relationship relationId) {
        this.mr_no = mr_no;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.contactNo = contactNo;
        this.countryCode = countryCode;
        this.relationId = relationId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getNextOfKinId() {
        return nextOfKinId;
    }

    public void setNextOfKinId(Long nextOfKinId) {
        this.nextOfKinId = nextOfKinId;
    }

    @Column(name = "mr_no", length = 15,  nullable = false)
    public String getMr_no() {
        return mr_no;
    }

    public void setMr_no(String mr_no) {
        this.mr_no = mr_no;
    }

    @Column(name = "firstName", length = 255 )
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName", length = 255)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "middleName", length = 255 )
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "address", length = 512 )
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "contactNo", length = 20 )
    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Column(name = "countryCode", length = 10 )
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "relation_id")
    public Relationship getRelationId() {
        return relationId;
    }

    public void setRelationId(Relationship relationId) {
        this.relationId = relationId;
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

