package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			
			// start transaction
			session.beginTransaction();
			
			// get instructor detail object
			int id = 3;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, id);
			
			// print the instructor detail
			System.out.println("tempInstructorDetails: " + tempInstructorDetail);
			
			// print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor().getFirstName());
			
			// CODE REFACTOR IF NOT FOUND INSTRUCTOR DETAIL
			id = 999;
			tempInstructorDetail = session.get(InstructorDetail.class, id);
			System.out.println("tempInstructorDetails: " + tempInstructorDetail);
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// handle connection leak issue
			session.close();
			factory.close();
		}
	}

}
