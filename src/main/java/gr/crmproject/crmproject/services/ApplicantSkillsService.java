package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.models.ApplicantSkills;

import java.util.List;

/**
 * The interface Applicant skills service.
 */
public interface ApplicantSkillsService {

    /**
     * Gets list of all applicants with skills.
     *
     * @return list of all applicants with skills
     */
    List<ApplicantSkills> getApplicantSkills();
  //  ApplicantSkills addApplicantSkills(Skills skills);
}
