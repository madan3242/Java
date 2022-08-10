
public class MultipleClass{
	public static void main(String[] args){
		System.out.println(GenerateMessage.generateMessage());
		System.out.println(AnotherMessage.generateMessage());
	}
}

class GenerateMessage{
static String generateMessage() {
	return "Here is one message";
	}
}
class AnotherMessage{
static String generateMessage() {
	return "Here is another message";
	}
}
