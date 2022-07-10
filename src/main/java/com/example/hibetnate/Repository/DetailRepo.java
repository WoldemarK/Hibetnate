package com.example.hibetnate.Repository;

import com.example.hibetnate.model.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepo extends JpaRepository<Detail, Long> {

  }


