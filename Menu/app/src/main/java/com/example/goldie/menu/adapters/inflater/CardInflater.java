package com.example.goldie.menu.adapters.inflater;

/**
 * Created by goldie on 28/03/16.
 *
 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.goldie.menu.R;
import com.example.goldie.menu.adapters.BaseInflaterAdapter;
import com.example.goldie.menu.adapters.CardItemData;
import com.example.goldie.menu.adapters.IAdapterViewInflater;

public class CardInflater implements IAdapterViewInflater<CardItemData>
{
    @Override
    public View inflate(final BaseInflaterAdapter<CardItemData> adapter, final int pos, View convertView, ViewGroup parent)
    {
        ViewHolder holder;

        if (convertView == null)
        {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.list_item_card, parent, false);
            holder = new ViewHolder(convertView);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        final CardItemData item = adapter.getTItem(pos);
        holder.updateDisplay(item);

        return convertView;
    }

    private class ViewHolder
    {
        private View m_rootView;
        private TextView m_text1;
        private TextView m_text2;
        private TextView m_text3;

        public ViewHolder(View rootView)
        {
            m_rootView = rootView;
            m_text1 = (TextView) m_rootView.findViewById(R.id.text1);
            m_text2 = (TextView) m_rootView.findViewById(R.id.text2);
            m_text3 = (TextView) m_rootView.findViewById(R.id.text3);
            rootView.setTag(this);
        }

        public void updateDisplay(CardItemData item)
        {
            m_text1.setText(item.getText1());
            m_text2.setText(item.getText2());
            m_text3.setText(item.getText3());
        }
    }
}
