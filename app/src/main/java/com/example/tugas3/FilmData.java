package com.example.tugas3;

import java.util.ArrayList;

public class FilmData {
    private static  String[] nama = new String[]{"Harry Potter 1", "Harry Potter 2", "Harry Potter 3", "Harry Potter 4", "Harry Potter 5", "Harry Potter 6", "Harry Potter 7", "Harry Potter 8"};

    private static int[] gambar = new int[]{R.drawable.harpot1, R.drawable.harpot2, R.drawable.harpot3, R.drawable.harpot4, R.drawable.harpot5, R.drawable.harpot6, R.drawable.harpot7, R.drawable.harpot8};

    public static ArrayList<FilmModel> getListData(){
        FilmModel filmModel = null;
        ArrayList<FilmModel> list = new ArrayList<FilmModel>();
        for ( int i = 0; i < nama.length; i++){
            filmModel = new FilmModel();
            filmModel.setGambarFilm(gambar[i]);
            filmModel.setJudulFilm(nama[i]);
            list.add(filmModel);
        }
        return list;
    }
}