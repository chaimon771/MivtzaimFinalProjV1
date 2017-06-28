package example.haim.mivtzaimfinalprojv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

@SuppressWarnings("deprecation")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    //ToDo if user logged in > go to Main, if not log-in > Authentication > Profile
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
