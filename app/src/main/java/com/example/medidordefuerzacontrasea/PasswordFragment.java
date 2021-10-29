package com.example.medidordefuerzacontrasea;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medidordefuerzacontrasea.databinding.FragmentPasswordBinding;
import com.example.medidordefuerzacontrasea.presenter.ContrasenaFortalezaPresenter;
import com.example.medidordefuerzacontrasea.presenter.PresenterFortaleza;
import com.example.medidordefuerzacontrasea.view.ContrasenaView;

public class PasswordFragment extends Fragment implements ContrasenaView {
    private FragmentPasswordBinding binding;
    private PresenterFortaleza presenterFortaleza;

    public PasswordFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initBinding(inflater, container);
        initPresenter();
        setupTextChangedListener();
        return binding.getRoot();
    }

    private void setupTextChangedListener() {
        binding.etContrasena.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                presenterFortaleza.procesarContraseña(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    private void initBinding(LayoutInflater inflater, ViewGroup container) {

        binding = FragmentPasswordBinding.inflate(inflater, container, false);

    }


    private void initPresenter() {

        presenterFortaleza = new ContrasenaFortalezaPresenter(this);

    }

    @Override
    public void showColorRed() {
        binding.etContrasena.setBackgroundColor(Color.RED);
    }

    @Override
    public void showColorYellow() {
        binding.etContrasena.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public void showColorGreen() {
        binding.etContrasena.setBackgroundColor(Color.GREEN);
    }

    @Override
    public void showColorWhite() {
        binding.etContrasena.setBackgroundColor(Color.WHITE);
    }
}
