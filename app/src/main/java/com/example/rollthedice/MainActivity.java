package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mBtnRoll;
    private LottieAnimationView mDice1,mDice2,mDice3,mDice4,mDice5,mDice6;
    private Random random;
    private int randomInt;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnRoll = findViewById(R.id.btn_roll);
        mDice1 = findViewById(R.id.dice1);
        mDice2 = findViewById(R.id.dice2);
        mDice3 = findViewById(R.id.dice3);
        mDice4 = findViewById(R.id.dice4);
        mDice5 = findViewById(R.id.dice5);
        mDice6 = findViewById(R.id.dice6);

        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        mBtnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                random = new Random();
                randomInt = random.nextInt(7-1)+1;
                switch (randomInt) {
                    case 1:
                        rollDice1();
                        break;
                    case 2:
                        rollDice2();
                        break;
                    case 3:
                        rollDice3();
                        break;
                    case 4:
                        rollDice4();
                        break;
                    case 5:
                        rollDice5();
                        break;
                    default:
                        rollDice6();
                        break;
                }
            }
        });

    }
    public void rollDice1(){
        mDice1.playAnimation();
        mDice1.setVisibility(View.VISIBLE);
        mDice2.setVisibility(View.INVISIBLE);
        mDice3.setVisibility(View.INVISIBLE);
        mDice4.setVisibility(View.INVISIBLE);
        mDice5.setVisibility(View.INVISIBLE);
        mDice6.setVisibility(View.INVISIBLE);

        mDice1.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

    public void rollDice2(){
        mDice2.playAnimation();
        mDice2.setVisibility(View.VISIBLE);
        mDice1.setVisibility(View.INVISIBLE);
        mDice3.setVisibility(View.INVISIBLE);
        mDice4.setVisibility(View.INVISIBLE);
        mDice5.setVisibility(View.INVISIBLE);
        mDice6.setVisibility(View.INVISIBLE);

        mDice2.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

    public void rollDice3(){
        mDice3.playAnimation();
        mDice3.setVisibility(View.VISIBLE);
        mDice2.setVisibility(View.INVISIBLE);
        mDice1.setVisibility(View.INVISIBLE);
        mDice4.setVisibility(View.INVISIBLE);
        mDice5.setVisibility(View.INVISIBLE);
        mDice6.setVisibility(View.INVISIBLE);

        mDice3.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

    public void rollDice4(){
        mDice4.playAnimation();
        mDice4.setVisibility(View.VISIBLE);
        mDice2.setVisibility(View.INVISIBLE);
        mDice3.setVisibility(View.INVISIBLE);
        mDice1.setVisibility(View.INVISIBLE);
        mDice5.setVisibility(View.INVISIBLE);
        mDice6.setVisibility(View.INVISIBLE);

        mDice4.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

    public void rollDice5(){
        mDice5.playAnimation();
        mDice5.setVisibility(View.VISIBLE);
        mDice2.setVisibility(View.INVISIBLE);
        mDice3.setVisibility(View.INVISIBLE);
        mDice4.setVisibility(View.INVISIBLE);
        mDice1.setVisibility(View.INVISIBLE);
        mDice6.setVisibility(View.INVISIBLE);

        mDice5.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

    public void rollDice6(){
        mDice6.playAnimation();
        mDice6.setVisibility(View.VISIBLE);
        mDice2.setVisibility(View.INVISIBLE);
        mDice3.setVisibility(View.INVISIBLE);
        mDice4.setVisibility(View.INVISIBLE);
        mDice5.setVisibility(View.INVISIBLE);
        mDice1.setVisibility(View.INVISIBLE);

        mDice6.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                mBtnRoll.setEnabled(true);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                mBtnRoll.setEnabled(false);
            }
        });
    }

}
