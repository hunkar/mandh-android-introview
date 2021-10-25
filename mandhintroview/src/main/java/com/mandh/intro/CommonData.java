package com.mandh.intro;

import java.util.ArrayList;

public class CommonData {
    /**
     * Data that is storing information of intro views.
     */
    private static ArrayList<IntroData> data;

    /**
     * Get data
     *
     * @return ArrayList<IntroData> data
     */
    public static ArrayList<IntroData> getData() {
        return data;
    }

    /**
     * Set data
     *
     * @param data ArrayList<IntroData>
     */
    public static void setData(ArrayList<IntroData> data) {
        CommonData.data = data;
    }

    /**
     * Event listener which is called on skip
     */
    public static EventCallback<Boolean> onSkipListener;

    /**
     * Event listener which is called on done
     */
    public static EventCallback<Boolean> onDoneListener;
}
