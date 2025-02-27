package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    var title: String = "",
    var description: String = "",
    @DrawableRes var image: Int = R.drawable.onboarding1
) {
}

val pages = listOf(
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nulla justo, consectetur ut nisi vel",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nulla justo, consectetur ut nisi vel",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Lorem ipsum dolor sit amet",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean nulla justo, consectetur ut nisi vel",
        image = R.drawable.onboarding3
    ),
)