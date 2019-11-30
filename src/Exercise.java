public class Exercise {
    private String exerciseName;
    private String description;
    private int duration;
    private String position;

    public Exercise(String exerciseName, String description, int duration, String position) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }


  //for filtering
    public int getDuration() {
        return duration;
    }
    public String getPosition() {
        return position;
    }





    public String printExercise() {
        String output = this.exerciseName + "\n==================" +
                "\nDuration: " + this.duration + " sec." + "\n" +
                "Description: " + this.description + "\n";
        return output;
    }
}