package com.example.baitap5_tuan2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText ma,ten;
    RadioButton ct,tv;
    RadioGroup group;
    Button nhap;
    ListView lst;
    ArrayList<Employee> myList=new ArrayList<Employee>();
    ArrayAdapter<Employee> adapter=null;
    Employee emp=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ma=(EditText)findViewById(R.id.editTextMaNV);
        ten=(EditText)findViewById(R.id.editTextTenNV);
        lst=(ListView)findViewById(R.id.listViewNV);
        nhap=(Button)findViewById(R.id.button_Nhap);
        ct=(RadioButton)findViewById(R.id.radioButtonCT);
        tv=(RadioButton)findViewById(R.id.radioButtonTV);
        group=(RadioGroup)findViewById(R.id.radioButtonGroup);

        adapter=new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,myList);
        lst.setAdapter(adapter);
        nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nhap();
            }
        });
    }

    private void Nhap() {
        int radId=group.getCheckedRadioButtonId();
        if(radId==R.id.radioButtonCT){
            emp=new EmployeeFullTime();
        }
        else{
            emp=new EmployeePartTime();
        }

        emp.setId(ma.getText().toString());
        emp.setName(ten.getText().toString());
        myList.add(emp);
        adapter.notifyDataSetChanged();
    }
}
