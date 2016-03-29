package com.example.goldie.menu;

/**
 * Created by goldie on 28/03/16.
 */

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.example.goldie.menu.adapters.BaseInflaterAdapter;
import com.example.goldie.menu.adapters.CardItemData;
import com.example.goldie.menu.adapters.inflater.CardInflater;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;

public class CardList3 extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView list = (ListView) findViewById(R.id.list_view);

        list.addHeaderView(new View(this));
        list.addFooterView(new View(this));

        BaseInflaterAdapter<CardItemData> adapter = new BaseInflaterAdapter<CardItemData>(new CardInflater());
        for (int i = 0; i < 50; i++) {
            CardItemData data = new CardItemData("Item " + i + " Line 1", "Item " + i + " Line 2", "Item " + i + " Line 3");
            adapter.addItem(data, false);
        }

        list.setAdapter(adapter);
    }




}

