package com.ela.sanatevi

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewState
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    val webViewState =
        rememberWebViewState("https://www.instagram.com/ela_sanatevi/?hl=en")
    MaterialTheme {
        WebView(
            state = webViewState,
            modifier = Modifier.fillMaxSize()
        )

    }
}