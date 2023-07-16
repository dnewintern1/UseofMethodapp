package com.example.thenoofrolls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDice1 = findViewById(R.id.txtDice1);
        TextView txtDice2 = findViewById(R.id.txtDice2);
        TextView txtDice3 = findViewById(R.id.txtDice3);
        TextView txtDice4 = findViewById(R.id.txtDice4);
        TextView txtDice5 = findViewById(R.id.txtDice5);



        Button btnResult = findViewById(R.id.btnResult);

        SecureRandom MyRandomNo= new SecureRandom();

        int[] myContent = new int[6];

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int index = 0; index<5000;index++){

                    int num = MyRandomNo.nextInt(6);

                    ++myContent[num];

                }

                for(int faceNum=0 ; faceNum<myContent.length ; faceNum++){

                    switch(faceNum){
                        case 1:
                            makeTheValueAppear(txtDice1,1,myContent);
                            break;
                        case 2:
                            makeTheValueAppear(txtDice2, 2,myContent);
                            break;
                        case 3:
                            makeTheValueAppear(txtDice3,3,myContent);
                            break;

                        case 4:
                            makeTheValueAppear(txtDice4,4,myContent);
                            break;
                        case 5:
                            makeTheValueAppear(txtDice5,5,myContent);
                            break;

                    }

                }

            }
        });






    }

    private void makeTheValueAppear(TextView txtview, int facenum , int[] myContent){

        txtview.setText(myContent[facenum] + " ");


    }
}