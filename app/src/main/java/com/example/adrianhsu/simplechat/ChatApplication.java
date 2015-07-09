package com.example.adrianhsu.simplechat;
import android.app.Application;
import com.parse.Parse;

/**
 * Created by AdrianHsu on 15/7/9.
 */
public class ChatApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "waWZC7akbFATZdNVVQoVwZFQTGhjA6EtKrNSKkfu";
    public static final String YOUR_CLIENT_KEY = "VdzwKboi6H75t94kILHuqY8SlEnkUpFpqRi7UGQz";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
