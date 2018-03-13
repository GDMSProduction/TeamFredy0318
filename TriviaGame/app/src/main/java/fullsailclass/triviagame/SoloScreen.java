package fullsailclass.triviagame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoloScreen extends AppCompatActivity {
    //List<QandA> list = new ArrayList<QandA>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo_screen);

        configureSGBackButton();
        configureEntertainmentButton();
        configureGamesButton();
        configureHistoryButton();
        configureMusicButton();
        configureScienceButton();
        configureSportsButton();

        setTitle("Solo Menu");
    }

    public void configureSGBackButton() {
        Button back = (Button) findViewById(R.id.Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }

        });
    }

    public void configureEntertainmentButton() {
        Button entertainment = (Button) findViewById(R.id.Entertainment);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, EntertainmentScreen.class));
            }

        });
    }

    public void configureGamesButton() {
        Button games = (Button) findViewById(R.id.Games);
        games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, GamesScreen.class));

            }

        });
    }

    public void configureHistoryButton() {
        Button history = (Button) findViewById(R.id.History);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, HistoryScreen.class));
            }

        });
    }

    public void configureMusicButton() {
        Button music = (Button) findViewById(R.id.Music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, MusicScreen.class));
            }

        });
    }

    public void configureScienceButton() {
        Button science = (Button) findViewById(R.id.Science);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, ScienceScreen.class));
            }

        });
    }

    public void configureSportsButton() {
        Button sports = (Button) findViewById(R.id.Sports);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SoloScreen.this, SportsScreen.class));
            }

        });
    }



}
