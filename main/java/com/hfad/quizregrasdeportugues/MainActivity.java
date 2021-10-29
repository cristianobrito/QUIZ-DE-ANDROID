package com.hfad.quizregrasdeportugues;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.graphics.Color;
import java.util.Locale;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickProxima(View view) {
        Button proxima = (Button) findViewById(R.id.escolha1);
        Intent intent = new Intent(this, Perguntas.class);
        startActivity(intent);
    }

}