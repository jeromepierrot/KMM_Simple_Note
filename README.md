# KMM Simple Note - Learning project

This project is for learning purposes about how to build a basic "Note" application \
using Kotlin Multiplatform Project (Android / iOS).

# Requirements

To be able to compile and run the project, you must check you have the necessary tools installed.
Also, to write iOS-specific code and run an iOS application on a simulated or real device, you'll need a Mac with macOS.

## 1. Install the necessary tools

- Android Studio
- XCode [^1]
- JDK (version 11 minimum), check with `java -version` command (Terminal)
- Kotlin Multiplatform Mobile plugin installed (inside Android Studio)[^2]
- Kotlin plugin (inside Android Studio)[^3]
- Command line (Terminal) : Make sure you have all the necessary tools installed:
  - command not found: brew — [install Homebrew](https://brew.sh/).
  - command not found: java — [install Java](https://www.oracle.com/java/technologies/downloads/#java17).

## 2. Check environment using KDoctor tool
(Homebrew is required)
1. Install KDoktor using Homebrew

`brew install kdoctor`

2. call kdoctor fomr the Terminal (console)

3. if KDoctor diagnoses any problems while checking your environment, review the output for issues and possible solutions

    > You may ignore KDoctor's warnings regarding the CocoaPods installation : \
    > In this project, you will use a different iOS framework distribution option which does NOT involved CocoaPods usage.

## 

---
[^1]: Make sure that you have Xcode installed
Launch Xcode in a separate window to accept its license terms and allow it to perform some necessary initial tasks.
In Xcode, select `Settings/Preferences | Locations`. In the **Command Line Tools** field, select **your Xcode**.

[^2]: In Android Studio, select `Settings/Preferences | Plugins`, search `Marketplace for Kotlin Multiplatform Mobile`, and then install it.

[^3]: Should be already installed in Android Studio but you might need to update the plugin :
on the Android Studio welcome screen, select `Plugins | Installed`. Click `Update` next to Kotlin. 
You can also check the Kotlin version in `Tools | Kotlin | Configure Kotlin Plugin Updates`.