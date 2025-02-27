package com.loc.newsapp.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.loc.newsapp.R
import com.loc.newsapp.presentation.Dimens.MediumPadding1
import com.loc.newsapp.presentation.Dimens.MediumPadding2
import com.loc.newsapp.presentation.onboarding.Page
import com.loc.newsapp.presentation.onboarding.pages
import com.loc.newsapp.ui.theme.NewsAppTheme

@Composable
fun OnboardingPage(
    modifier: Modifier = Modifier,
    page: Page = Page()
) {

    Column(
        modifier = modifier,
    ) {
        Image(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(
                    fraction = .6f
                ),
            painter = painterResource(
                id = page.image,
            ),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Spacer(
            modifier = Modifier.height(
                height = MediumPadding1
            )
        )

        Text(
            modifier = Modifier.padding(
                horizontal = MediumPadding2
            ),
            text = page.title,
            style = MaterialTheme.typography.displaySmall.copy(
                fontWeight = FontWeight.Bold
            ),
            color = colorResource(
                id = R.color.display_small
            )
        )

        Text(
            modifier = Modifier.padding(
                horizontal = MediumPadding1
            ),
            text = page.description,
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(
                id = R.color.text_medium
            )
        )
    }
}

@Preview(showBackground = true)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun PreviewOnboardingPage() {
    NewsAppTheme {
        OnboardingPage(
            page = pages[0]
        )
    }
}