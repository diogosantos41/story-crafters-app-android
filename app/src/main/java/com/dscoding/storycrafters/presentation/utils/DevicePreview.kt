package com.dscoding.storycrafters.presentation.utils

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "phone light",
    device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480",
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Preview(
    name = "tablet light",
    device = "spec:shape=Normal,width=1280,height=800,unit=dp,dpi=480",
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Preview(
    name = "phone dark",
    device = "spec:shape=Normal,width=360,height=640,unit=dp,dpi=480",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "tablet dark",
    device = "spec:shape=Normal,width=1280,height=800,unit=dp,dpi=480",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
annotation class DevicePreview

