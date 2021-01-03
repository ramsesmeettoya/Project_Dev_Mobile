package com.nicolasrose.agentimmobilier.agentimmobilier.async;

import android.os.AsyncTask;

import com.nicolasrose.agentimmobilier.agentimmobilier.db.RealEstateDao;
import com.nicolasrose.agentimmobilier.agentimmobilier.model.RealEstate;

public class AsyncDBUpdate extends AsyncTask<RealEstate, Void, Void> {

    private RealEstateDao dao;

    public AsyncDBUpdate(RealEstateDao dao) {
        this.dao = dao;
    }

    @Override
    protected Void doInBackground(RealEstate... realEstates) {
        dao.updateRealEstate(realEstates);
        return null;
    }
}
