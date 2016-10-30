package com.caramelthunder.contacts;


import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainScreen_listfragment extends ListFragment
{
    private ArrayList<List> lists;
    private ListAdapter listAdapter;
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        lists=new ArrayList<List>();
        lists.add(new List("Thinh Nguyen"));
        lists.add(new List("DownHilary Clinton"));
        lists.add(new List("McDonald Trump"));
        lists.add(new List("BeBack Obama"));
        lists.add(new List("KillBill vol2 Clinton"));


        listAdapter=new ListAdapter(getActivity(),lists);
        setListAdapter(listAdapter);
        /*
        String[] names=new String[]{"a","b","c","d","a","b","c","d"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),
            android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);
        */
    }

    @Override
    public void onListItemClick(ListView l, View v, int position,long id)
    {
        super.onListItemClick(l,v,position,id);
    }


}
