package com.example.shan.viewpagerdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Manufacturer extends Fragment {
    private TextView mTextViewId, mTextViewName, mTextViewAddress;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_manufacturer, container,
                false);

        Bundle bundle =  this.getArguments();
        mTextViewId = view.findViewById(R.id.textViewId);
        mTextViewName = view.findViewById(R.id.textViewName);
        mTextViewAddress = view.findViewById(R.id.textViewAddress);

        mTextViewId.setText( bundle.getString("id") );
        mTextViewName.setText( bundle.getString("name") );
        mTextViewAddress.setText( bundle.getString("address") );

        return view;
    }
}
