package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Post post1 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
		Post post2 = new Post(LocalDateTime.parse("2018-07-28T23:14:19"),"Good night guys","See you tomorrow",5);
		
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1.getTitle());
		System.out.println(post1.getLikes() + " Likes - " + fmt.format(post1.getMoment()));
		System.out.println(post1.getContent());
		post1.printComments();
		
		System.out.println();
		System.out.println(post2.getTitle());
		System.out.println(post2.getLikes() + " Likes - " + fmt.format(post2.getMoment()));
		System.out.println(post2.getContent());
		post2.printComments();
		
	}

}
