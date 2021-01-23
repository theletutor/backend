package com.letutor.exception.handler;

import static com.letutor.exception.CommonErrorType.ERR000;
import static com.letutor.logging.BaseLoggingMarkers.APPLICATION_ERROR;

import com.letutor.exception.ServiceRuntimeException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Object> handleControllerException(WebRequest req, Exception ex) {
    log.error(APPLICATION_ERROR, ex.getMessage(), ex);
    try {
      return super.handleException(ex, req);
    } catch (Exception ignored) {

    }
    ExceptionDetails exceptionDetails = new ExceptionDetails();
    exceptionDetails.setError(ERR000.getErrorMessage());
    exceptionDetails.setErrorCode(ERR000.getErrorCode());
    exceptionDetails.setErrorTitle(ERR000.getErrorTitle());
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionDetails);
  }

  @ExceptionHandler({ServiceRuntimeException.class})
  public ResponseEntity<ExceptionDetails> handleServiceRuntimeException(
      ServiceRuntimeException ex) {
    HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
    if (ex.getErrorType() != null && ex.getErrorType().getStatusCode() != null) {
      status = ex.getErrorType().getStatusCode();
    }
    return new ResponseEntity<>(new ExceptionDetails(ex), status);
  }

  @Data
  @NoArgsConstructor
  private static class ExceptionDetails {

    private String errorCode;
    private String errorTitle;
    private String error;
    private boolean success;

    private ExceptionDetails(ServiceRuntimeException ex) {
      success = false;
      this.error = ex.getMessage();
      this.errorCode = ex.getErrorCode();
      this.errorTitle = ex.getErrorTitle();
    }
  }
}
