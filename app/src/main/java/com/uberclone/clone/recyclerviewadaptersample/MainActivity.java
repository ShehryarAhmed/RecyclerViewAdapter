package com.uberclone.clone.recyclerviewadaptersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Books> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BookAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

//        // set the adapter
//        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Books movie = movieList.get(position);
                Toast.makeText(getApplicationContext(), movie.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Long ", Toast.LENGTH_SHORT).show();

            }
        }));
        prepareMovieData();
    }

    private void prepareMovieData() {
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        movieList.add(new Books("Holly Quran","Bismillah@gmail.com",10,99));
        mAdapter.notifyDataSetChanged();
    }

}
