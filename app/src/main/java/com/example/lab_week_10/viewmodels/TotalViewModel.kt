package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    // _total bersifat privat dan bisa diubah (Mutable)
    private val _total = MutableLiveData<Int>()

    // 'total' bersifat publik dan hanya bisa dibaca (LiveData)
    // Activity akan meng-observe variabel 'total' ini
    val total: LiveData<Int> = _total

    init {
        _total.value = 0 // Nilai awal
    }

    fun incrementTotal() {
        _total.value = (_total.value ?: 0) + 1
    }
}