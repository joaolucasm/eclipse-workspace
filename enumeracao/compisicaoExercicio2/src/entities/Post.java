package entities;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Post() {
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public void printComments() {
		System.out.println("Comments:");
		for(Comment c: comments) {
			System.out.println(c.getText());
		}
	}
}
