package com.example.rr.listviewapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 若冰RR on 2016/4/7.
 */
public class ArrayActivity extends AppCompatActivity {
    private List<String> list;//用于只有文本的Array
    private ListView mListView;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_array);
         list=new ArrayList<>();//数据初始化

        for(int i=1;i<=5;i++){
            String str="第"+i+"条";
            list.add(str);
        }
        mListView= (ListView) findViewById(R.id.list_view);
        //Arrayadpter文本适配器：以列表形式将信息显示
       ArrayAdapter arrayAdapter=new ArrayAdapter
               (this,android.R.layout.simple_expandable_list_item_1,list);
                  //         安卓资源包                                   链表名
        mListView.setAdapter(arrayAdapter);//填充数据到列表

    }
}
