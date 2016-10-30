package com.caramelthunder.contacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by t_boy on 10/29/2016.
 */

public class ListAdapter extends ArrayAdapter<List>
{
    public ListAdapter(Context context, ArrayList<List> lists)
    {
        super(context,0,lists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        List list=getItem(position);
        if (convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_row,parent,false);
        }
        TextView listName=(TextView) convertView.findViewById(R.id.listnames01);
        listName.setText(list.getName());
        return convertView;
    }

}
