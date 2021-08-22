package com.rafael.badwordfilter.repository;

import com.rafael.badwordfilter.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long>{
}
