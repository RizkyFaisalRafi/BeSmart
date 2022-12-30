package com.rifara.besmart.ui.onboarding

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rifara.besmart.R
import com.rifara.besmart.databinding.FragmentScreenOneBinding

class ScreenThreeFragment : Fragment() {

    private lateinit var _binding : FragmentScreenOneBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScreenOneBinding.inflate(layoutInflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.apply {
            onboardingTitle.text = "Learning"
            onboardingSubtitle.text = "Terdapat 4 alur belajar diantaranya\n" +
                    "Android, Website, UI/UX dan \n" +
                    "Bahasa."
            ltImage.setAnimation(R.raw.welcome_on_board1)
            ltImage.repeatCount = ValueAnimator.INFINITE
            ltImage.playAnimation()
        }
    }


}