package cn.edu.fudan.hellofdu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private RecyclerView mrv;
    private SearchAdapter mSearchAdapter = new SearchAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mrv = findViewById(R.id.rv);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(mSearchAdapter);

        List<String> items = new ArrayList<>();
        for (int i =0; i < 100 ; i++){
            items.add(String.valueOf(i));
        }
        mSearchAdapter.notifyItems(items);

        EditText et = findViewById(R.id.text);

    }
}