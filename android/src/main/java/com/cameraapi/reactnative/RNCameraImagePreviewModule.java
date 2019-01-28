
package com.cameraapi.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNCameraImagePreviewModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCameraImagePreviewModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCameraImagePreview";
  }
}