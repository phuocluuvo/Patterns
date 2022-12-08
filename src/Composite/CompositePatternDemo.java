package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositePatternDemo {
	public static void main(String[] args) {
		FileComponent file1 = new FileLeaf("file 1", 10);
		FileComponent file2 = new FileLeaf("file 2", 5);
		FileComponent file3 = new FileLeaf("file 3", 12);
		FileComponent file31 = new FileLeaf("file 3.1", 12);

		List<FileComponent> files = new ArrayList<FileComponent>();
		files.add(file1);
		files.add(file3);
		files.add(file2);
		files.add(file31);

		List<FileComponent> files2 = new ArrayList<FileComponent>();
		files2.add(file1);
		files2.add(file3);
		files2.add(file2);
		files2.add(file31);

		FileComposite folder = new FileComposite(files);
		FileComposite folder2 = new FileComposite(files2);
		folder.add(folder2);
		folder.showProperty();
		System.out.println("Total Size: " + folder.totalSize());
//		FileComposite CEO = new FileComposite("John", 1, 30000);
//		FileComposite headSales = new FileComposite("Robert", 2, 20000);
//		FileComposite headMarketing = new FileComposite("Michel", 2, 20000);
//		FileComposite clerk1 = new FileComposite("Laura", 3, 10000);
//		FileComposite clerk2 = new FileComposite("Bob", 3, 10000);
//		FileComposite salesExecutive1 = new FileComposite("Richard", 3, 10000);
//		FileComposite salesExecutive2 = new FileComposite("Rob", 3, 10000);
//		FileComposite laocong = new FileComposite("Robie", 4, 10000);
//		CEO.add(headSales);
//		CEO.add(headMarketing);
//		
//		headSales.add(salesExecutive1);
//		headSales.add(salesExecutive2);
//		
//		headMarketing.add(clerk1);
//		headMarketing.add(clerk2);
//		
//		clerk1.add(laocong);
//		
//		//print all employees of the organization
//		System.out.println(CEO);
//		for (FileComposite headEmployee : CEO.getFiles()) {
//			System.out.println(headEmployee);
//			for (FileComposite fileComposite : headEmployee.getFiles()) {
//				System.out.println(fileComposite);
//				for (FileComposite secondFileComposite : fileComposite.getFiles()) 
//					System.out.println(secondFileComposite);
//				
//			}
//		}
	}
}