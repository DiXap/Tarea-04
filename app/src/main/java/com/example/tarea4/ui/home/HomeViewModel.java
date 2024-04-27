package com.example.tarea4.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> placeholder;

    public HomeViewModel() {
        placeholder = new MutableLiveData<>();
        placeholder.setValue("Perfil del usuario");
    }

    public LiveData<String> getText() {
        return placeholder;
    }
}