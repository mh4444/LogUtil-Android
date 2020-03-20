package mh.dev.errorutil;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class ErrorDebug {

    public void erroDebug(String message){
        Log.d("Debug " + TAG, "erroDebug: "+message);
    }

}
