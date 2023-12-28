package com.dscoding.storycrafters.ui.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.dscoding.storycrafters.ui.navigation.NavActions
import com.dscoding.storycrafters.ui.utils.DevicePreview

@Composable
fun DashboardScreen(navActions: NavActions) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(15.dp)
    ) {
        Spacer(
            modifier = Modifier
                .weight(1f)
        )
        Button(
            onClick = navActions.goToCreateStoryScreen,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                color = Color.White,
                text = "Create Story",
                style = MaterialTheme.typography.titleSmall
            )
        }
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Button(
            onClick = navActions.goToSavedStoriesScreen,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                color = Color.White,
                text = "See saved Stories",
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@DevicePreview
@Composable
fun DashboardScreenPreview() {
    val navController = rememberNavController()
    DashboardScreen(navActions = remember(navController) { NavActions(navController) })
}