package odev3;

public class Main {

	public static void main(String[] args) {

		Instructor instructor = new Instructor();
		instructor.fullName = "Engin Demiro�";

		Student student = new Student();
		student.fullName = "Serpil Y�ksel";

		UserManager userManager = new UserManager();
		userManager.singIn(student);
		userManager.signUp(instructor);
		userManager.profiliDuzenle(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.yeniKampEkleSil();

		StudentManager studentManager = new StudentManager();
		studentManager.uyelikleriYonet();
	}

}
