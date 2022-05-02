package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.models.ApplicantSkills;
import gr.crmproject.crmproject.repository.ApplicantSkillsRepository;
import gr.crmproject.crmproject.repository.SkillsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ApplicantSkillsServiceImpl implements ApplicantSkillsService {

    Logger logger = LoggerFactory.getLogger(ApplicantSkillsServiceImpl.class);
    @Autowired
    private ApplicantSkillsRepository applicantSkillsRepository;
    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public List<ApplicantSkills> getApplicantSkills() {
        return applicantSkillsRepository.findAll();
    }

}
