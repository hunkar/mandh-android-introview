package com.mandh.intro;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import java.util.ArrayList;


public class Intro {
    private Context context;
    private ArrayList<IntroData> introData;
    private static SharedPreferences preferences;
    private static String key = "mandh-intro-view-storage";

    /**
     * Constructor of Mandh Intro View
     * @param context Activity context
     * @param introData ArrayList of IntroData objects
     */
    public Intro(Context context, ArrayList<IntroData> introData) {
        this.context = context;
        this.introData = introData;
    }

    /**
     * Configuration of SharedPreferences
     */
    public void setPreferences() {
        preferences = this.context.getSharedPreferences(key, this.context.MODE_PRIVATE);
    }

    /**
     * Set initial show status. If showState is false intro will be shown automatically.
     * @param showState
     */
    public void setShowState(boolean showState) {
        setPreferences();

        SharedPreferences.Editor prefsEditor = preferences.edit();
        prefsEditor.putBoolean("ShowState", showState);
        prefsEditor.apply();
    }

    /**
     * Get initial show status
     * @return Boolean showState
     */
    public boolean getShowState() {
        setPreferences();

        return preferences != null && preferences.getBoolean("ShowState", false);
    }

    /**
     * This method check initial show status. If false, intro will be show automatically.
     * You need to put this your initial activity if you want to show intro on first opening of app.
     */
    public void checkAndShowIntro() {
        if (!getShowState()) {
            showIntro();
        }
    }

    /**
     * This method shows intro directly. It isn't depends on initial show state.
     * You may use this method if you want to show intro later. For example from Menu.
     */
    public void showIntro() {
        if (introData != null && introData.size() > 0) {
            CommonData.setData(introData);
            CommonData.onDoneListener = data -> setShowState(true);
            CommonData.onSkipListener = data -> setShowState(true);

            Intent toIntro = new Intent(context, IntroActivity.class);
            context.startActivity(toIntro);
        }
    }
}
