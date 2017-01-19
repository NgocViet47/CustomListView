package com.example.mypc.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvData;
    private ItemsAdapter adapter;
    private ArrayList listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Lấy đối tượng listview từ file xml bằng id
        lvData = (ListView) findViewById(R.id.listViewDanhBa);
        // 2. Khởi tạo dữ liệu cho mảng được hiển thị
        creatData();
        // 3. Khoi tao adapter
        adapter = new ItemsAdapter(this, listData);
        // 4. setAdapter cho listview
        lvData.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void creatData() {
        listData = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listData.add(new Items(i, "Name" + i, "012345678" + i));
        }
    }
}
