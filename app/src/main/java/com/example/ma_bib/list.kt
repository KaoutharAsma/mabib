package com.example.ma_bib


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView





class list : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_list, container, false)
        var bool = arguments?.getBoolean("tablet")
        var c = R.id.contaner
        if (bool == false){
             c = R.id.contaner
        }else if (bool == true ){
             c = R.id.c2
        }
        val book1 = v.findViewById<View>(R.id.book1) as ImageView
        val book2 = v.findViewById<View>(R.id.book2) as ImageView
        val book3 = v.findViewById<View>(R.id.book3) as ImageView
        val book4 = v.findViewById<View>(R.id.book4) as ImageView

        book1.setOnClickListener {
            val fragment = detail.newInstance(
                "le problème des idées dans le monde musulman",
                "Malek Bennabi",
                R.drawable.writer1,
                "Dans Le problème des idées dans le monde musulman, Malek Bennabi montre la primordialité de l'idée," +
                        " en tant que force, en tant que dynamique. ... Sans l'idée, il n'y a que déchéance, et c'est ce qui a " +
                        "fait le défaut de l'homme musulman qui a préféré s'attacher au monde des choses plutôt qu'au monde des idées."
            )

            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }




        book2.setOnClickListener {
            val fragment = detail.newInstance(
                "le problème de la culture",
                "Malek Bennabi",
                R.drawable.writer1,
                "Ce livre, paru en version arabe au Caire en juin 1959, se compose d’une introduction et de quatre parties : " +
                        "Psychanalyse de la culture », Psychosynthèse de la culture, Coexistence des cultures et Culture et mondialisme"   )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        book3.setOnClickListener {
            val fragment = detail.newInstance(
                "La Ferme des animaux",
                "George Orwell",
                R.drawable.writer2,
                "La Ferme des animaux est un roman court de George Orwell, publié en 1945. Découpé en dix chapitres," +
                        " il décrit une ferme dans laquelle les animaux se révoltent, prennent le pouvoir et chassent les hommes."       )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        book4.setOnClickListener {
            val fragment = detail.newInstance(
                "1984",
                "George Orwell",
                R.drawable.writer2,
                "Il décrit une Grande-Bretagne trente ans après une guerre nucléaire entre l'Est et l'Ouest censée avoir eu lieu dans les années 1950 " +
                        "et où s'est instauré un régime de type totalitaire fortement inspiré à la fois du stalinisme et de certains éléments du nazisme1,2. " +
                        "La liberté d'expression n’existe plus. Toutes les pensées sont minutieusement surveillées, et d’immenses affiches sont placardées dans les rues, " +
                        "indiquant à tous que Big Brother vous regarde" )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return v
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "List des livres"
    }

    companion object {

        @JvmStatic
        fun newInstance(isTablet:Boolean) = list().apply {
            arguments = Bundle().apply {
                putBoolean("tablet",isTablet)
            }
        }
    }


}
