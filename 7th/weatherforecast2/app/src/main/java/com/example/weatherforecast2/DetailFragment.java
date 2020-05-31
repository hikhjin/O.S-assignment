package com.example.weatherforecast2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.loyid.weatherforecast.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle data = getArguments();
        String detailData = null;
        if (data != null) {
            detailData = data.getString("data");
        }

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView detailTextView = (TextView)rootView.findViewById(R.id.detail_textview);
        detailTextView.setText(detailData);

        return rootView;
    }

}
