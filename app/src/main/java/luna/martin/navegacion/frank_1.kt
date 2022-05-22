package luna.martin.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class frank_1 : Fragment() {

    lateinit var boton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_frank_1, container, false)
        boton = vista.findViewById(R.id.button2)
        boton.setOnClickListener {
            findNavController().navigate(R.id.action_frank_1_to_frank_2)
        }
        return vista
    }
}