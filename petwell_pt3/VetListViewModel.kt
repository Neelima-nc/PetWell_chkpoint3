package com.example.petwell.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.petwell.data.Vet

class VetListViewModel(private val state: SavedStateHandle) : ViewModel() {
    var lastFilter: String? = state["lastFilter"]
        set(value) {
            field = value
            state["lastFilter"] = value
        }
    var vetList: List<Vet> = state["vetList"] ?: emptyList()
        set(value) {
            field = value
            state["vetList"] = value
        }
}
