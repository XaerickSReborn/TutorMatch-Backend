package com.skillswap.platform.tutormatch.Tutorings.Interfaces.rest.resources;

import com.skillswap.platform.tutormatch.Tutorings.Domain.Model.Entities.DailySchedule;

import java.util.List;

/**
 * Represents the resource for a tutoring session.
 * @param id          the unique identifier of the tutoring session
 * @param title       the title of the tutoring session
 * @param description a brief description of the tutoring session
 * @param price       the price for the tutoring session
 * @param times       a list of available time slots for the tutoring session
 * @param image       a URL or path to the image associated with the tutoring session
 * @param whatTheyWillLearn a description of what students will learn in the tutoring session
 * @param tutorId     the ID of the tutor offering the session
 * @param courseId    the ID of the course related to the tutoring session
 */
public record TutoringSessionResource(
        Long id,
        String title,
        String description,
        Double price,
        List<DailySchedule> times,
        String image,
        String whatTheyWillLearn,
        Long tutorId,
        Long courseId
) {}
