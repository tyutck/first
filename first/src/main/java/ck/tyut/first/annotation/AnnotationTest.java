package ck.tyut.first.annotation;

@FirstAnnotation(color="yellow",value="ck",arr={1,2})
public class AnnotationTest {
	@FirstAnnotation("ck")
	public static void main(String[] args){
		if(AnnotationTest.class.isAnnotationPresent(FirstAnnotation.class)){
			FirstAnnotation annotation = AnnotationTest.class.getAnnotation(FirstAnnotation.class);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(annotation.arr().length);
			System.out.println(annotation.enums().name());
			System.out.println(annotation.annotation().value()[0].name());
		}
	}
}
