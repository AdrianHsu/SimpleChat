package com.example.adrianhsu.simplechat;

/**
 * Created by AdrianHsu on 15/7/9.
 */
import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ChatApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "waWZC7akbFATZdNVVQoVwZFQTGhjA6EtKrNSKkfu";
    public static final String YOUR_CLIENT_KEY = "VdzwKboi6H75t94kILHuqY8SlEnkUpFpqRi7UGQz";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        // Register your parse models here
        ParseObject.registerSubclass(Message.class);
        // Existing initialization happens after all classes are registered
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }

}
