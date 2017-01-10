package com.example.csaper6.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button aButton, bButton, bFlatButton, cButton, cSharpButton, dButton, dSharpButton,
            eButton, fButton, fSharpButton, gButton, gSharpButton, highEButton, highFButton,
            highFSharpButton, highGButton, highAButton, highBButton, highBFlatButton,
            highCButton, highCSharpButton, highDButton, highDSharpButton, highGSharpButton,
            randomButton, exterminateButton;
    private MediaPlayer aNote, bNote, bFlatNote, cNote, cSharpNote, dNote, dSharpNote,
            eNote, fNote, fSharpNote, gNote, gSharpNote, highENote, highFNote,
            highFSharpNote, highGNote, highANote, highBNote, highBFlatNote, highCNote,
            highCSharpNote, highDNote, highDSharpNote, highGSharpNote, random1, random2,
            random3, random4, random5, random6, random7, random8, exterminate, random9, random10;

    private ArrayList<MediaPlayer> randomList;
    private int numOfRandom;
    private int randomIndex;
    private int previousIndex;
    private int placeholderIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        loadMediaFiles();
        randomList = new ArrayList<>();
        randomList.add(aNote);//placeholder note
        randomList.add(random1);
        randomList.add(random2);
        randomList.add(random3);
        randomList.add(random4);
        randomList.add(random5);
        randomList.add(random6);
        randomList.add(random7);
        randomList.add(random8);
        randomList.add(random9);
        randomList.add(random10);
        numOfRandom = randomList.size();

    }

    private void loadMediaFiles() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        bFlatNote = MediaPlayer.create(this, R.raw.scalebb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        cSharpNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dSharpNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fSharpNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gSharpNote = MediaPlayer.create(this, R.raw.scalegs);
        highANote = MediaPlayer.create(this, R.raw.scalehigha);
        highBNote = MediaPlayer.create(this, R.raw.scalehighb);
        highBFlatNote = MediaPlayer.create(this, R.raw.scalehighbb);
        highCNote = MediaPlayer.create(this, R.raw.scalehighc);
        highCSharpNote = MediaPlayer.create(this, R.raw.scalehighcs);
        highDNote = MediaPlayer.create(this, R.raw.scalehighd);
        highDSharpNote = MediaPlayer.create(this, R.raw.scalehighds);
        highENote = MediaPlayer.create(this, R.raw.scalehighe);
        highFNote = MediaPlayer.create(this, R.raw.scalehighf);
        highFSharpNote = MediaPlayer.create(this, R.raw.scalehighfs);
        highGNote = MediaPlayer.create(this, R.raw.scalehighg);
        highGSharpNote = MediaPlayer.create(this, R.raw.scalehighgs);
        random1 = MediaPlayer.create(this, R.raw.elmer_be_very_quiet);
        random2 = MediaPlayer.create(this, R.raw.bugs_whats_up_doc);
        random3 = MediaPlayer.create(this, R.raw.tweety_puddy_tat);
        random4 = MediaPlayer.create(this, R.raw.cat);
        random5 = MediaPlayer.create(this, R.raw.familyguy1);
        random6 = MediaPlayer.create(this, R.raw.familyguy2);
        random7 = MediaPlayer.create(this, R.raw.starwars);
        random8 = MediaPlayer.create(this, R.raw.terminator);
        exterminate = MediaPlayer.create(this, R.raw.exterminate);
        random9 = MediaPlayer.create(this, R.raw.spaceballs);
        random10 = MediaPlayer.create(this, R.raw.harrypotter);


    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        bFlatButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        cSharpButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dSharpButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fSharpButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gSharpButton.setOnClickListener(this);
        highAButton.setOnClickListener(this);
        highBButton.setOnClickListener(this);
        highBFlatButton.setOnClickListener(this);
        highCButton.setOnClickListener(this);
        highCSharpButton.setOnClickListener(this);
        highDButton.setOnClickListener(this);
        highDSharpButton.setOnClickListener(this);
        highEButton.setOnClickListener(this);
        highFButton.setOnClickListener(this);
        highFSharpButton.setOnClickListener(this);
        highGButton.setOnClickListener(this);
        highGSharpButton.setOnClickListener(this);
        randomButton.setOnClickListener(this);
        exterminateButton.setOnClickListener(this);
    }

    private void wireWidgets() {

        aButton = (Button) findViewById(R.id.button_a);
        bButton = (Button) findViewById(R.id.button_b);
        bFlatButton = (Button) findViewById(R.id.button_bflat);
        cButton = (Button) findViewById(R.id.button_c);
        cSharpButton = (Button) findViewById(R.id.button_csharp);
        dButton = (Button) findViewById(R.id.button_d);
        dSharpButton = (Button) findViewById(R.id.button_dsharp);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fSharpButton = (Button) findViewById(R.id.button_fsharp);
        gButton = (Button) findViewById(R.id.button_g);
        gSharpButton = (Button) findViewById(R.id.button_gsharp);
        highAButton = (Button) findViewById(R.id.button_higha);
        highBButton = (Button) findViewById(R.id.button_highb);
        highBFlatButton = (Button) findViewById(R.id.button_highbflat);
        highCButton = (Button) findViewById(R.id.button_highc);
        highDButton = (Button) findViewById(R.id.button_highd);
        highDSharpButton = (Button) findViewById(R.id.button_highdsharp);
        highEButton = (Button) findViewById(R.id.button_highe);
        highFButton = (Button) findViewById(R.id.button_highf);
        highFSharpButton = (Button) findViewById(R.id.button_highfsharp);
        highGButton = (Button) findViewById(R.id.button_highg);
        highGSharpButton = (Button) findViewById(R.id.button_highgsharp);
        highCSharpButton = (Button) findViewById(R.id.button_highcsharp);
        randomButton = (Button) findViewById(R.id.button_random);
        exterminateButton = (Button) findViewById(R.id.button_exterminate);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_a :
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_b :
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_bflat :
                bFlatNote.seekTo(0);
                bFlatNote.start();
                break;
            case R.id.button_c :
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_csharp :
                cSharpNote.seekTo(0);
                cSharpNote.start();
                break;
            case R.id.button_d :
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_dsharp :
                dSharpNote.seekTo(0);
                dSharpNote.start();
                break;
            case R.id.button_e :
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f :
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fsharp :
                fSharpNote.seekTo(0);
                fSharpNote.start();
                break;
            case R.id.button_g :
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gsharp :
                gSharpNote.seekTo(0);
                gSharpNote.start();
                break;
            case R.id.button_higha :
                highANote.seekTo(0);
                highANote.start();
                break;
            case R.id.button_highb :
                highBNote.seekTo(0);
                highBNote.start();
                break;
            case R.id.button_highbflat :
                highBFlatNote.seekTo(0);
                highBFlatNote.start();
                break;
            case R.id.button_highc :
                highCNote.seekTo(0);
                highCNote.start();
                break;
            case R.id.button_highcsharp :
                highCSharpNote.seekTo(0);
                highCSharpNote.start();
                break;
            case R.id.button_highd :
                highDNote.seekTo(0);
                highDNote.start();
                break;
            case R.id.button_highdsharp :
                highDSharpNote.seekTo(0);
                highDSharpNote.start();
                break;
            case R.id.button_highe :
                highENote.seekTo(0);
                highENote.start();
                break;
            case R.id.button_highf :
                highFNote.seekTo(0);
                highFNote.start();
                break;
            case R.id.button_highfsharp :
                highFSharpNote.seekTo(0);
                highFSharpNote.start();
                break;
            case R.id.button_highg :
                highGNote.seekTo(0);
                highGNote.start();
                break;
            case R.id.button_highgsharp :
                highGSharpNote.seekTo(0);
                highGSharpNote.start();
                break;
            case R.id.button_random :
                playRandom();
                randomList.get(previousIndex).pause();
                randomList.get(previousIndex).seekTo(0);
                randomList.get(randomIndex).seekTo(0);
                randomList.get(randomIndex).start();
                Log.d("look here", "random:" + randomIndex + " previous:" + previousIndex + " placeholder:" + placeholderIndex);
                break;
            case R.id.button_exterminate :
                exterminate.seekTo(0);
                exterminate.start();
                break;

        }
    }

    private void playRandom() {
        previousIndex = placeholderIndex;
        int num = (int)((Math.random() * numOfRandom));
        while(num==previousIndex || num==0){
            num = (int)((Math.random() * numOfRandom));
        }

        placeholderIndex = num;
        randomIndex = num;






        }
    }



