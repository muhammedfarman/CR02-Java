public class IntervalWorkout {
    private String[] exercises;
    private int breakTime;
    private int totalRounds;

    public IntervalWorkout(String[] exercises, int breakTime, int totalRounds) {
        this.exercises = exercises;
        this.breakTime = breakTime;
        this.totalRounds = totalRounds;
    }

    public int getBreaktime() {
        return breakTime;
    }
    public void createIntervalWorkout() {
        System.out.println("***************************** \n" +
                "Interval Workout STARTS !!!!\n" +
                "*****************************");

        for(int i = 1; i <= this.totalRounds; i++) {
            System.out.println("ROUND: " + i);
            for(int j = 0; j < exercises.length; j++ ) {
                System.out.println("- "+this.exercises[j]);
            }

            // filter

            if (i < this.totalRounds) {
                System.out.println(" =============================\n" +
                        "DO THE BREAK (" + getBreaktime() + ")\n" +
                        "=============================");

            }
        }



        System.out.println("*****************************\n" +
                " CONGRATS - YOU ARE DONE !!!\n" +
                "*****************************");

    }
}