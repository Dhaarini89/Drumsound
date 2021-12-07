package tinker.apps.drumsound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
  MediaPlayer M1,M2;
  ImageButton B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1=findViewById(R.id.sound1);
        B2=findViewById(R.id.sound2);

        M1 = MediaPlayer.create(this,R.raw.one);
        M2 = MediaPlayer.create(this,R.raw.two);

    }

    public void sound(View view) {

        switch (view.getId())
        {
            case R.id.sound1:
                M1.start();
                break;
            case R.id.sound2:
                M2.start();
                break;
        }
    }




}