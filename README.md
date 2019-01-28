
# react-native-camera-image-preview

## Getting started

`$ npm install react-native-camera-image-preview --save`

### Mostly automatic installation

`$ react-native link react-native-camera-image-preview`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.shellmonger.reactnative.RNCameraImagePreviewPackage;` to the imports at the top of the file
  - Add `new RNCameraImagePreviewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-camera-image-preview'
  	project(':react-native-camera-image-preview').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-camera-image-preview/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-camera-image-preview')
  	```


## Usage
```javascript
import RNCameraImagePreview from 'react-native-camera-image-preview';

// TODO: What to do with the module?
RNCameraImagePreview;
```
  