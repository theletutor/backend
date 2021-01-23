package com.letutor.exception;

import com.letutor.logging.BaseLoggingMarkers;
import lombok.AllArgsConstructor;
import org.slf4j.Marker;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum CommonErrorType implements IErrorType{

  ERR000("Oops! Something went wrong", "Oops! Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR, BaseLoggingMarkers.APPLICATION_ERROR);

  private final String errorTitle;
  private final String errorMessage;
  private final HttpStatus httpStatusCode;
  private final Marker marker;

  @Override
  public String getErrorCode() {
    return this.name();
  }

  @Override
  public String getErrorTitle() {
    return errorTitle;
  }

  @Override
  public String getErrorMessage() {
    return errorMessage;
  }

  @Override
  public HttpStatus getStatusCode() {
    return httpStatusCode;
  }

  @Override
  public Marker getMarker() {
    return marker;
  }
}
