package com.example.practo.hms.demo1.resource;

import com.example.practo.hms.demo1.domain.NextOfKin;
import com.example.practo.hms.demo1.request.NextOfKinRequest;
import com.example.practo.hms.demo1.service.NextOfKinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/nextofkin")
@Slf4j
public class NextOfKinResource {

    @Autowired
    protected NextOfKinService service;

    @PostMapping()
    private ResponseEntity<NextOfKin> newClient(final @Valid @RequestBody NextOfKinRequest request){
        service.saveData();
        return ResponseEntity.status( HttpStatus.CREATED ).build();
    }
}
