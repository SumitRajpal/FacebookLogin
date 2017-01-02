package com.example.sumit.facebooklogin;

import com.sromku.simple.fb.Permission;
import com.sromku.simple.fb.SimpleFacebookConfiguration;

/**
 * Created by sumit on 1/2/2017.
 */

public class MyConfiguration {
    Permission[] permissions=new Permission[]{Permission.EMAIL,Permission.PUBLISH_ACTION,Permission.USER_POSTS,Permission.USER_HOMETOWN,Permission.USER_LOCATION,Permission.USER_BIRTHDAY,Permission.PUBLIC_PROFILE};
    static final String APP_ID="230917317302438";
    public SimpleFacebookConfiguration getMyConfig(){
        SimpleFacebookConfiguration configs=new SimpleFacebookConfiguration.Builder()
                .setAppId(APP_ID)
                .setNamespace("facebooklogin")
                .setPermissions(permissions).build();
        return configs;
    }
}