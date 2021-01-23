package com.letutor.logging;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public interface BaseLoggingMarkers {
  Marker APPLICATION_ERROR = MarkerFactory.getMarker("APPLICATION_ERROR");
}
