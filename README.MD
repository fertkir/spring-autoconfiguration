# Spring AutoConfiguration sample

## Build
```
 ./gradlew clean install -p autoconfig-library
 ./gradlew clean build -p autoconfig-test
```
 
## Run
Just run `DemoApplication` from `autoconfig-test` module.

### Profiles
#### without profiles
The following error will be shown:<br/>
```
Parameter 0 of method runner in com.example.autoconfig.test.DemoApplication required a bean of type 'com.example.autoconfig.library.HttpClient' that could not be found.
        - Bean method 'httpClient' in 'HttpClientAutoConfiguration' not loaded because @ConditionalOnProperty (http.client.[url,user,password]) did not find properties 'url', 'user', 'pass
```
     
#### custom-bean
The client will get to http://vc.ru

#### auto-bean
The client will get to http://google.com

#### custom-bean,auto-bean
The manually declared bean will have higher priority.<br/>
The client will get to http://vc.ru
