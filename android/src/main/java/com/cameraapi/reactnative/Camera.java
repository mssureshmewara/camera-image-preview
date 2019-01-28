package com.cameraapi.reactnative;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.support.v4.content.ContextCompat;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class Camera extends ReactContextBaseJavaModule{

    private ReactApplicationContext reactContext;


    public Camera(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @ReactMethod
    public void checkCameraPermission(Promise promise)
    {
        if (ContextCompat.checkSelfPermission(reactContext,
                Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            promise.resolve(false);
        } else {
            promise.resolve(true);
        }
    }

    @ReactMethod
    public void clickPhotos(Promise promise) {
        
    }

    @Override
    public String getName() {
        return "CheckLocationServiceIsEnabled";
    }
}
