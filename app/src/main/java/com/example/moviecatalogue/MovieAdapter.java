package com.example.moviecatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Movies> movies;

    public void setMovies(ArrayList<Movies> movies) {
        this.movies = movies;
    }

    public MovieAdapter(Context context) {
        this.context = context;
        movies = new ArrayList<>();
    }


    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(
                    R.layout.item_movies,
                    viewGroup,
                    false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Movies movies = (Movies) getItem(i);
        viewHolder.bind(movies);
        return view;
    }

    public class ViewHolder {
        private TextView txtTitle;
        private TextView txtDetail;
        private ImageView imgPoster;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.txt_title);
            txtDetail = view.findViewById(R.id.txt_detail);
            imgPoster = view.findViewById(R.id.img_poster);
        }

        void bind(Movies movies) {
            txtTitle.setText(movies.getTitle());
            txtDetail.setText(movies.getDetail());
            imgPoster.setImageResource(movies.getPoster());
        }
    }
}
