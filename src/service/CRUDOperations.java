package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		for(Blog blog1:list) {
				System.out.println("BlogTitle: "+blog1.getBlogTitle());
				System.out.println("BlogDescription: "+blog1.getBlogDescription());
				System.out.println("Blog Created Date: "+blog1.getDate());
		}
		return list;
	}
	public List<Blog> viewBlog(Blog blog) throws IOException{
		List<Blog> list1=new ArrayList<Blog>();
		for(Blog blog1:list) {
			if(blog1==blog) {
				list1.add(blog1);
				System.out.println("BlogTitle"+list1.get(0).getBlogTitle());
				System.out.println("BlogDescription"+list1.get(0).getBlogDescription());
				System.out.println(list1.get(0).getDate());
			}
		}
		return list1;
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
	return null;
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		System.out.println("The deleted blog");
		System.out.println("BlogTitle"+blog.getBlogTitle());
		System.out.println("BlogDescription"+blog.getBlogDescription());
		System.out.println("Blog Date: "+blog.getDate());
		list.remove(blog);
		return list;	
	}
}
