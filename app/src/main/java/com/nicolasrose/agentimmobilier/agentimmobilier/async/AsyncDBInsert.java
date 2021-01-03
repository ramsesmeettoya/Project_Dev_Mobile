package com.nicolasrose.agentimmobilier.agentimmobilier.async;

import android.os.AsyncTask;

import com.nicolasrose.agentimmobilier.agentimmobilier.db.RealEstateDao;
import com.nicolasrose.agentimmobilier.agentimmobilier.model.RealEstate;

public class AsyncDBInsert extends AsyncTask<RealEstate, Void, Void> {

    private RealEstateDao dao;

    public AsyncDBInsert(RealEstateDao dao) {
        this.dao = dao;
    }

    @Override
    protected Void doInBackground(RealEstate... realEstates) {
        dao.insertRealEstate(realEstates);
        return null;
    }
}
