package com.hfad.quizregrasdeportugues;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Perguntas extends Activity {
    private Questionario mQuestionLibrary = new Questionario();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonEscolha1;
    private Button mButtonEscolha2;
    private Button mButtonEscolha3;
    private Button mButtonEscolha4;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);

        mScoreView      = (TextView)findViewById(R.id.score);
        mQuestionView   = (TextView)findViewById(R.id.question);
        mButtonEscolha1 = (Button)findViewById(R.id.escolha1);
        mButtonEscolha2 = (Button)findViewById(R.id.escolha2);
        mButtonEscolha3 = (Button)findViewById(R.id.escolha3);
        mButtonEscolha4 = (Button)findViewById(R.id.escolha4);
        updateQuestion();

        //=============================INICIO BUTTON 1===============================================
        mButtonEscolha1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mButtonEscolha1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //Linha opcional
                    Toast.makeText(Perguntas.this, "ACERTOU", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(Perguntas.this, "ERRADA", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });
        //==================================END BUTTON 1========================================

        //==================================INICIO BUTTON 2=====================================
        mButtonEscolha2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mButtonEscolha2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //linha opcional
                    Toast.makeText(Perguntas.this, "ACERTOU", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(Perguntas.this, "ERRADA", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });
        //==================================END BUTTON 2========================================

        //==================================INICIO BUTTON 3=====================================
        mButtonEscolha3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mButtonEscolha3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //linha opcional
                    Toast.makeText(Perguntas.this, "ACERTOU", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(Perguntas.this, "ERRADA", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });
        //==================================END BUTTON 3========================================
        //==================================INICIO BUTTON 4=====================================
        mButtonEscolha4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mButtonEscolha4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //Linha opcional
                    Toast.makeText(Perguntas.this, "ACERTOU", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(Perguntas.this, "ERRADA", Toast.LENGTH_LONG).show();
                    updateQuestion();
                }
            }
        });
        //==================================END BUTTON 4========================================
    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestoes(mQuestionNumber));
        mButtonEscolha1.setText(mQuestionLibrary.getEscolha1(mQuestionNumber));
        mButtonEscolha2.setText(mQuestionLibrary.getEscolha2(mQuestionNumber));
        mButtonEscolha3.setText(mQuestionLibrary.getEscolha3(mQuestionNumber));
        mButtonEscolha4.setText(mQuestionLibrary.getEscolha4(mQuestionNumber));
        mAnswer = mQuestionLibrary.getAcerto(mQuestionNumber);
        mQuestionNumber++;

    }

    private void updateScore(int mScore) { mScoreView.setText("" + mScore);}
}