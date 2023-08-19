package com.example.evaluation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PostAdapter extends ArrayAdapter<Post> {

    public PostAdapter(@NonNull Context context, ArrayList<Post> listQuestion) {
        super(context,0 ,listQuestion);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }


        Post postlist = getItem(position);

        TextView txt_id,txt_q;
        EditText etxt_opinion;
        RatingBar ratingBar;

        txt_id =listItemView.findViewById(R.id.txt1);
        txt_q =listItemView.findViewById(R.id.txt2);
        etxt_opinion = listItemView.findViewById(R.id.inputTxt);
        ratingBar = listItemView.findViewById(R.id.rBar);

        txt_id.setText(postlist.getNumQ());
        txt_q.setText(postlist.getQuestion());
        etxt_opinion.setText(postlist.getOpinion());
        ratingBar.setRating(postlist.getRate());

        return listItemView;
    }
}
