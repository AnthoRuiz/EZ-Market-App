package com.anthoruiz.jaka.jarvis.ez_market.web.model;

import com.google.gson.annotations.SerializedName;

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
public class Product {
    @SerializedName("id")
    private long mId;

    @SerializedName("nombre")
    private String mName;

    @SerializedName("categoria")
    private String mCategory;

    @SerializedName("descripcion")
    private String mDescription;

    @SerializedName("precio")
    private double mPrice;

    @SerializedName("imagen")
    private String mImg;

    public Product() {
        this(0, null, null, null, 0, null);
    }

    public Product(long mId, String mName, String mCategory, String mDescription, double mPrice, String mImg) {
        this.mId = mId;
        this.mName = mName;
        this.mCategory = mCategory;
        this.mDescription = mDescription;
        this.mPrice = mPrice;
        this.mImg = mImg;
    }

    public long getId() {
        return mId;
    }

    public void setId(long mId) {
        this.mId = mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public String getImg() {
        return mImg;
    }

    public void setImg(String mImg) {
        this.mImg = mImg;
    }
}