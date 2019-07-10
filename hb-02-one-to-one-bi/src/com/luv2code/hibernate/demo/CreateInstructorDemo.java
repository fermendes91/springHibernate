package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// create the objects
			Instructor tempInstructor = new Instructor("Fernando", "Mendes", "fernando.mendes@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com/fernandomendes", "Guitar!");
			
			Instructor tempInstructor2 = new Instructor("Thaysa", "Maciel", "thay.m@luv2code.com");
			InstructorDetail tempInstructorDetail2 = new InstructorDetail("http://www.youtube.com/thaym", "MAKE UP!");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			tempInstructor2.setInstructorDetail(tempInstructorDetail2);
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			// Note: this will ALSO save the details object because of CascadeType.ALL
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			session.save(tempInstructor2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}
	}

}
