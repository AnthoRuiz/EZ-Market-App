package com.anthoruiz.jaka.jarvis.ez_market.web;

import com.anthoruiz.jaka.jarvis.ez_market.web.model.CategoryListWrapper;
import com.anthoruiz.jaka.jarvis.ez_market.web.model.ProductListWrapper;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

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
public interface WebApi {

    String URL = "http://52.39.86.13/";
    String GET_CATEGORIES_PATH = "/market/public/api/categories";
    String GET_PRODUCTS_PATH = "/market/public/api/products";

    @GET(GET_CATEGORIES_PATH)
    Call<CategoryListWrapper> getCategories();

    @GET(GET_PRODUCTS_PATH)
    Call<ProductListWrapper> getProducts();

    final class ApiHelper{

        private static WebApi sInstance = null;
        private static final Object sLock = new Object();

        public static WebApi getWebApiInstance(){
            synchronized (sLock){
                if(sInstance == null){
                    sInstance = new Retrofit.Builder()
                            .addConverterFactory(GsonConverterFactory.create())
                            .baseUrl(URL)
                            .build()
                            .create(WebApi.class);
                }
            }
            return sInstance;
        }
    }
}
