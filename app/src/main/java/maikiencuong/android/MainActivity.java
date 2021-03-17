package maikiencuong.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout bgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        /*activity 1*/

        /*setContentView(R.layout.activity_main);
        bgr=findViewById(R.id.background);
        bgr.setBackgroundResource(R.drawable.background);*/



        /*activity 2*/

        /*setContentView(R.layout.activity_main2);
        bgr=findViewById(R.id.background);
        bgr.setBackgroundResource(R.drawable.background);*/


        /*activity 3*/

        /*setContentView(R.layout.activity_main3);
        bgr=findViewById(R.id.background);
        bgr.setBackgroundResource(R.drawable.background2);*/


        /*activity 4*/

        /*setContentView(R.layout.activity_main4);
        bgr=findViewById(R.id.background);
        bgr.setBackgroundResource(R.drawable.background3);*/


        /*activity 5*/

        setContentView(R.layout.activity_main5);
        bgr=findViewById(R.id.background);
        bgr.setBackgroundResource(R.drawable.background3);



    }
}