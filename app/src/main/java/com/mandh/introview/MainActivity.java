package com.mandh.introview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.mandh.intro.Intro;
import com.mandh.intro.IntroData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button show;
    Intro intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setDefinitions();
        setActions();
    }

    /**
     * Create intro datas and show button
     */
    private void setDefinitions() {
        ArrayList<IntroData> introData = new ArrayList<>();
        introData.add(new IntroData("Title-1", "Description-1",
                R.drawable.intro_first));
        introData.add(new IntroData("Title-2", "Description-2",
                R.drawable.intro_second));

        intro = new Intro(MainActivity.this, introData);
        show = findViewById(R.id.show_intro);

        intro.checkAndShowIntro();
    }

    /**
     * Set show button click
     */
    private void setActions() {
        show.setOnClickListener(v -> intro.showIntro());

    }
}