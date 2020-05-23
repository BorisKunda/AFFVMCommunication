package com.boriskunda.affvmcommunication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    val manMld: MutableLiveData<Man> = MutableLiveData()
    val manLd: LiveData<Man> = manMld //todo observe only ld
    val openFrB:SingleLiveEvent<Boolean>  = SingleLiveEvent()   //todo observe only ld

}