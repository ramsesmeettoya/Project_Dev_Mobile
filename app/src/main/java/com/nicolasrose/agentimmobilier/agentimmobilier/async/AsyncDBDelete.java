package com.nicolasrose.agentimmobilier.agentimmobilier.async;

import android.os.AsyncTask;

import com.nicolasrose.agentimmobilier.agentimmobilier.db.RealEstateDao;
import com.nicolasrose.agentimmobilier.agentimmobilier.model.RealEstate;

public class AsyncDBDelete extends AsyncTask<RealEstate, Void, Void> {

    private RealEstateDao dao;

    public AsyncDBDelete(RealEstateDao dao) {
        this.dao = dao;
    }

    @Override
    protected Void doInBackground(RealEstate... realEstates) {
        dao.deleteRealEstate(realEstates);
        return null;
    }
}
