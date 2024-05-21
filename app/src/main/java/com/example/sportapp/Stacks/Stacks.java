package com.example.sportapp.Stacks;

import java.util.Stack;

public class Stacks {
    private static Stack<String> usernameStack = new Stack<>();
    private static Stack<String> genderStack = new Stack<>();
    private static Stack<String> lose_gainStack = new Stack<>();
    private static Stack<Integer> actual_weightStack = new Stack<>();
    private static Stack<Integer> desired_weightStack = new Stack<>();
    private static Stack<Integer> ageStack = new Stack<>();
    private static Stack<String> heightStack = new Stack<>();
    private static Stack<Integer> hours_of_sleepStack = new Stack<>();
    private static Stack<String> countryStack = new Stack<>();
    private static Stack<String> how_activeStack = new Stack<>();
    private static Stack<String> when_activeStack = new Stack<>();
    private static Stack<String>  health_problemsStack = new Stack<>();

    public static void pushToUsernameStack(String value) {
        usernameStack.push(value);
    }
    public static void pushToGenderStack(String value) {
        genderStack.push(value);
    }
    public static void pushToLoseGainStack(String value) {
        lose_gainStack.push(value);
    }
    public static void pushToActualWeightStack(Integer value) {
        actual_weightStack.push(value);
    }
    public static void pushToDesiredWeightStack(Integer value) {
        desired_weightStack.push(value);
    }
    public static void pushToAgeStack(Integer value) {
        ageStack.push(value);
    }
    public static void pushToHeightStack(String value) {
       heightStack.push(value);
    }
    public static void pushToHoursOfSleepStack(Integer value) {
        hours_of_sleepStack.push(value);
    }
    public static void pushToCountryStack(String value) {
        countryStack.push(value);
    }
    public static void pushToHowActiveStack(String value) {
        how_activeStack.push(value);
    }
    public static void pushToWhenActiveStack(String value) {
        when_activeStack.push(value);
    }
    public static void pushToHealthProblemsStack(String value) {
        health_problemsStack.push(value);
    }


    public static String popFromUsernameStack() {
       return  usernameStack.pop();
    }
    public static String popFromGenderStack() {
       return genderStack.pop();
    }
    public static String popFromLoseGainStack() {
        return lose_gainStack.pop();
    }
    public static Integer popFromActualWeightStack() {
        return actual_weightStack.pop();
    }
    public static Integer popFromDesiredWeightStack() {
        return desired_weightStack.pop();
    }
    public static Integer popFromAgeStack() {
        return ageStack.pop();
    }
    public static String popFromHeightStack() {
        return heightStack.pop();
    }
    public static Integer popFromHoursOfSleepStack() {
        return hours_of_sleepStack.pop();
    }
    public static String popFromCountryStack() {
        return countryStack.pop();
    }
    public static String popFromHowActiveStack() {
        return how_activeStack.pop();
    }
    public static String popFromWhenActiveStack() {
        return when_activeStack.pop();
    }
    public static String popFromHealthProblemsStack() {
        return health_problemsStack.pop();
    }

    public static boolean isUsernameStackEmpty() {
        return usernameStack.isEmpty();
    }

    public static boolean isGenderStackEmpty() {
        return genderStack.isEmpty();
    }

    public static boolean isLoseGainStackEmpty() {
        return lose_gainStack.isEmpty();
    }

    public static boolean isActualWeightStackEmpty() {
        return actual_weightStack.isEmpty();
    }

    public static boolean isDesiredWeightStackEmpty() {
        return desired_weightStack.isEmpty();
    }

    public static boolean isAgeStackEmpty() {
        return ageStack.isEmpty();
    }

    public static boolean isHeightStackEmpty() {
        return heightStack.isEmpty();
    }

    public static boolean isHoursOfSleepStackEmpty() {
        return hours_of_sleepStack.isEmpty();
    }

    public static boolean isCountryStackEmpty() {
        return countryStack.isEmpty();
    }

    public static boolean isHowActiveStackEmpty() {
        return how_activeStack.isEmpty();
    }

    public static boolean isWhenActiveStackEmpty() {
        return when_activeStack.isEmpty();
    }

    public static boolean isHealthProblemsStackEmpty() {
        return health_problemsStack.isEmpty();
    }


}
