package com.garcestechnology.pauljosephdarsantos.midtermprojecta2;

import java.util.ArrayList;
import android.content.AsyncTaskLoader;
import android.content.Context;

/**
 * Created by pauljosephdarsantos on 2/8/17.
 */

public class Loader extends AsyncTaskLoader<ArrayList<Articles>> {

    private String mUrl;

    public Loader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }


    @Override
    public ArrayList<Articles> loadInBackground() {
        if(mUrl == null){
            return null;
        }

        ArrayList<Articles> articles = Queries.fetchNewsData(mUrl);
        return articles;
    }
}