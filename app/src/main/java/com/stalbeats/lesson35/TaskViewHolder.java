package com.stalbeats.lesson35;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    CheckBox isDone;
    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.task_title1);
        isDone=itemView.findViewById(R.id.task_isDone);
    }
    public  void onBind(Task task){
        title.setText(task.title);
        isDone.setChecked(task.isDone);


    }
}
