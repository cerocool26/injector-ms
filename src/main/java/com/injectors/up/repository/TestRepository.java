package com.injectors.up.repository;

import com.injectors.up.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
    @Query("SELECT t From Test AS t WHERE t.codigoPrueba = :code")
    Test findByCodeTest(UUID code);

}
