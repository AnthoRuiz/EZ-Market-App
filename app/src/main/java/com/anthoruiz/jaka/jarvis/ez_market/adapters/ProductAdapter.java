package com.anthoruiz.jaka.jarvis.ez_market.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.anthoruiz.jaka.jarvis.ez_market.databinding.CardViewBinding;
import com.anthoruiz.jaka.jarvis.ez_market.web.model.Category;
import com.anthoruiz.jaka.jarvis.ez_market.web.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * **********************
 * Copyright (c) 2015 - 2016 Anthony Juosse Ruiz Samaca, All rights reserved
 * <p>
 * -
 * <p>
 * -
 * Autor:		Anthony Juosse Ruiz Samaca
 * email:		ajruiz.cpp@gmail.com
 * Creado:   	20/09/2016
 * Proyecto: 	MyApplication
 * **********************
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{

    private List<Product> mData;

    public ProductAdapter(){this(null);}

    public ProductAdapter(List<Product> mData) {
        this.mData = mData;
    }

    public List<Product> getData() {
        return mData;
    }

    public void setData(List<Product> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolder.create(
                LayoutInflater.from(parent.getContext()),
                parent
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.getBinding().setCategory(mData.get(position).getCategory());
        holder.getBinding().setProductName(mData.get(position).getName());

        holder.getBinding().setProductDescription(mData.get(position).getDescription());
        holder.getBinding().setProductPrice(String.valueOf(mData.get(position).getPrice()));

        Picasso.with(holder.getBinding().imageView.getContext())
                .load(mData.get(position).getImg())
                .fit()
                .centerCrop()
                .into(holder.getBinding().imageView);

    }


    @Override
    public int getItemCount()  {
        return (mData == null)? 0 : mData.size();
    }

    protected static final class ViewHolder extends RecyclerView.ViewHolder{

        private CardViewBinding mBinding;

        public static ViewHolder create(LayoutInflater inflater, ViewGroup parent){
            return new ViewHolder(CardViewBinding.inflate(inflater, parent, false));
        }

        private ViewHolder(CardViewBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public CardViewBinding getBinding(){
            return mBinding;
        }
    }
}
