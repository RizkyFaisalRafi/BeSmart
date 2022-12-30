package com.rifara.besmart.ui.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.rifara.besmart.MainActivity
import com.rifara.besmart.R
import com.rifara.besmart.databinding.FragmentOnBoardingBinding
import com.rifara.besmart.ui.adapter.OnBoardingAdapter
import timber.log.Timber

class OnBoardingFragment : Fragment() {

    private lateinit var _binding: FragmentOnBoardingBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity?.onBackPressedDispatcher?.addCallback(
            this, // lifecycle Owner
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    // Back is pressed... Finishing the activity
                    activity?.finish()
                }
            }
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return _binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = arrayListOf(
            ScreenOneFragment(),
            ScreenTwoFragment(),
            ScreenThreeFragment()
        )

        val adapter = OnBoardingAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        _binding.apply {
            viewPager2.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager2) { _, _ ->

            }.attach()
        }

        initializeViewPager()


    }

    private fun initializeViewPager() {
        with(_binding) {

            viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {

                    if (position == 2) {
                        Timber.d("cek status onboard")
                        btnNext.text = "Get Started"
                        btnNext.setOnClickListener {
                            val moveIntent = Intent(requireContext(), MainActivity::class.java)
                            startActivity(moveIntent)
                            activity?.finish()
                        }
                    } else {
                        btnNext.text = "Next"
                        btnNext.setOnClickListener {
                            viewPager2.currentItem += 1
                        }
                    }
                    super.onPageSelected(position)

                }
            })

            Timber.d("cek status ${viewPager2.currentItem}")
        }
    }

}