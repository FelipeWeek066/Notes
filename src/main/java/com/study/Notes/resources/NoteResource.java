package com.study.Notes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.Notes.entities.Note;
import com.study.Notes.services.NoteService;

@RestController
@RequestMapping(value = "/Notes")
public class NoteResource {
	
	@Autowired
	private NoteService service;
	
	@GetMapping
	public ResponseEntity<List<Note>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Note> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	public Note addNote(@RequestBody Note note) {
		return  service.addNote(note);
		
	}
	@PutMapping
	public Note editNote(@RequestBody Note note) {
		return service.addNote(note);
		
	}
	@DeleteMapping("/{id}")
	public Note remNote(@PathVariable Long id) {
		Note note = service.findById(id);
		service.remNote(id);
		return note;
	}

}
