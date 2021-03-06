package com.anthoruiz.jaka.jarvis.ez_market.web.model;

import com.google.gson.annotations.SerializedName;

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
public class CategoryListWrapper {

    @SerializedName("data")
    private List<Category> mCategory;

    public List<Category> getCategories() {
        return mCategory;
    }
}
