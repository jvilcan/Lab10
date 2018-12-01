package com.example.nh.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mToyListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        this.mToyListTextView = (TextView)findViewById(R.id.tv_toy_names);

        // Get the toy list
        String[] toyNames= ToyBox.getToyNames();

        for (String toyName : toyNames) {
            mToyListTextView.append(toyName + "\n\n\n");
        }
    }
}
