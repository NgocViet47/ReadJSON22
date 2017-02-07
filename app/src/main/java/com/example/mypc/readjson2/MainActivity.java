package com.example.mypc.readjson2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEvent();
        buttonClick();
    }

    private void buttonClick() {
        button.setOnClickListener(this);
    }

    private void addEvent() {
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                buttonPrint();
                break;
        }
    }

    private void buttonPrint() {
        InputStream raw = getResources().openRawResource(R.raw.demodata);
        Reader rd = new BufferedReader(new InputStreamReader(raw));

        ObjectData data = new Gson().fromJson(rd,ObjectData.class);
        String string = "";
        string +=  data.toString()+"\n"+data.getData().toString();
        for (int i=0;i<data.getData().getItems().size();i++)
        {
            string +="\n"+data.getData().getItems().get(i).toString();
            for(int j=0;j<data.getData().getItems().get(i).getTags().size();j++){
                string += "\n"+ data.getData().getItems().get(i).getTags().get(j);
            }
        }
        textView.setText(string);
    }
}
