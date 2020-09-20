package com.example.animation.home.presentation.model

import androidx.annotation.StringRes
import com.example.animation.R

enum class HomeUiItem(
    @StringRes val title: Int
) {
    DRAWABLE_ANIMATION(R.string.drawable_animation_title),
    ANIMATE_VECTOR_DRAWABLE(R.string.animate_vector_drawable_title),
    SCENES_AND_TRANSITIONS(R.string.scenes_and_transition),
    VIEW_ANIMATIONS(R.string.view_animation),
    PROPERTY_ANIMATION(R.string.property_animation),
    OBJECT_VALUE_ANIMATORS(R.string.object_value_animators),
    ACTIVITY_FRAGMENT_TRANSITIONS(R.string.activity_fragment_transitions),
    SHARED_ELEMENT_TRANSITIONS(R.string.shared_element_transitions),
    CIRCULAR_REVEAL(R.string.circular_reveal),
    LOTTIE(R.string.lottie),
    MOTION_LAYOUT(R.string.motion_layout)
}