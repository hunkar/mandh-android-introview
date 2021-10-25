package com.mandh.intro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;

import org.jetbrains.annotations.Nullable;

public class IntroActivity extends AppIntro {

    /**
     * Get intro data from CommonData and add to slide view.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (CommonData.getData() != null && CommonData.getData().size() > 0) {
            for (IntroData data : CommonData.getData()) {
                AppIntroFragment fragment = AppIntroFragment.newInstance(
                        data.getTitle(),
                        data.getDescription(),
                        data.getImage(),
                        data.getBacgroundColor(),
                        data.getTitleColor(),
                        data.getDescriptionColor(),
                        data.getTitleFont(),
                        data.getDescriptionFont(),
                        data.getBackgroundImage()
                );
                addSlide(fragment);
            }
        }
    }

    /**
     * Event which is fired on skip
     *
     * @param currentFragment
     */
    @Override
    protected void onSkipPressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);

        if (CommonData.onSkipListener != null) {
            finish();
            CommonData.onSkipListener.onEvent(true);
        }
    }

    /**
     * Event which is fired on done
     *
     * @param currentFragment
     */
    @Override
    protected void onDonePressed(@Nullable Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        if (CommonData.onDoneListener != null) {
            finish();
            CommonData.onDoneListener.onEvent(true);
        }
    }

    /**
     * Event which is fired on back pressed. It is added for prevent hard back button event.
     */
    @Override
    public void onBackPressed() {
    }
}