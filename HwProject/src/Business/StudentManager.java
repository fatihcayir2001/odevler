package Business;


import Entities.Student;


public class StudentManager extends UserManager {
	public void Add(Student student) {System.out.println("Ogrenci eklendi");}
	public void Update(Student student) {System.out.println("Ogrenci guncellendi");}
	public void Delete(Student student) {System.out.println("Ogrenci silindi");}
	
}
