package com.astabits.dustbooks;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public TextView mTitle;
        public TextView mAuthor;
        public TextView mSubCode;
        public TextView mPrice;
        public TextView mCollege;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.bTitle);
            mAuthor = itemView.findViewById(R.id.bAuthor);
            mSubCode = itemView.findViewById(R.id.bCode);
            mPrice = itemView.findViewById(R.id.bPrice);
            mCollege = itemView.findViewById(R.id.bCollege);
        }
    }

public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;

}

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = mExampleList.get(position);
        holder.mTitle.setText(currentItem.getMtitle());
        holder.mAuthor.setText(currentItem.getMauthor());
        holder.mSubCode.setText(currentItem.getMsubcode());
        holder.mPrice.setText(currentItem.getMprice());
        holder.mCollege.setText(currentItem.getMcollege());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
