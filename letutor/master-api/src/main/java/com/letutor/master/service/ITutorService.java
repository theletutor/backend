package com.letutor.master.service;

import com.letutor.master.dto.response.AllTutorDetailsResponse;
import com.letutor.master.dto.response.TutorDetailsResponse;

public interface ITutorService {
  AllTutorDetailsResponse getAllTutorDetails();
  TutorDetailsResponse getTutorDetails(String id);
}
