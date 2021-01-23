package com.letutor.exception;

import org.slf4j.Marker;
import org.springframework.http.HttpStatus;

public interface IErrorType {
  String getErrorCode();
  String getErrorTitle();
  String getErrorMessage();
  HttpStatus getStatusCode();
  Marker getMarker();

}
