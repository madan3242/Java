/**
 * IfThen
 */
public class IfThen {

    void applyBrakes() {
        // the "if" clause: bicycle must be moving
        if (isMoving){
            // the "then" clause: decrease current speed
            currentSpeed--;
        }
    }
    
    void applyBrakes() {
        // same as above, but without braces
        if (isMoving)
            currentSpeed--;
    }
    
}