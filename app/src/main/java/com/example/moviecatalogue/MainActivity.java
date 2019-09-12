package com.example.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Movies> listMovies = new ArrayList<>();
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovies.addAll(MoviesData.getListData());

        movieAdapter = new MovieAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(movieAdapter);

        movieAdapter.setMovies(listMovies);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, listMovies.get(i).getTitle(), Toast.LENGTH_SHORT).show();

                Intent viewDetailIntent = new Intent(MainActivity.this, DetailMovieActivity.class);
                viewDetailIntent.putExtra(DetailMovieActivity.EXTRA_TITLE, listMovies.get(i));
                startActivity(viewDetailIntent);
            }
        });
    }
}
