package sn.das.sendme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView welcome;
    private  int splash_time = 3000;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash_screen);

        welcome=(TextView)findViewById (R.id.welcome);
        new Handler ().postDelayed (new Runnable () {
            @Override
            public void run () {
                Intent i=new Intent (SplashScreen.this,Login.class);
                startActivity(i);
                finish ();
            }
        },splash_time);
    }


}
