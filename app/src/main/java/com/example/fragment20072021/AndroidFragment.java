package com.example.fragment20072021;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment20072021.databinding.FragmentAndroidBinding;

public class AndroidFragment extends Fragment implements DefaultLifecycleObserver {

    FragmentAndroidBinding mBinding;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        requireActivity().getLifecycle().addObserver(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentAndroidBinding.inflate(inflater,container,false);
        Bundle bundle = getArguments();
        if (bundle != null){
            String text = bundle.getString("text");
            mBinding.textViewFragmentAndroid.setText(text);
        }
        return mBinding.getRoot();
    }


}