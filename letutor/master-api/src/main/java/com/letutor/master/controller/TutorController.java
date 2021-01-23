package com.letutor.master.controller;

import com.letutor.master.dto.response.AllTutorDetailsResponse;
import com.letutor.master.dto.response.TutorDetailsResponse;
import com.letutor.master.service.ITutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/tutors")
public class TutorController {

  private final ITutorService tutorService;

  public TutorController(ITutorService tutorService){
    this.tutorService = tutorService;
  }

  @GetMapping(value = "/all")
  public AllTutorDetailsResponse getAllTutors(){
    return tutorService.getDetailsOfAllTutors();
  }

  @GetMapping(value = "/{id}")
  public TutorDetailsResponse getTutorDetails(@PathVariable String id){
    return tutorService.getDetailsOfTutor(id);
  }
}
