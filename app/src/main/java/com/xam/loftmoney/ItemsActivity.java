package com.xam.loftmoney;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ItemsActivity extends AppCompatActivity {


    private RecyclerView recycler;
    private ItemsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);


        adapter = new ItemsAdapter(this);

        DividerItemDecoration divider = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        divider.setDrawable(getDrawable(R.drawable.divider));

        recycler = findViewById(R.id.recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.addItemDecoration(divider);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Молоко", "70"));
        items.add(new Item("Масло", "50"));
        items.add(new Item("Сало", "250"));
        items.add(new Item("Яблоки", "60"));
        items.add(new Item("Хлеб", "25"));
        items.add(new Item("Сыр", "570"));
        items.add(new Item("Картофель", "40"));
        items.add(new Item("Рыба", "670"));
        items.add(new Item("Кофе", "760"));
        items.add(new Item("Чай", "370"));

        adapter.setItems(items);
    }
}
