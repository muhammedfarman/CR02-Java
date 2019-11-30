public class Main {
    public static void main(String[] args) {
        Exercise E1 = new Exercise(
                "Push-Ups",
                "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet.\n" +
                        "Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
                30,
                "Floor");

        Exercise E2 = new Exercise(
                "Planks",
                "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart.\n" +
                        "Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",
                90,
                "Floor");

        Exercise E3 = new Exercise(
                "Squats",
                " Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. \n" +
                        "Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",
                45,
                "Standing");

        Exercise E4 = new Exercise(
                "Backward Kick",
                "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.\n" +
                        "Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",
                60,
                "Floor");

        Exercise E5 = new Exercise(
                "Leg Curl",
                "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",
                90,
                "Standing");

        Exercise E6 = new Exercise(
                "Sidewards Back Stretch",
                "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
                60,
                "Standing");


        System.out.println(E1.printExercise() +"\n " + E2.printExercise()+"\n " + E3.printExercise()+"\n " + E4.printExercise()+"\n " + E5.printExercise()+"\n " + E6.printExercise());

        System.out.println("");


        Exercise Earray[] = {E1, E2, E3, E4, E5, E6};
        System.out.println("looping to output: ");
        for(int i = 0; i < Earray.length; i++) {

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(Earray[i].printExercise() + "\n");
            System.out.println("_____________________________________________________________________________");
            System.out.println("");
        }

        // print exes only: floor
        for(int i = 0; i < Earray.length; i++) {
            if (Earray[i].getPosition() == "Floor") {
                System.out.println("Exercises on the floor"+"\n"+ "-------------------------------------------------------------------------");
                System.out.println(Earray[i].printExercise() + "\n" + "_____________________________________________________________________________" + "\n" );


            }
        }

        // print exes only: floor > 60 sec.
        for(int i = 0; i < Earray.length; i++) {
            if(Earray[i].getPosition() == "Floor" && Earray[i].getDuration() > 60) {
                System.out.println("Exercises that are on the floor and take more than a minute\n" +
                        "\n : " + "----------------------------------------------------------------------");
                System.out.println(Earray[i].printExercise()+"\n");

            }
        }
        //Intervalworkout
        String[] iarray = {"Push-ups", "Squats", "Planks"};
        IntervalWorkout in1 = new IntervalWorkout(iarray, 30, 4);
        in1.createIntervalWorkout();
    }
}