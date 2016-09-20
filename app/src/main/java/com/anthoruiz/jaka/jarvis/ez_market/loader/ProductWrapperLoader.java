package com.anthoruiz.jaka.jarvis.ez_market.loader;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;

import com.anthoruiz.jaka.jarvis.ez_market.web.WebApi;
import com.anthoruiz.jaka.jarvis.ez_market.web.model.ProductListWrapper;

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
public class ProductWrapperLoader extends AsyncTaskLoader<ProductListWrapper> {
    private WebApi mApi;

    public ProductWrapperLoader(Context context) {
        super(context);
        mApi = WebApi.ApiHelper.getWebApiInstance();
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        if(isStarted()) {
            forceLoad();
        }
    }

    @Override
    public ProductListWrapper loadInBackground() {
        try {
            return mApi.getProducts().execute().body();
        }catch (Exception ignored){
            return null;
        }
    }
}
