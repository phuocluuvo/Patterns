package Composite;

import java.util.List;

public class FileComposite implements FileComponent {

	private List<FileComponent> files;

	// constructor
	public FileComposite(List<FileComponent> files) {
		this.files = files;
	}

	public void add(FileComposite e) {
		files.add(e);
	}

	public void remove(FileComposite e) {
		files.remove(e);
	}

	int sum = 0;

	@Override
	public long totalSize() {
		long total = 0;
		for (FileComponent file : files) {
			total += file.totalSize();
		}
		return total;
	}

	@Override
	public void showProperty() {
		for (FileComponent file : files) {
			file.showProperty();
		}
	}
}