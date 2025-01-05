package com.alexius.talktale.presentation.navgraph_entry

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.alexius.core.data.manager.AuthResponse
import com.alexius.core.util.UIState
import com.alexius.talktale.presentation.navgraph.Route
import com.alexius.talktale.presentation.onboarding.OnboardingScreen
import com.alexius.talktale.presentation.sign_user.SignInScreen
import com.alexius.talktale.presentation.sign_user.SignViewModel
import com.alexius.talktale.ui.theme.TalkTaleTheme

@Composable
fun NavGraphEntry(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    val viewModel: SignViewModel = hiltViewModel()

    NavHost(
        startDestination = Route.OnBoardingDisplay.route,
        navController = navController,
    ){
        navigation(
            route = Route.OnBoardingDisplay.route,
            startDestination = Route.OnBoardingScreen.route
        ){
            composable(
                route = Route.OnBoardingScreen.route
            ){
                OnboardingScreen(
                    onSignInButtonClick = {
                        navController.navigate(Route.SignInScreen.route) {
                            launchSingleTop = true
                        }
                    },
                    onSignUpButtonClick = {
                        navController.navigate(Route.SignDisplay.route) {
                            launchSingleTop = true
                        }
                    }
                )
            }
        }

        navigation(
            route = Route.SignDisplay.route,
            startDestination = Route.SignUpScreen.route
        ){
  
            composable(
                route = Route.SignUpScreen.route
            ){
                /*SignUpScreen(
                    onSignInButtonClick = {
                        navController.navigate(Route.SignInScreen.route)
                    }
                )*/
            }

            composable(
                route = Route.SignInScreen.route
            ){

                if (viewModel.uiStateSignIn.value is UIState.Error){
                    val errorMessage = (viewModel.uiStateSignIn.value as UIState.Error).errorMessage
                    Toast.makeText(LocalContext.current, "Error: $errorMessage", Toast.LENGTH_SHORT).show()
                }

                SignInScreen(
                    event = viewModel::onEvent,
                    state = viewModel.signInState.value,
                    uiState = viewModel.uiStateSignIn.value,
                    onSignUpButtonClick = {
                        navController.navigate(Route.SignUpScreen.route) {
                            launchSingleTop = true
                        }
                    },
                )
            }
        }

    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun NavGraphEntryPrev() {
    TalkTaleTheme {
        NavGraphEntry()
    }
}