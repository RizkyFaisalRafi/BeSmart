package com.rifara.besmart.ui.beranda

import android.animation.ValueAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rifara.besmart.R
import com.rifara.besmart.databinding.FragmentScreenOneBinding
import com.rifara.besmart.databinding.FragmentSlideOneBinding

class SlideOneFragment : Fragment() {

    private lateinit var _binding : FragmentSlideOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSlideOneBinding.inflate(layoutInflater, container, false)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.apply {
//            onboardingTitle.text = "Selamat Bergabung!"
//            onboardingSubtitle.text = "Selamat Datang BeSmarter,\n" +
//                    "Aplikasi Pembelajaran dan\n" +
//                    "Service terbaik."
            ltImage.setImageResource(R.drawable.aa)
//            ltImage.repeatCount = ValueAnimator.INFINITE
//            ltImage.playAnimation()
        }

    }

}