import java.util.ArrayList;
import java.util.List;

public class Chapter {
	public String name;
	
	public List<SubChapter> subChapters = new ArrayList<SubChapter>();
	
	public Chapter(String name) {
		super();
		this.name = name;
	}
	
	public void print() {
		System.out.println("Capitol: " + this.name);
	}

	public int createSubChapter(String string) {
		subChapters.add(new SubChapter(string));
		return subChapters.size() - 1;
	}

	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		int counter = 0;
		for(SubChapter e : subChapters) {
			if(counter == indexSubChapterOneOne) {
				return e;
			}
			counter++;
		}
		return null;
	}

}
