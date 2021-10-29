package com.example.medidordefuerzacontrasea.presenter;


import com.example.medidordefuerzacontrasea.view.ContrasenaView;

public class ContrasenaFortalezaPresenter implements PresenterFortaleza {

    private ContrasenaView contrasenaView;

    public ContrasenaFortalezaPresenter(ContrasenaView contrasenaView) {
        this.contrasenaView = contrasenaView;
    }


    @Override
    public Boolean isUpperCase(String contrasena) {

        boolean isUpperCase=false;

        for (int i = 0; i < contrasena.length(); i++) {

            if (Character.isUpperCase(contrasena.charAt(i))) {
                isUpperCase = true;
                break;
            } else {
                isUpperCase = false;
            }
        }
        return isUpperCase;

    }

    @Override
    public void procesarContraseña(String contrasena ) {


        if (contrasena.isEmpty()) {contrasenaView.showColorWhite();
        return;
        }

        boolean mayuscula = isUpperCase(contrasena);

        if (contrasena.length() < 6) {contrasenaView.showColorRed();
        }
        else if (contrasena.length()>=6 && !mayuscula) {
            contrasenaView.showColorYellow();
        }

        else {contrasenaView.showColorGreen();
        }

}
}