package kru.somwang.makwat.testdice;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice;
    private Button btnback, btnran, btnnext;
    private int intdice = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();

        btnback();
        btnran();
        btnnext();
    }

    private void btnnext() {
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice += 1;
                if (intdice == 7) {
                    intdice = 1;
                }
                changeplay(intdice);
            }
        });
    }

    private void btnran() {
        btnran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRandomPicture(intdice);

            }
        });
    }

    private void btnback() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intdice -= 1;
                if (intdice ==0)    {
                    intdice = 6;
                }
            changeplay(intdice);


            }
        });
    }

    private void bindWidget() {
        imageDice = (ImageView) findViewById(R.id.imageDice);
        btnback = (Button) findViewById(R.id.btnback);
        btnran = (Button) findViewById(R.id.btnran);
        btnnext = (Button) findViewById(R.id.btnnext);

    }

    private void myRandomPicture (int intUser){
        int myRandom = 0;
        Random objRandom = new Random();
        myRandom = objRandom.nextInt(6) +1;
        Log.d("Ran", "myRandom ==>" + myRandom);

        overChange(myRandom);
    }

    private void overChange(int myRandom) {
        int[] intSource = new int[7];
        intSource[0] = 0;
        intSource[1] = R.drawable.dice1;
        intSource[2] = R.drawable.dice2;
        intSource[3] = R.drawable.dice3;
        intSource[4] = R.drawable.dice4;
        intSource[5] = R.drawable.dice5;
        intSource[6] = R.drawable.dice6;

        imageDice.setImageResource(intSource[myRandom]);
        MediaPlayer iMedia = MediaPlayer.create(getBaseContext(), intSound);
        iMedia.start();
    }

    private void changeplay (int intdice){
        Log.d("test", "ค่าที่ได้รับ = " + intdice);
        intSound = R.raw.effect_btn_shut;

        switch (intdice){
            case 1 :
                imageDice.setImageResource(R.drawable.dice1);
                break;
            case 2 :
                imageDice.setImageResource(R.drawable.dice2);
                break;
            case 3 :
                imageDice.setImageResource(R.drawable.dice3);
                break;
            case 4 :
                imageDice.setImageResource(R.drawable.dice4);
                break;
            case 5 :
                imageDice.setImageResource(R.drawable.dice5);
                break;
            case 6 :
                imageDice.setImageResource(R.drawable.dice6);
                break;
        }
        MediaPlayer iMedia = MediaPlayer.create(getBaseContext(), intSound);
        iMedia.start();
    }

}
