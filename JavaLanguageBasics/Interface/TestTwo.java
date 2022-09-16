interface A{

}
interface B{

}
interface C extends A, B{
    // interface can extend n num of interface
}
class D{

}
public class TestTwo extends D implements A, B{
    
}
