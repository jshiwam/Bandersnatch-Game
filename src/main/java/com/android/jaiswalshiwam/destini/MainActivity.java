package com.android.jaiswalshiwam.destini;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.Toast;
import android.view.GestureDetector.OnDoubleTapListener;


public class MainActivity extends AppCompatActivity{

    //public RelativeLayout rl;
    Button btnAns1;
    Button btnAns2;
    TextView story;
    int mIndex;
    int katha;
    int kIndex=-1;
    int choice1,choice2;


    private StoryAns[] storyansBank=new StoryAns[]{
            new StoryAns(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryAns(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryAns(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
    };
    private End[] endGame =new End[]{
            new End(R.string.T4_End),
            new End(R.string.T5_End),
            new End(R.string.T6_End)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAns1 = findViewById(R.id.btnAns1);
        btnAns2 = findViewById(R.id.btnAns2);
        story = findViewById(R.id.story);
        //rl = (RelativeLayout)findViewById(R.id.fullscreen);

        katha = storyansBank[mIndex].getStory();
        story.setText(katha);

        choice1 = storyansBank[mIndex].getAns1();
        btnAns1.setText(choice1);

        choice2 = storyansBank[mIndex].getAns2();
        btnAns2.setText(choice2);

        /*rl.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {

            public void onSwipeUp() {
                checkTap(storyansBank[mIndex].getAns1());
                updateStorynBtn();

            }
            public void onSwipeDown(){
                checkTap(storyansBank[mIndex].getAns2());
                updateStorynBtn();
            }

        });
        */


    btnAns1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
           checkTap(storyansBank[mIndex].getAns1());
           updateStorynBtn();

        }
    });
    btnAns2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            checkTap(storyansBank[mIndex].getAns2());
            updateStorynBtn();
            }
        });


    }



    public void checkTap(int answer){
            if(answer==storyansBank[0].getAns1()){
            mIndex=2;
            }
            else if(answer==storyansBank[0].getAns2())
            {
                mIndex=1;
            }
            else if(answer==storyansBank[1].getAns1()) {
                mIndex = 2;
            }
            else if(answer==storyansBank[1].getAns2()){
               kIndex=0;

            }
            else if(answer==storyansBank[2].getAns1()){
                kIndex=2;

            }
            else if(answer==storyansBank[2].getAns2()){
                kIndex=1;

            }
    }
    public void updateStorynBtn(){
        if(kIndex==-1)
        {katha=storyansBank[mIndex].getStory();
        story.setText(katha);

        choice1=storyansBank[mIndex].getAns1();
        btnAns1.setText(choice1);

        choice2=storyansBank[mIndex].getAns2();
        btnAns2.setText(choice2);}
        else{
            katha=endGame[kIndex].getConclusion();
            openActivity2();
            }
    }
    public void openActivity2(){
        Intent intent =new Intent(this,SecondActivity.class);
        intent.putExtra("KEY",katha);
        startActivity(intent);
    }
}
