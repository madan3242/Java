
public class CallngMethodsNdConstructors {
    public double computePayment(
                  double loanAmt,
                  double rate,
                  double futureValue,
                  int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), 
                        - numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator)
                        - ((futureValue * partial1) / denominator);
        return answer;
    }
    // public Polygon polygonFrom(Point[] corners) {
    //     // method body goes here
    // }
    
    // Arbitrary Number of Arguments
    // varargs
    // public Polygon polygonFrom(Point... corners) {
    //     int numberOfSides = corners.length;
    //     double squareOfSide1, lengthOfSide1;
    //     squareOfSide1 = (corners[1].x - corners[0].x)
    //                      * (corners[1].x - corners[0].x) 
    //                      + (corners[1].y - corners[0].y)
    //                      * (corners[1].y - corners[0].y);
    //     lengthOfSide1 = Math.sqrt(squareOfSide1);
    
    //     // more method body code follows that creates and returns a 
    //     // polygon connecting the Points
    // }
    
    public static void main(String[] args) {
        
    }  
}
