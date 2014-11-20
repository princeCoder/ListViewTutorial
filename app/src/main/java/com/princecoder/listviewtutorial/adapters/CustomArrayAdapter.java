package com.princecoder.listviewtutorial.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.princecoder.listviewtutorial.R;
import com.princecoder.listviewtutorial.model.UserBean;
import com.princecoder.listviewtutorial.model.ViewHolder;

import java.util.List;

/**
 * Created by prinzlyngotoum on 11/19/14.
 */
public class CustomArrayAdapter extends ArrayAdapter<UserBean> {

    Context c;
    List<UserBean> liste;

    public CustomArrayAdapter(Context context, int resource,
                              int textViewResourceId, List<UserBean> objects) {
        super(context, resource, textViewResourceId, objects);
        this.c = context;
        this.liste = objects;
        // TODO Auto-generated constructor stub
    }

    @Override
    public UserBean getItem(int position) {
        // TODO Auto-generated method stub
        return liste.get(position);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return liste.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View row = convertView;
        ViewHolder holder = null;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) c
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_item, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        holder.setName(liste.get(position).getName());
        holder.setTitle(liste.get(position).getTitle());
        holder.setCompany(liste.get(position).getCompany());

        return row;
    }
}