package com.playfab;

import com.playfab.PlayFabErrors.ErrorCallback;

public class PlayFabSettings {
    public static String SdkVersion = "0.66.180523";
    public static String BuildIdentifier = "jbuild_javasdk_1";
    public static String SdkVersionString = "JavaSDK-0.66.180523";

    public static String TitleId = null; // You must set this value for PlayFabSdk to work properly (Found in the Game Manager for your title, at the PlayFab Website)
    public static ErrorCallback GlobalErrorHandler;
    public static String EntityToken = null; // Set by GetEntityToken
    public static String DeveloperSecretKey = null; // You must set this value for PlayFabSdk to work properly (Found in the Game Manager for your title, at the PlayFab Website)
    public static String ClientSessionTicket = null; // Set by any Client Login Call

    public static String GetURL() {
        return "https://" + TitleId + ".playfabapi.com";
    }
}
