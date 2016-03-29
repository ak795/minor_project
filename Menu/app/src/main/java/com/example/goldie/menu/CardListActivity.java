package com.example.goldie.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.example.goldie.menu.adapters.BaseInflaterAdapter;
import com.example.goldie.menu.adapters.CardItemData;
import com.example.goldie.menu.adapters.inflater.CardInflater;
import android.app.Activity;

/**
 * Created by goldie on 28/03/16.
 */
public class CardListActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ListView list = (ListView)findViewById(R.id.list_view);

        list.addHeaderView(new View(this));
        list.addFooterView(new View(this));

        BaseInflaterAdapter<CardItemData> adapter = new BaseInflaterAdapter<CardItemData>(new CardInflater());
        for (int i = 0; i < 50; i++)
        {
            CardItemData data = new CardItemData("Item " + i + " Line 1", "Item " + i + " Line 2", "Item " + i + " Line 3");
            adapter.addItem(data, false);
        }

        list.setAdapter(adapter);
    }
}

