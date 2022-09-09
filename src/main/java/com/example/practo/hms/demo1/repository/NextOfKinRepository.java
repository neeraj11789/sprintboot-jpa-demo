package com.example.practo.hms.demo1.repository;

import com.example.practo.hms.demo1.domain.NextOfKin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NextOfKinRepository extends JpaRepository<NextOfKin, Long> {
}
