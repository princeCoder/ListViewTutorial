package com.princecoder.listviewtutorial.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.princecoder.listviewtutorial.R;
import com.princecoder.listviewtutorial.model.UserBean;
import com.princecoder.listviewtutorial.model.ViewHolder;

import java.util.ArrayList;

/**
 * Created by prinzlyngotoum on 11/19/14.
 */
public class CustomBaseAdapter extends BaseAdapter{

    private Activity mActivity;
    public ArrayList<UserBean> mListOfUser;
    private static LayoutInflater mInflater=null;

    public CustomBaseAdapter(Activity a, ArrayList<UserBean> listUser) {
        mActivity = a;
        this.mListOfUser = listUser;
        mInflater = (LayoutInflater)mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    public int getCount() {
        return mListOfUser.size();
    }

    public Object getItem(int position) {
        //return position;
        return mListOfUser.get(position);
    }

    public long getItemId(int position)
    {
        return position;
    }

    public ArrayList<UserBean> getListOfUsers() {
        return mListOfUser;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;

        ViewHolder holder;
        if(vi==null){
            vi = mInflater.inflate(R.layout.row_item, null);
            holder=new ViewHolder(vi);
            vi.setTag(R.id.holder,holder);
        }
        else
            holder=(ViewHolder)vi.getTag();
            holder.setName(mListOfUser.get(position).getName());
            holder.setTitle(mListOfUser.get(position).getTitle());
            holder.setCompany(mListOfUser.get(position).getCompany());
        return vi;
    }
}
