package com.retos.r1.ui.branch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BranchViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BranchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pronto verás aquí nuestras sucursales");
    }

    public LiveData<String> getText() {
        return mText;
    }
}