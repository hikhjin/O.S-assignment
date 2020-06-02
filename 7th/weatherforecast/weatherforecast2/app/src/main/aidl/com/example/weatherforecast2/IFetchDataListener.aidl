// IFetchDataListener.aidl
package com.example.weatherforecast2;

// Declare any non-default types here with import statements

interface IFetchDataListener {
    void onWeatherDataRetrieved(out String[] data);
}