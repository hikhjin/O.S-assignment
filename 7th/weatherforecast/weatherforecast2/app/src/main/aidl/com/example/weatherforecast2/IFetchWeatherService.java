package com.example.weatherforecast2;

import android.os.RemoteException;

interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);

    public abstract class Stub {
        public abstract void retrieveWeatherData() throws RemoteException;

        public abstract void registerFetchDataListener(IFetchDataListener listener) throws RemoteException;

        public abstract void unregisterFetchDataListener(IFetchDataListener listener) throws RemoteException;
    }
}