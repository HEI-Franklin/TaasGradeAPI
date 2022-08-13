package com.taas.TaasGradeApi.controller;

import com.taas.TaasGradeApi.model.Grade;
import com.taas.TaasGradeApi.model.Grade_french;
import com.taas.TaasGradeApi.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteRepository {

    @Autowired
    private final NoteService noteService;

    @GetMapping("/allGrade")
    public List <Grade> getAll(){
        return this.noteService.getAllNotes();
    }

    @GetMapping("/Allinfoabout")
    public List getALlInfoAbout(){
        return this.noteService.findAllGrade();
    }

}
