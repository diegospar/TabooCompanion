package com.example.taboocompanion.teams.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.taboocompanion.R
import com.example.taboocompanion.databinding.FragmentHomeBinding
import com.example.taboocompanion.databinding.FragmentTeamsBinding
import com.example.taboocompanion.teams.viewModel.TeamsViewModel

class TeamsScreen : Fragment() {

    private lateinit var viewModel: TeamsViewModel
    private lateinit var binding: FragmentTeamsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teams, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[TeamsViewModel::class.java]
        binding = FragmentTeamsBinding.bind(view)
        initializeViews()
    }

    private fun initializeViews(){
        binding.topAppBar.setNavigationOnClickListener {
            view?.findNavController()?.navigate(R.id.action_teamsScreen_to_homeScreenFragment)
        }
    }

}