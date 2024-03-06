package mx.unam.fi.corrutinasapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){
    var resultState by mutableStateOf("")
        private set

    fun bloqueoApp(){
        Thread.sleep(5000)
        resultState = "Respuesta de la web o API"
    }

}