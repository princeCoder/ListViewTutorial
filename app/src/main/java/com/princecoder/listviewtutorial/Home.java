package com.princecoder.listviewtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends Activity {

    Button mBtnCustomBaseAdapter;
    Button mBtnCustomArrayAdapter;
    Button mBtnCustomCursorAdapter;
    Button mBtnSimpleArrayAdapter;
    Button mBtnExpendableAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void performAction(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_c_arrayAdapter:
                intent=new Intent(this,CustomArrayAdapterActivity.class);
                this.startActivity(intent);
                break;
            case R.id.btn_c_baseAdapter:
                intent=new Intent(this,CustomBaseAdapterActivity.class);
                this.startActivity(intent);
                break;
            case R.id.btn_c_cursorAdapter:
                break;
            case R.id.btn_simple_ArrayAdapter:
                break;
            case R.id.btn_Expandable:
                intent=new Intent(this,ExpendableListActivity.class);
                this.startActivity(intent);
                break;
            default:
                break;

        }

    }
}
