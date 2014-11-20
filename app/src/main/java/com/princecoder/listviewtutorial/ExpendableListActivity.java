package com.princecoder.listviewtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.princecoder.listviewtutorial.adapters.MyExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by prinzlyngotoum on 11/19/14.
 */
public class ExpendableListActivity extends Activity implements ExpandableListView.OnChildClickListener{

    MyExpandableListAdapter mListAdapter;
    ExpandableListView mExpListView;
    List<String> mListDataHeader;
    HashMap<String, List<String>> mListDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        // get the listview
        mExpListView = (ExpandableListView) findViewById(R.id.expListView);

        // preparing list data
        populateListData();

        mListAdapter = new MyExpandableListAdapter(this, mListDataHeader,mListDataChild);

        // setting list adapter
        mExpListView.setAdapter(mListAdapter);

        mExpListView.setOnChildClickListener(this);
    }

    /*
     * Preparing the list data
     */
    private void populateListData() {
        mListDataHeader = new ArrayList<String>();
        mListDataChild = new HashMap<String, List<String>>();

        // Adding child data
        mListDataHeader.add("ArrayAdapter");
        mListDataHeader.add("BaseAdapter");
        mListDataHeader.add("CursorAdapter");

        // Adding child data
        List<String> arrayAdapter = new ArrayList<String>();
        arrayAdapter.add("Array Adapter 1");
        arrayAdapter.add("Array Adapter 2");
        arrayAdapter.add("Array Adapter 3");

        List<String> baseAdapter = new ArrayList<String>();
        baseAdapter.add("Base Adapter 1");
        baseAdapter.add("Base Adapter 2");
        baseAdapter.add("Base Adapter 3");

        List<String> cursorAdapter = new ArrayList<String>();
        cursorAdapter.add("Cursor Adapter 1");
        cursorAdapter.add("Cursor Adapter 2");
        cursorAdapter.add("Cursor Adapter 3");

        mListDataChild.put(mListDataHeader.get(0), arrayAdapter); // Header,
        // Child
        // data
        mListDataChild.put(mListDataHeader.get(1), baseAdapter);
        mListDataChild.put(mListDataHeader.get(2), cursorAdapter);
    }

    @Override
    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {
        // TODO Auto-generated method stub

        Toast.makeText(getApplicationContext(),"Yep",Toast.LENGTH_SHORT).show();
        return false;
    }

}
