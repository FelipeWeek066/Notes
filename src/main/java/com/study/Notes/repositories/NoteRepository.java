package com.study.Notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.study.Notes.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
