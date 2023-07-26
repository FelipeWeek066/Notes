package com.study.Notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.Notes.entities.Note;
import com.study.Notes.repositories.NoteRepository;

@Service
public class NoteService {
	@Autowired
	NoteRepository repository;
	
	public List<Note> findAll(){
		return repository.findAll();
	}
	
	public Note findById(Long id){
		return repository.findById(id).get();
	}
	
	public Note addNote(Note note) {
		return repository.save(note);
	}
	
	public void remNote(Long id) {
		repository.deleteById(id);
	}
}
