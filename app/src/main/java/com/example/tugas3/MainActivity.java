package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCetak;
    private ArrayList<FilmModel> listFilm = new ArrayList<>();
    Button btnLihat;
    TextView ctkteks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCetak = findViewById(R.id.mainRV);
        rvCetak.setHasFixedSize(true);
        listFilm.addAll(FilmData.getListData());

        showRecyclerList();

        btnLihat = findViewById(R.id.btn_lihat);
        ctkteks = findViewById(R.id.cetak_text);

        ListView listView = findViewById(R.id.mainRV);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, listFilm);

        listView.setAdapter(adapter);

        /*btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(MainActivity.this, Main3Activity.class);
                data.putExtra("JudulFilm", ctkteks.getText().toString());
                startActivity(data);
            }
        });*/
    }

    private void showRecyclerList() {
        rvCetak.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        FilmAdapter filmAdapter = new FilmAdapter(this);
        filmAdapter.setFilmModels(listFilm);
        rvCetak.setAdapter(filmAdapter);
    }


}