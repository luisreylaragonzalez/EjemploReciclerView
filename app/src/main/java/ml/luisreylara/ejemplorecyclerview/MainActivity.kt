package ml.luisreylara.ejemplorecyclerview


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

     var lista: RecyclerView? = null

    var layoutManager:RecyclerView.LayoutManager?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val platillos = ArrayList<Platillo>()

        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo01))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo02))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo03))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo04))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo05))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo06))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo07))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo08))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo09))
        platillos.add(Platillo("platillo 1",250.0,3.5F,R.drawable.platillo10))

        lista=findViewById(R.id.lista)
        //Optimizar el rendimiento
        lista?.setHasFixedSize(true)
        //
        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager=layoutManager

     var   adaptador=AdaptadorCustom(this,platillos)
        lista?.adapter=adaptador

    }
}