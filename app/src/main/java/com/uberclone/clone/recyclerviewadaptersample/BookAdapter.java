package com.uberclone.clone.recyclerviewadaptersample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BookAdapter  extends RecyclerView.Adapter <BookAdapter.MyViewHolder> {

    private List<Books> booksList;

    public BookAdapter(List<Books> List) {
        this.booksList = List;
    }


    @NonNull
    @Override
    public BookAdapter.MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.book_list_row, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.MyViewHolder myViewHolder, int i) {

        Books book = booksList.get(i);

        myViewHolder.title.setText(book.getTitle());
        myViewHolder.email.setText(book.getEmail());
        myViewHolder.id.setText(""+book.getId());
        myViewHolder.cost.setText(""+book.getCost());
    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, email, id, cost;

        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.tv_title);
            email = (TextView) view.findViewById(R.id.tv_email);
            id = (TextView) view.findViewById(R.id.tv_id);
            cost = (TextView) view.findViewById(R.id.tv_cost);

        }
    }
}
