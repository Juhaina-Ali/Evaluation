package com.example.evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView postListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postListView = findViewById(R.id.postListView);

        ArrayList<Post> post_array =new ArrayList<>();

        post_array.add(new Post("Question 1","Is the duration of the course sufficient the content of the course",5,"yes"));
        post_array.add(new Post("Question 2","The course topics have been covered in sufficient detail",5,"yes"));
        post_array.add(new Post("Question 3","The course content is suitable for my requirements",5,"yes"));

        PostAdapter postAdapter = new PostAdapter(this,post_array);
        postListView.setAdapter(postAdapter);
    }
}