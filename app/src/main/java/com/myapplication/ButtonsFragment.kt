package com.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


/**
 * A simple [Fragment] subclass.
 *
 */
class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button1 = view.findViewById<Button>(R.id.button_1)
        button1.setOnClickListener {
            Toast.makeText(requireContext(), "This is a Toast!", Toast.LENGTH_LONG).show()
        }
        val button2 = view.findViewById<Button>(R.id.button_2)
        button2.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("This is an alert!")
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

    }
}
