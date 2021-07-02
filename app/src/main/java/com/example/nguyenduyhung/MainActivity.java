package com.example.nguyenduyhung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Nuoc> nuocArrayList;
    adapter adapter;
    EditText edt1, edt2;
    Button btnThem, btnCapnhat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXA();
        nuocArrayList = new ArrayList<>();
        nuocArrayList.add(new Nuoc(R.drawable.ic_baseline_emoji_flags_24,"Việt Nam","Huy chương vàng"));
        nuocArrayList.add(new Nuoc(R.drawable.ic_baseline_emoji_flags_24,"Trung Quốc","Huy chương bạc"));
        nuocArrayList.add(new Nuoc(R.drawable.ic_baseline_emoji_flags_24,"Thái Lan","Huy chương đồng"));

        adapter = new adapter(this, R.layout.dong_nuoc, nuocArrayList);
        lv.setAdapter(adapter);
        them();
        xoa();
    }

    private void xoa() {
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                nuocArrayList.remove(position);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }

    private void them() {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuoc = edt1.getText().toString();
                String huyCHuong = edt2.getText().toString();
                nuocArrayList.add(new Nuoc(R.drawable.ic_baseline_emoji_flags_24,nuoc, huyCHuong));
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void anhXA() {
        lv = (ListView)findViewById(R.id.listview);
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        btnThem = (Button)findViewById(R.id.btnThem);
        btnCapnhat = (Button)findViewById(R.id.btnCapNhat);

    }
}