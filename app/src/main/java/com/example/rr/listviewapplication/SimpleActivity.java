package com.example.rr.listviewapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 若冰RR on 2016/4/7.
 */
public class SimpleActivity extends AppCompatActivity {
    private List<Map<String,Object>> mMList;//列表包含子控件
    private ListView mListView;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_array);
        mListView= (ListView) findViewById(R.id.list_view);
        mMList=new ArrayList<>();
        for(int i=1;i<=5;i++){
            Map map=new HashMap();
            map.put("icon",R.mipmap.ic_launcher);
            map.put("text","第"+i+"条");
            mMList.add(map);
        }
         /* 列表包含子控件的适配器*/

        SimpleAdapter adapter=new SimpleAdapter
                (this,mMList, R.layout.layout,new String[]{"icon","text"},
                        // 接口  Map列表      界面ID                 key和value生成列表项
                        new int[]{R.id.imageview,R.id.textview1});
        //填充组件对应关系
        mListView.setAdapter(adapter);


    }
}
