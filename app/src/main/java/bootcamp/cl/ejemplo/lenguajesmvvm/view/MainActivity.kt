package bootcamp.cl.ejemplo.lenguajesmvvm.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import bootcamp.cl.ejemplo.lenguajesmvvm.databinding.ActivityMainBinding
import bootcamp.cl.ejemplo.lenguajesmvvm.viewmodel.LenguajeViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding:ActivityMainBinding
    private val lenguajeViewModel : LenguajeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        lenguajeViewModel.lenguaje.observe(this, Observer {
            mainBinding.descripcionLenguaje.text = it.descripcion
            mainBinding.nombreLenguaje.text= it.nombre
        })

       mainBinding.viewContainer.setOnClickListener { lenguajeViewModel.randomLenguaje() }

    }
}