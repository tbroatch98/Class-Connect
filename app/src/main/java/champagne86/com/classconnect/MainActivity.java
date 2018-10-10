package champagne86.com.classconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent indexIntent = new Intent(MainActivity.this, IndexActivity.class);
                startActivity(indexIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}