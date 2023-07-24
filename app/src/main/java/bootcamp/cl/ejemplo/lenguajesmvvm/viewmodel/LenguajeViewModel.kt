package bootcamp.cl.ejemplo.lenguajesmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bootcamp.cl.ejemplo.lenguajesmvvm.model.LenguajeModel
import bootcamp.cl.ejemplo.lenguajesmvvm.model.LenguajeProvider

class LenguajeViewModel: ViewModel() {

    val lenguajeModel = MutableLiveData<LenguajeModel>()
    fun randomLenguaje(){
        val lenguajeActual = LenguajeProvider.random()
        lenguajeModel.postValue(lenguajeActual)
    }

}