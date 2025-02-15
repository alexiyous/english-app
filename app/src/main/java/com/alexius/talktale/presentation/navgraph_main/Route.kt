package com.alexius.talktale.presentation.navgraph_main

sealed class Route(
    val route: String,
) {
    object OnBoardingDisplay : Route(route = "onBoardingDisplay")

    object OnBoardingScreen : Route(route = "onBoardingScreen")

    object OnBoarding1Screen : Route(route = "onBoarding1Screen")

    object OnBoarding2Screen : Route(route = "onBoarding2Screen")

    object OnBoarding3Screen : Route(route = "onBoarding3Screen")

    object BridgeToSignInScreen : Route(route = "bridgeToSignInScreen")

    object SignDisplay : Route(route = "signDisplay")

    object SignUpScreen : Route(route = "signUpScreen")

    object SignInScreen : Route(route = "signInScreen")

    object AssessmentNavigation : Route(route = "assessmentNavigation")

    object AssessmentReading : Route(route = "assessmentReading")

    object AssessmentReadingOnboardingScreen : Route(route = "assessmentReadingOnboardingScreen")

    object AssessmentReadingBridgingScreen : Route(route = "assessmentReadingBridgingScreen")

    object AssessmentReadingQuestionScreen : Route(route = "assessmentReadingQuestionScreen")

    object AssessmentListening: Route(route = "assessmentListening")

    object AssessmentListeningBridgeScreen: Route(route = "assessmentListeningBridgeScreen")

    object AssessmentListeningQuestionScreen: Route(route = "assessmentListeningQuestionScreen")

    object AssessmentCalculatingScreen: Route(route = "assessmentCalculatingScreen")

    object AssessmentScoreScreen: Route(route = "assessmentScoreScreen")

    object TalkTaleNavigator: Route(route = "talkTaleNavigator")

    object HomeScreen: Route(route = "homeScreen")

    object StoryScapeLevelScreen: Route(route = "storyScapeLevelScreen")

    object StoryScapeScreen: Route(route = "storyScapeScreen")

    object StoryScapeChooseScreen: Route(route = "storyScapeChooseScreen")

    object StoryAdvancedChooseScreen: Route(route = "storyAdvancedChooseScreen")

    object CareerChooseScreen: Route(route = "careerChooseScreen")

    object StoryScapeBridgingScreen: Route(route = "storyScapeBriefScreen")

    object StoryScapeQuizScreen: Route(route = "storyScapeQuizScreen")

    object StoryScapeEndScreen: Route(route = "storyScapeEndScreen")

    object WordWizardScreen: Route(route = "wordWizardScreen")

    object ReportCardScreen: Route(route = "reportCardScreen")

    object ReportCardQuizScreen: Route(route = "reportCardQuizScreen")

    object ReportCardWordWizardScreen: Route(route = "reportCardWordWizardScreen")

    object ReportCardEndScreen: Route(route = "reportCardEndScreen")

    object ReportCardDisplay: Route(route = "reportCardDisplay")

    object ProfileScreen: Route(route = "profileScreen")

    object AppStartNavigation : Route(route = "appStartNavigation")

    object NavigationEntry : Route(route = "navigationEntry")

    object MainNavigation : Route(route = "mainNavigation")
}