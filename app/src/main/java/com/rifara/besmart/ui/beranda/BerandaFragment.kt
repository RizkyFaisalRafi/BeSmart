package com.rifara.besmart.ui.beranda

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.rifara.besmart.R
import com.rifara.besmart.databinding.FragmentBerandaBinding

class BerandaFragment : Fragment() {

//    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

    private lateinit var binding: FragmentBerandaBinding
//    private lateinit var viewModel: VillageViewModel
//    private lateinit var _viewmodelPreferences: PreferencesViewModel
//    private lateinit var adapter: VillageListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBerandaBinding.inflate(inflater, container, false)


        return binding.root
    }



}