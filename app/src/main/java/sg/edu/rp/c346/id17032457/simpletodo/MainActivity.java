package sg.edu.rp.c346.id17032457.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ettask;
    Button btnAdd;
    Button btnClear;
    ListView lvTask;

    ArrayList<String> alTask;
    ArrayAdapter<String> aaTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ettask = findViewById(R.id.editTextTask);
        btnAdd = findViewById(R.id.btnAdd);
        btnClear = findViewById(R.id.btnClear);
        lvTask = findViewById(R.id.ListView);

        alTask = new ArrayList<>();

        aaTask = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alTask);
        lvTask.setAdapter(aaTask);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String list = ettask.getText().toString();
            alTask.add(list);
            aaTask.notifyDataSetChanged();



            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alTask.clear();
                aaTask.notifyDataSetChanged();




            }

        });
    }
}

