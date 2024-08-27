package CSC212;

public class Exam_2_Q7 {

    // 1.
    private double sideA,sideB,sideC;

    // 2.
    public Exam_2_Q7(double side){
        sideA = side;
        sideB = side;
        sideC = side;
    }

    // 3.
    public Exam_2_Q7(double s1, double s2, double s3){
        sideA = s1;
        sideB = s2;
        sideC = s3;
    }

    // 4.
    public double perimeter(){
        //double p = sideA + sideB + sideC;
        return sideA + sideB + sideC;
    }


}
