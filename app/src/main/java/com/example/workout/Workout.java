package com.example.workout;

public class Workout {
    public String name;
    public String description;

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Workout[] arrWorkouts = {
            new Workout("The Limb Loosener", "Handstand push-ups\n legged squats\n Pull ups"),
            new Workout("Core Agony", "Pull up\nPush ups\nSit ups\nSquats"),
            new Workout("The Wimp Special", "Pull ups\nPush ups\nSquats"),
            new Workout("Strength and Length", "500 meter run\nkettleball swing\nPull ups")
    };
}
