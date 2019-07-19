package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateCourseAndReviewsDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {			
			// start a transaction
			session.beginTransaction();

			// create a course
			Course tempCourse = new Course("The Witcher 3 - How to play as a witcher");
			
			// add some reviews
			tempCourse.addReview(new Review("Best Course Ever... The Witcher is an amazing game"));
			tempCourse.addReview(new Review("So so, the course is good"));
			tempCourse.addReview(new Review("Terrible, i want my money back"));

			// save the course ... and leverage the cascade all :-)
			System.out.println("Saving the course");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
			
			session.save(tempCourse);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			session.close();
			
			factory.close();
		}
	}

}
