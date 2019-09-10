package com.example.helloword;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Model> modelList;
    Context context;

    public Adapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new ListHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Model model = modelList.get(position);
        ListHodel listHodel = (ListHodel) holder;
        listHodel.imageView.setImageResource(model.getImg());
        listHodel.tvName.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
    public class ListHodel extends RecyclerView.ViewHolder {
        public TextView tvName;
        public ImageView imageView;
        public ListHodel(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgAdd);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
