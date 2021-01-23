package com.letutor.master.service;

import com.letutor.master.dto.response.AllTutorDetailsResponse;
import com.letutor.master.dto.response.TutorDetailsResponse;

public interface ITutorService {
  AllTutorDetailsResponse getDetailsOfAllTutors();
  TutorDetailsResponse getDetailsOfTutor(String id);
}
