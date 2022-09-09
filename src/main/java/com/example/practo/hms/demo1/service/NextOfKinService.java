package com.example.practo.hms.demo1.service;

import com.example.practo.hms.demo1.domain.NextOfKin;
import com.example.practo.hms.demo1.domain.Relationship;
import com.example.practo.hms.demo1.repository.NextOfKinRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class NextOfKinService {

    @Autowired
    private NextOfKinRepository nextOfKinRepository;

    public void saveData(){
        NextOfKin nextOfKin = new NextOfKin();
        nextOfKin.setAddress("Nakshas kona prayagraj");
        nextOfKin.setContactNo("8318252235");
        nextOfKin.setCountryCode("91");
        nextOfKin.setFirstName("Gautam");
        nextOfKin.setMiddleName("Ji");
        nextOfKin.setLastName("Gupta");
        nextOfKin.setCreated_time(new Timestamp(System.currentTimeMillis()));
        nextOfKin.setMod_time(new Timestamp(System.currentTimeMillis()));
        nextOfKin.setCreated_by("Gautam Gupta");
        nextOfKin.setMod_user("Gautam gupta");
        nextOfKin.setStatus('A');
        nextOfKin.setMr_no("12345");

        Relationship relation = new Relationship();
        relation.setRelation_id(12345L);
        relation.setCreated_by("ravi");
        relation.setMod_user("swarna");
        relation.setCreated_time(new Timestamp(System.currentTimeMillis()));
        relation.setMod_time(new Timestamp(System.currentTimeMillis()));

        nextOfKin.setRelationId(relation);
        nextOfKinRepository.save(nextOfKin);

    }
}
