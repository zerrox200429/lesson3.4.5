package com.stalbeats.lesson35;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.task_list);

        adapter = new TaskAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, TaskDetailsActivity.class);
        startActivityForResult(intent,100);

    }

    private void openDetails(Task task) {
        Intent intent = new Intent(MainActivity.this, TaskDetailsActivity.class);
        intent.putExtra(TaskDetailsActivity.DETAILS_KEY, task);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            if(resultCode==RESULT_OK){
                Task task=(Task) data.getSerializableExtra("key");
                adapter.addTask(task);

            }
        }



    }
}