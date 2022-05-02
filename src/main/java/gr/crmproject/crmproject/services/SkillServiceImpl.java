package gr.crmproject.crmproject.services;

import gr.crmproject.crmproject.exceptions.SkillNotFoundException;
import gr.crmproject.crmproject.models.Skills;
import gr.crmproject.crmproject.repository.ApplicantSkillsRepository;
import gr.crmproject.crmproject.repository.SkillsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    Logger logger = LoggerFactory.getLogger(SkillServiceImpl.class);
    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private ApplicantSkillsRepository applicantSkillsRepository;


    @Override
    public List<Skills> getSkills() {
        return skillsRepository.findAll();

    }

    @Override
    public Skills addSkills(Skills skills) {

        return skillsRepository.save(skills);
    }

    @Override
    public Skills updateSkills(int skillId,  String name) throws SkillNotFoundException {
        Skills skillinDB = skillsRepository
                .findById(skillId)
                .orElseThrow(() -> new SkillNotFoundException("Skill Not Found."));
        if (name == null) skillinDB.setName(skillinDB.getName()); else skillinDB.setName(name);
        skillsRepository.save(skillinDB);
        return skillinDB;
    }

    @Override
    public boolean deleteSkills(int skillId) throws SkillNotFoundException {
        skillsRepository
                .deleteById(skillId);
        return true;
    }

    @Override
    public Skills getSkillById(int skillsId) throws SkillNotFoundException {
        return skillsRepository
                .findById(skillsId)
                .orElseThrow(() -> new SkillNotFoundException("Couldn't find any skill based on this ID"));
    }

}