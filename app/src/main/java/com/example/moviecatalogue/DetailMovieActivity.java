package com.example.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {
    TextView tvTitle, tvDetail, tvDirector, tvWriters, tvStars;
    ImageView imgPoster;
    public static final String EXTRA_TITLE = "extra_title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        tvTitle = findViewById(R.id.tv_title);
        tvDetail = findViewById(R.id.tv_detail);
        tvDirector = findViewById(R.id.tv_director);
        tvWriters = findViewById(R.id.tv_writers);
        tvStars = findViewById(R.id.tv_stars);
        imgPoster = findViewById(R.id.img_poster);

        Movies movies = getIntent().getParcelableExtra(EXTRA_TITLE);
        String movieTitle = movies.getTitle();
        tvTitle.setText(movieTitle);

        String movieDetail = movies.getDetail();
        tvDetail.setText(movieDetail);

        String movieDirector = movies.getDirector();
        tvDirector.setText(movieDirector);

        String movieWriters= movies.getWriters();
        tvWriters.setText(movieWriters);

        String movieStars = movies.getStars();
        tvStars.setText(movieStars);

        Integer moviePoster = movies.getPoster();
        imgPoster.setImageResource(moviePoster);
    }
}
