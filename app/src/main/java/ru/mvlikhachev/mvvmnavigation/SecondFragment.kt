package ru.mvlikhachev.mvvmnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onStart() {
        super.onStart()

        secondNextButton.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        secondBackButton.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

}