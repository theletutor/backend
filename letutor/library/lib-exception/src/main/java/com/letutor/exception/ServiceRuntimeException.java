package com.letutor.exception;

import lombok.Getter;
import org.slf4j.Marker;

@Getter
public class ServiceRuntimeException extends RuntimeException{
  private String errorCode;
  private String errorTitle;
  private IErrorType errorType;
  private Marker marker;


}
