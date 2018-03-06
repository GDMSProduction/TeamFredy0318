package fullsailclass.triviagame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by JJOP on 3/6/2018.
 */

public class MultiplayerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_screen);

        configureBackButton();
    }

    public void configureBackButton() {
        Button backMult = (Button) findViewById(R.id.multiBackBtn);
        backMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });
    }
}