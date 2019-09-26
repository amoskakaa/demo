package com.ics.demo.Spring.Repositories;

import com.ics.demo.Spring.Models.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository  extends JpaRepository<University, Long> {

}
