package com.maicon.controlecontas;

import android.os.Bundle;
import org.apache.cordova.*;

public class ControleDeContas extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl(Config.getStartUrl());
    }
}

