package com.example.pannam.programviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.BounceInterpolator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);


        relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        relativeLayout.setLayoutParams(relativeParams);
        setContentView(relativeLayout);

        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams textViewParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        textViewParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        textViewParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textViewParams.setMargins(0, 82, 0, 0);
        textView.setLayoutParams(textViewParams);
        textView.setText("Hello");
        relativeLayout.addView(textView);

        addButton();


    }

    private void addButton() {

        Button btnNew = new Button(this);
        RelativeLayout.LayoutParams btnParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT

        );
        btnParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        btnParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnParams.setMargins(0,200,0,0);
        btnNew.setLayoutParams(btnParams);

        relativeLayout.addView(btnNew);



    }
}
