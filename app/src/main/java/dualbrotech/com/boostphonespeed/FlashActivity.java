package dualbrotech.com.boostphonespeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

                Thread th = new Thread(){
                    public void run(){
                        try{
                            sleep(1200);
                        }
                        catch(InterruptedException e){
                            Log.e("MainActivity","Thread Error "+e.getMessage());
                        }
                        finally {
                            Intent  i = new Intent(FlashActivity.this,LandingActivity.class);
                            startActivity(i);
                        }
                    }
                };

        th.start();
    }
}
