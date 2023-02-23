package com.example.homwork3_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class ContinentsAdapter extends RecyclerView.Adapter<ContinentsViewHolder> {

    private ArrayList<Continent> continentsList;
    private OnClick onItemClick;

    public ContinentsAdapter(ArrayList<Continent> continentsList, OnClick onItemClick) {
        this.continentsList = continentsList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(ItemContinentsBinding
                .inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, int position) {
        holder.bind(continentsList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }

    public FragmentContintentsBinding inflate(LayoutInflater layoutInflater) {
        FragmentContintentsBinding = null;
        return o;
    }
}

class ContinentsViewHolder extends RecyclerView.ViewHolder {

    private ItemContinentsBinding binding;

    public ContinentsViewHolder(ItemContinentsBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    @SuppressLint("SetTextI18n")
    void bind(Continent continents){
        binding.tvContinentName.setText(continents.getName());
        binding.tvContinentSquare.setText("Площадь: \n" + continents.getSquare());
        Glide.with(binding.imgContinent).load(continents.getImage()).into(binding.imgContinent);{
}
