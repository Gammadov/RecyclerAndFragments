package com.example.recyclerandfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Element> spisok = new ArrayList<Element>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 100; i++) {
            spisok.add(new Element("this is " + i, R.drawable.ic_baseline_emoji_events_256_0));
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        ElementAdapter adapter = new ElementAdapter(this, spisok);
        recyclerView.setAdapter(adapter);

    }
}