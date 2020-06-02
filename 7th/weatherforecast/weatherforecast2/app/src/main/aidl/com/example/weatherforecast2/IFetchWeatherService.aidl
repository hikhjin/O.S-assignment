// IFetchWeatherService.aidl
package com.example.weatherforecast2;

// Declare any non-default types here with import statements
import com.example.weatherforcast2.IFetchDataListener;

interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);
}