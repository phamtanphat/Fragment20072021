package com.example.fragment20072021;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment20072021.databinding.FragmentIosBinding;


public class IosFragment extends Fragment {

    FragmentIosBinding mBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding = FragmentIosBinding.inflate(inflater,container,false);
        return mBinding.getRoot();
    }
}