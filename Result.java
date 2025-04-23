interface Student {
    void showAcademicScore();
}

interface Sports {
    void showSportsScore();
}

class Result implements Student, Sports {
    private String name;
    private int rollNumber;
    private int academicScore;
    private int sportsScore;
    
    public Result(String name, int rollNumber, int academicScore, int sportsScore) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }

    public void showAcademicScore() {
        System.out.println("Academic Score: " + academicScore);
    }

    public void showSportsScore() {
        System.out.println("Sports Score: " + sportsScore);
    }

    public void showResult() {
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        showAcademicScore();
        showSportsScore();
        System.out.println("==========================");
      }  
    public static void main(String[] args) {
    System.out.println("\n    DISPLAYING RESULT   ");
        Result studentResult = new Result("John", 101, 85, 90);
        studentResult.showResult();
    }
}

