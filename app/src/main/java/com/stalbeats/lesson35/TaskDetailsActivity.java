package com.stalbeats.lesson35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class TaskDetailsActivity extends AppCompatActivity {
    static  final String DETAILS_KEY="details_key";
    EditText title,description;
    CheckBox isDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        setupView();

    }
    private void setupView(){
        title=findViewById(R.id.details_title);
        description=findViewById(R.id.details_description);
        isDone=findViewById(R.id.details_isDone);


    }

    public void onClickSave(View view) {
        Intent intent = new Intent();
        String title1=title.getText().toString();
        String description1=description.getText().toString();
        Task task = new Task(title1,description1 );

        intent.putExtra( "key", task);
        setResult(RESULT_OK, intent);
        finish();
    }
}