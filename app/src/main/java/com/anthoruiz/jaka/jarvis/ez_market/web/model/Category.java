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
public class Category {

    @SerializedName("id")
    private long mId;

    @SerializedName("nombre")
    private String mName;

    @SerializedName("descripcion")
    private String mDescription;

    public Category() {
        this(0, null, null);
    }

    public Category(long mId, String mName, String mDescription) {
        this.mId = mId;
        this.mName = mName;
        this.mDescription = mDescription;
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

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
