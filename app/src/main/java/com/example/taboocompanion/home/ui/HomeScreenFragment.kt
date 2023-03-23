package com.example.taboocompanion.home.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.taboocompanion.home.viewModel.HomeScreenViewModel
import com.example.taboocompanion.R
import com.example.taboocompanion.databinding.FragmentHomeBinding

class HomeScreenFragment : Fragment() {

    companion object {
        fun newInstance() = HomeScreenFragment()
    }

    private lateinit var viewModel: HomeScreenViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[HomeScreenViewModel::class.java]
        binding = FragmentHomeBinding.bind(view)
        initializeViews()
        // TODO: Use the ViewModel
    }

    private fun initializeViews(){
        binding.btnTeams.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_homeScreenFragment_to_teamsScreen)
        }
    }

}