package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView getJudul, getKeterangan;
    private ImageView getGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setTitle("Data Film");
        getGambar = findViewById(R.id.poster);
        getKeterangan = findViewById(R.id.keterangan);
        getJudul = findViewById(R.id.judul_film);
        showData();
    }

    private void showData(){
        String judul = getIntent().getExtras().getString("JudulFilm");

        switch (judul){
            case "harpot1" :
                getJudul.setText("Harry Potter and the Sorcerer's Stone");
                getGambar.setImageResource(R.drawable.harpot1);
                getKeterangan.setText("Harry Potter and the Philosopher's Stone (released in the United States and India as Harry Potter and the Sorcerer's Stone) is a 2001 fantasy film directed by Chris Columbus and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1997 novel of the same name.");
                break;

            case "harpot2" :
                getJudul.setText("Harry Potter and the Chamber od Secrets");
                getGambar.setImageResource(R.drawable.harpot2);
                getKeterangan.setText("Harry Potter and the Chamber of Secrets is a 2002 fantasy film directed by Chris Columbus and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1998 novel of the same name. ");
                break;

            case "harpot3" :
                getJudul.setText("Harry Potter and the Prisoner of Azkaban");
                getGambar.setImageResource(R.drawable.harpot3);
                getKeterangan.setText("Harry Potter and the Prisoner of Azkaban is a 2004 fantasy film directed by Alfonso Cuarón and distributed by Warner Bros. Pictures, based on J. K. Rowling's 1999 novel of the same name.");
                break;

            case "harpot4" :
                getJudul.setText("Harry Potter and the Goblet of Fire");
                getGambar.setImageResource(R.drawable.harpot4);
                getKeterangan.setText("Harry Potter and the Goblet of Fire is a 2005 fantasy film directed by Mike Newell and distributed by Warner Bros. Pictures, based on J. K. Rowling's 2000 novel of the same name.");
                break;

            case "harpot5" :
                getJudul.setText("Harry Potter and the Order of the Phoenix");
                getGambar.setImageResource(R.drawable.harpot5);
                getKeterangan.setText("Harry Potter and the Order of the Phoenix is a 2007 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.[6] It is based on J. K. Rowling's 2003 novel of the same name. ");
                break;

            case "harpot6" :
                getJudul.setText("Harry Potter and the Half Blood Prince");
                getGambar.setImageResource(R.drawable.harpot6);
                getKeterangan.setText("Harry Potter and the Half-Blood Prince is a 2009 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.");
                break;

            case "harpot7" :
                getJudul.setText("Harry Potter and the Deathly Hallows - Part 1");
                getGambar.setImageResource(R.drawable.harpot7);
                getKeterangan.setText("Harry Potter and the Deathly Hallows – Part 1 is a 2010 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.");
                break;

            case "harpot8" :
                getJudul.setText("Harry Potter and the Deathly Hallows - Part 2");
                getGambar.setImageResource(R.drawable.harpot8);
                getKeterangan.setText("Harry Potter and the Deathly Hallows – Part 2 is a 2011 fantasy film directed by David Yates and distributed by Warner Bros. Pictures.");
                break;
        }
    }
}